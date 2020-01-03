package sample.GtkHelpers

import kotlinx.cinterop.*
import libgtk3.*
import platform.posix.exit



abstract class Application(id: String, gApplicationFlagsNone: GApplicationFlags) {

    var builder: CPointer<GtkBuilder>? = null
    var application: CPointer<GtkApplication>? = null
    val application_id = id

    abstract fun onActivate(app: CPointer<GtkApplication>)

    init {
        glibresources_get_resource()
        gtk_application_new(application_id, gApplicationFlagsNone)?.let { application = it }
        g_signal_connect_data(application?.reinterpret(), "activate", staticCFunction { app: CPointer<GtkApplication>, data: COpaquePointer? ->
            data?.asStableRef<(CPointer<GtkApplication>) -> Unit>()?.get()?.let { it(app) }
            null as COpaquePointer?
        }.reinterpret(), StableRef.create(::onActivate).asCPointer(), null, 0u)
    }

    fun run(args: Array<String>) {
        memScoped {
            val status = g_application_run(application?.reinterpret(), args.size, args.map { it.cstr.ptr }.toCValues())
            g_object_unref(application)

            exit(status)
        }
    }

    fun setContentView(templatePath: String) {
        builder = gtk_builder_new_from_resource(templatePath)
        val builderObjs = gtk_builder_get_objects(builder)

        val length = g_slist_length(builderObjs?.reinterpret()).toInt()
        (0 .. length).forEach {
            val element = g_slist_nth_data(builderObjs?.reinterpret(), it.toUInt())
            if (gtk_widget_get_name(element?.reinterpret())?.toKString() == "GtkWindow") {
                gtk_application_add_window(application, element?.reinterpret())
                gtk_widget_show(element?.reinterpret())
            }
        }

    }

}

