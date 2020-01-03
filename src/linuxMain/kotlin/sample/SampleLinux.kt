package sample

import kotlinx.cinterop.*
import libgtk3.*
import platform.posix.*
import sample.GtkHelpers.Application
import sample.SharedPreferences.getSharedPreferences


class SampleLinux(s: String, gApplicationFlagsNone: GApplicationFlags) : Application(s, gApplicationFlagsNone) {

    override fun onActivate(app: CPointer<GtkApplication>) {
        setContentView("/org/gtk/example/layout/main.ui")


        val window = gtk_application_get_active_window(application)
        gtk_window_set_title(window, "Weather")



        val preferences = getSharedPreferences()


        val currentSelected = "London"

        val location_list = gtk_builder_get_object(builder, "location_list")
        gtk_model_button_new().apply {
            g_object_set (this?.reinterpret(), "text", currentSelected, NULL);
            gtk_container_add(location_list?.reinterpret(), this)
            gtk_widget_show(this)
        }


        val location_btn = gtk_builder_get_object(builder, "button1")?.reinterpret<GtkWidget>()
        location_btn.connect("clicked") {
            println("damini")
            val popover = gtk_builder_get_object(builder, "location_menu")
            val dialog = gtk_builder_get_object(builder, "add_location_dialog")
            gtk_builder_get_object(builder, "add_new").apply {
                connect("clicked") {
                    gtk_widget_show(dialog?.reinterpret())
                }

                val editView = gtk_builder_get_object(builder, "find_location")
                val completion = gtk_entry_completion_new ();
                gtk_entry_set_completion (editView?.reinterpret(), completion)
                g_object_unref (completion)


                val add_btn = gtk_builder_get_object(builder, "add_btn")
                add_btn.connect("clicked") {
                    gtk_entry_get_text(editView?.reinterpret())?.toKString()?.let {
                        setLocation(builder, it)
                    }
                }



                editView.connect("changed") {
                    val entry_text = gtk_entry_get_text(editView?.reinterpret())?.toKString()
                    createThread {
                        val result = curl_read_all_content("https://www.metaweather.com/api/location/search/?query=$entry_text")

                        //val completion_model = GtkStringList("Entry1", "Entry2", "Entry3", "Entry1", "Entry2", "Entry3")

                        val completion_model = gtk_list_store_new (1, G_TYPE_STRING)
                        memScoped {
                            val iter = alloc<GtkTreeIter>()
                            JSON(result!!).asArray().forEachObjets {
                                gtk_list_store_append(completion_model, iter.ptr)
                                gtk_list_store_set(completion_model, iter.ptr, 0, it.getString("title"), -1)
                            }
                        }

                        gtk_ideal {
                            gtk_entry_completion_set_model (completion, completion_model?.reinterpret());
                            g_object_unref (completion_model);
                            gtk_entry_completion_set_text_column(completion, 0)
                        }
                    }
                }
                setLocation(builder, "London")
            }

            gtk_widget_show(popover?.reinterpret())
            gtk_widget_set_visible(popover?.reinterpret(), TRUE)
        }


    }




    fun setLocation(builder: CPointer<GtkBuilder>?, place: String) {
        createThread {
            val woeid = WeatherAPI.queryLocation(place)
            val weekForcast = WeatherAPI.getWeatherInfo(woeid.get(0).woeid)

            val todayInfo = weekForcast.get(0)

            gtk_ideal {
                gtk_label_set_text(gtk_builder_get_object(builder, "the_temp")?.reinterpret(), "${todayInfo.currentTemp.toInt()}°")
                gtk_label_set_text(gtk_builder_get_object(builder, "day_place")?.reinterpret(), "${todayInfo.dayOfWeek} - ${woeid.get(0).name}")
                gtk_label_set_text(gtk_builder_get_object(builder, "weather_state_name")?.reinterpret(), "${todayInfo.weatherState}")
                gtk_label_set_text(gtk_builder_get_object(builder, "more_detailed")?.reinterpret(), "High: ${todayInfo.maxTemp.toInt()}° Low: ${todayInfo.minTemp.toInt()}°  Precip: 0%")


                val weekGridView = gtk_builder_get_object(builder, "week_detail_grid")
                weekForcast.drop(1).forEachIndexed { index, dayInfo ->
                    gtk_grid_attach(weekGridView?.reinterpret(), createElement(dayInfo.dayOfWeek.substring(0,3), dayInfo.weatherStateAbbr, dayInfo.maxTemp.toInt().toString(), dayInfo.minTemp.toInt().toString())?.reinterpret(), index, 0, 1, 1)
                }
                gtk_widget_show_all(weekGridView?.reinterpret())

                //val settings = g_settings_new ("org.gtk.Demo")
                //g_settings_set(settings, "current", place)
                //g_settings_set_string(settings, "current", place)
            }
        }
    }



}







/** Main Method **/
fun main(args: Array<String>) {
    SampleLinux("com.gtk.example", G_APPLICATION_FLAGS_NONE).run(args)
}