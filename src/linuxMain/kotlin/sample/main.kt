/*
 * Copyright (c) 2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package sample

import gtk3.*
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.staticCFunction


fun destroyWidget(widget: CPointer<GtkWidget>?) = gtk_widget_destroy(widget)
fun quitWindow() = Gtk.main_quit()
fun buttonOne() = println("Button 1 clicked !")
fun buttonTwo() = println("Button 2 clicked !")

fun activated() = println("Application activated!")


fun main(args: Array<String>) {

    Gtk.init(args)

    val builder = Builder()
    builder.add_from_file("builder.ui")
    val window = builder.get_object<GtkWindow>("window")
    window?.connect("destroy", staticCFunction(::quitWindow))

    //val app = Application("org.gtk.example", G_APPLICATION_FLAGS_NONE)
    //val window = Window(app)

    window.default_name("Window Title")
    window.default_size(800, 300)
    window.resizable(false)


    /* Connect signal handlers to the constructed widgets. */
    val button1 = builder.get_object<GtkButton>("button1")
    button1?.connect("clicked", staticCFunction(::buttonOne))

    val button2 = builder.get_object<GtkButton>("button2")
    button2?.connect("clicked", staticCFunction(::buttonTwo))

    val button3 = builder.get_object<GtkButton>("quit")
    button3?.connect("clicked", staticCFunction(::quitWindow))

    val button4 = builder.get_object<GtkButton>("destroyWidget")
    button4?.connect("clicked", staticCFunction(::destroyWidget), window, G_CONNECT_SWAPPED)


    window?.show_all()
    Gtk.main()

//    val status = app?.status(args)
//    g_object_unref(app)
//    return status?:Unit

}


