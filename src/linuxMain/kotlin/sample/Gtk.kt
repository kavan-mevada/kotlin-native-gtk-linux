/*
 * Copyright (c) 2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package sample

import gtk3.*
import kotlinx.cinterop.*

object Gtk {

    fun init(args: Array<String>) {
        memScoped {
            val argc = alloc<IntVar>()
            argc.value = args.size
            val argv = alloc<CPointerVar<CPointerVar<ByteVar>>>()
            argv.value = args.map { it.cstr.ptr }.toCValues().ptr
            gtk_init(argc.ptr, argv.ptr)
        }
    }

    fun main() = gtk_main()

    fun main_quit() = gtk_main_quit()

    fun widget_destroy(widget: CPointer<GtkWidget>?) = gtk_widget_destroy(widget)

}


fun Application(application_id: String, flags: GApplicationFlags): CPointer<GtkApplication>? {
    val app = gtk_application_new(application_id, flags)
    app?.connect("activate", staticCFunction(::activated))
    g_application_register(app?.reinterpret(), null, null)
    g_application_activate(app?.reinterpret())
    return app
}


fun CPointer<GtkApplication>.status(args: Array<String>) {
    return memScoped {
        g_application_run(reinterpret(), args.size, args.map { it.cstr.ptr }.toCValues())
    }
}


fun Window(app: CPointer<GtkApplication>?): CPointer<GtkWindow>? = gtk_application_window_new(app)?.reinterpret()

fun CPointer<GtkWindow>?.default_name(title: String) = gtk_window_set_title(this, title)

fun CPointer<GtkWindow>?.default_size(width: Int, height: Int) = gtk_window_set_default_size(this, width, height)

fun CPointer<GtkWindow>?.resizable(bool: Boolean) = gtk_window_set_resizable(this, if (bool) 1 else 0)

fun CPointer<GtkWindow>.show_all() = gtk_widget_show_all(this.reinterpret())


fun Builder() = gtk_builder_new()

@Throws(Exception::class)
fun CPointer<GtkBuilder>?.add_from_file(filename: String) {
    if (gtk_builder_add_from_file(this, filename, null) == 0u) {
        throw Exception("Could not load UI")
    }
}

fun <T : CPointed> CPointer<GtkBuilder>?.get_object(name: String) = gtk_builder_get_object(this, name)?.reinterpret<T>()


fun <T : CPointed, F : CFunction<*>> CPointer<T>.connect(
    signal: String,
    action: CPointer<F>, data: gpointer? = null, connect_flags: GConnectFlags = 0u
) {
    g_signal_connect_data(
        reinterpret(), signal, action.reinterpret(),
        data = data, destroy_data = null, connect_flags = connect_flags
    )
}