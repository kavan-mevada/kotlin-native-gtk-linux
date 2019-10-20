package sample

import glibresources.*
import kotlinx.cinterop.*
import kotlinx.coroutines.*
import libgtk3.*
import libgtk3.GConnectFlags
import libgtk3.G_APPLICATION_FLAGS_NONE
import libgtk3.g_application_run
import libgtk3.g_object_unref
import libgtk3.g_signal_connect_data
import libgtk3.gdouble
import libgtk3.gpointer
import libgtk3.gulong
import platform.posix.sleep


fun <F : CFunction<*>> g_signal_connect(obj: CPointer<*>, actionName: String, action: CPointer<F>, data: gpointer? = null, connect_flags: GConnectFlags = 0U): gulong {
    return g_signal_connect_data(obj.reinterpret(), actionName, action.reinterpret(), data = data, destroy_data = null, connect_flags = connect_flags)
}

var progress: gdouble = 0.00
var progressBar : CPointer<GtkWidget>? = null
var btStart : CPointer<GtkWidget>? = null

fun incrementProgressBar() {
    g_print("Inside thread ... ")
    var i = 0.05
    while (progress < 1.0) {
        g_idle_add(staticCFunction(::incrementGtkProgressBar).reinterpret(), null)
        progress = progress + 0.10
        sleep(1)
    }
    g_print("Thread completed...")
    g_idle_add(staticCFunction(::resetGtkProgressBar).reinterpret(), null)
}

fun incrementGtkProgressBar(): Int {
    gtk_progress_bar_set_fraction ( progressBar!!.reinterpret() , progress ) ;
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





fun activate(app: CPointer<GtkApplication>?, user_data: gpointer?) {
    val window = gtk_application_window_new (app)!!
    gtk_window_set_title (window.reinterpret(), "Window");
    gtk_window_set_default_size (window.reinterpret(), 200, 200);
    //gtk_window_set_icon(window.reinterpret(), "/org/gtk/example/icon.png", null)


    val grid = gtk_grid_new()

    btStart = gtk_button_new_with_label("Start")
    progressBar = gtk_progress_bar_new()

    gtk_grid_attach(grid!!.reinterpret(), btStart, 0, 0, 1, 1)
    gtk_grid_attach(grid!!.reinterpret(), progressBar, 0, 1, 1, 1)



    val image = gtk_image_new_from_resource("/org/gtk/example/icon.png")

    gtk_container_add (window.reinterpret(), grid)


    g_signal_connect(btStart!!.reinterpret<GtkWidget>(), "clicked", staticCFunction(::startThread), progressBar)

    gtk_widget_show (grid)
    gtk_widget_show (window);

    gtk_widget_show_all (window);
}

fun gtkMain(args: Array<String>): Int {
    val app = gtk_application_new("org.gtk.example", G_APPLICATION_FLAGS_NONE)!!
    g_signal_connect(app, "activate", staticCFunction(::activate))
    val status = memScoped {
        g_application_run(app.reinterpret(),
            args.size, args.map { it.cstr.getPointer(memScope) }.toCValues())
    }
    g_object_unref(app)
    return status
}


fun main(args: Array<String>) {
    glibresources_get_resource()
    //main2(args)
    gtkMain(args)
}


suspend fun sequentialRequests() {

}

fun main2(args: Array<String>) = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("current thread1")
        delay(1_000)
        println("current thread2")
    }
}
