package sample

import glibjson.*
import glibresources.*
import glibresources.FALSE
import glibresources.TRUE
import glibresources.g_idle_add
import glibresources.g_thread_new
import kotlinx.cinterop.*
import kotlinx.coroutines.*
import libcurl.*
import libgtk3.*
import libgtk3.GConnectFlags
import libgtk3.G_APPLICATION_FLAGS_NONE
import libgtk3.g_application_run
import libgtk3.g_object_unref
import libgtk3.g_signal_connect_data
import libgtk3.gdouble
import libgtk3.gpointer
import libgtk3.gulong
import platform.posix.size_t
import platform.posix.sleep


fun <F : CFunction<*>> g_signal_connect(obj: CPointer<*>, actionName: String, action: CPointer<F>, data: gpointer? = null, connect_flags: GConnectFlags = 0U): gulong {
    return g_signal_connect_data(obj.reinterpret(), actionName, action.reinterpret(), data = data, destroy_data = null, connect_flags = connect_flags)
}

var progress: gdouble = 0.00
var progressBar : CPointer<GtkWidget>? = null
var btStart : CPointer<GtkWidget>? = null
var label : CPointer<GtkWidget>? = null



fun incrementProgressBar() {
    println("Inside thread ... ")
    var i = 0.00
    while (progress < 1.00) {
        g_idle_add(staticCFunction(::incrementGtkProgressBar).reinterpret(), null)
        progress += 0.10
        sleep(1.toUInt())
    }
    println("Thread completed...")
    g_idle_add(staticCFunction(::resetGtkProgressBar).reinterpret(), null)
}

fun incrementGtkProgressBar(): Int {
    gtk_progress_bar_set_fraction ( progressBar!!.reinterpret() , progress )
    return FALSE
}

fun resetGtkProgressBar(): Int {
    gtk_progress_bar_set_fraction (progressBar?.reinterpret(), 0.00)
    gtk_widget_set_sensitive(btStart, TRUE)
    return FALSE
}



fun startThread(widget: CPointer<GtkWidget>, data: gpointer) {
    progress = 0.00
    g_thread_new(null , staticCFunction(::incrementProgressBar).reinterpret(), data)
    gtk_widget_set_sensitive(widget, FALSE)
}





fun activate(app: CPointer<GtkApplication>?, builder: CPointer<GtkBuilder>, user_data: gpointer?) {

    val window = gtk_builder_get_object (builder, "window");


//
//
//    val window = gtk_application_window_new (app)!!
//    gtk_window_set_title (window.reinterpret(), "Window");
//    gtk_window_set_default_size (window.reinterpret(), 200, 200);
//    //gtk_window_set_icon(window.reinterpret(), "/org/gtk/example/icon.png", null)
//
//
//    val grid = gtk_grid_new()
//
//    val image = gtk_image_new_from_resource("/org/gtk/example/raw/icon.png")
//    btStart = gtk_button_new_with_label("Start")
//    label = gtk_label_new("City Name")
//    progressBar = gtk_progress_bar_new()
//
//    gtk_grid_attach(grid!!.reinterpret(), image, 0, 0, 1, 1)
//    gtk_grid_attach(grid.reinterpret(), label, 0, 1, 1, 1)
//    gtk_grid_attach(grid.reinterpret(), progressBar, 0, 2, 1, 1)
//    gtk_grid_attach(grid.reinterpret(), btStart, 0, 3, 1, 1)
//
//
//
//    val curl = CUrl("https://www.metaweather.com/api/location/search/?query=Ahmedabad").close
//    curl?.parseJson()
//
//
//    gtk_container_add (window.reinterpret(), grid)
//
//
//    g_signal_connect(btStart!!.reinterpret<GtkWidget>(), "clicked", staticCFunction(::startThread), progressBar)
//
//    gtk_widget_show (grid)
//    gtk_widget_show (window);
//
//    gtk_widget_show_all (window);
}



fun gtkMain(args: Array<String>): Int {
    val app = gtk_application_new("org.gtk.example", G_APPLICATION_FLAGS_NONE)!!

    val gtkBuilder = gtk_builder_new()
    gtk_builder_set_application(gtkBuilder, app)
    gtk_builder_add_from_resource(gtkBuilder, "/org/gtk/example/layout/main.ui", null)

    g_signal_connect(app, "activate", staticCFunction(::activate))
    val status = memScoped {
        g_application_run(app.reinterpret(),
            args.size, args.map { it.cstr.getPointer(memScope) }.toCValues())
    }

    gtk_main()
    g_object_unref(app)

    return status
}





fun main(args: Array<String>) {
    glibresources_get_resource()
    //main2(args)

    memScoped {
        val argc = alloc<IntVar>()
        argc.value = args.size
        val argv = alloc<CPointerVar<CPointerVar<ByteVar>>>()
        argv.value = args.map { it.cstr.ptr }.toCValues().ptr
        gtk_init(argc.ptr, argv.ptr)
    }

    gtkMain(args)
}

fun main2(args: Array<String>) = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("current thread1")
        delay(1_000)
        println("current thread2")
    }
}

class CUrl(url: String)  {
    private val stableRef = StableRef.create(this)

    private val curl = curl_easy_init()
    private var body: String? = null

    val write_callback = staticCFunction { buffer: CPointer<ByteVar>, size: size_t, nitems: size_t, userdata: COpaquePointer? ->
        return@staticCFunction if (userdata != null) {
            val data = buffer.toKString()
            userdata.asStableRef<CUrl>().get().apply {
                body = if (body==null) data else body + data
            }
            size * nitems
        } else 0u
    }

    init {
        curl_easy_setopt(curl, CURLOPT_URL, url)
        curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, write_callback)
        curl_easy_setopt(curl, CURLOPT_WRITEDATA, stableRef.asCPointer())
    }

    val close: String?
        get() {
            curl_easy_perform(curl)
            curl_easy_cleanup(curl)
            stableRef.dispose()
            return body
        }
}



fun String.parseJson() {

    val parser = json_parser_new()
    val gbool = json_parser_load_from_data(parser, this, this.length.convert(), null)

    if (gbool== TRUE){
        val root = json_parser_get_root(parser)

        val array = json_node_get_array(root)

        val obj = json_array_get_object_element(array, 0.toUInt())

        val woeid = json_object_get_int_member(obj, "woeid").toString()

        gtk_label_set_text(label!!.reinterpret(), woeid)


        val detailedInfo = CUrl( "https://www.metaweather.com/api/location/$woeid/").close

        detailedInfo?.readDetailedInfo()
    }

    //println(result)
}



fun String.readDetailedInfo() {

    val mainObject = JSON(this).asObject()


    val consolidated_weather = mainObject?.getArray("consolidated_weather")

    val weater_data = consolidated_weather?.getObject(0)

    val main_temp = weater_data?.getDouble("the_temp")
    val weather_state_name = weater_data?.getString("weather_state_name").toString()
    val wind_speed = weater_data?.getDouble("wind_speed")
    val humidity = weater_data?.getDouble("humidity")


    println("$main_temp , $weather_state_name, $wind_speed, $humidity")
}
