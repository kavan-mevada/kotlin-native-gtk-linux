//package sample
//
//import kotlinx.cinterop.*
//import libgtk3.*
//import resources.g_clear_error
//import resources.g_print
//import resources.g_printerr
//
//fun print_hello(widget: CPointer<GtkWidget>, data: gpointer) {
//    g_print("Hello World\n")
//}
//
//fun main3(args: Array<String>) {
//
//    memScoped {
//        val argc = alloc<IntVar>()
//        argc.value = args.size
//        val argv = alloc<CPointerVar<CPointerVar<ByteVar>>>()
//        argv.value = args.map { it.cstr.ptr }.toCValues().ptr
//        gtk_init(argc.ptr, argv.ptr)
//    }
//
//    val builder = gtk_builder_new()!!
//    if (gtk_builder_add_from_resource(builder.reinterpret(), "builder.ui", null) == 0.toUInt()) {
//        //g_printerr("Error loading file: %s\n", null)
//        g_clear_error(null)
//    }
//
//    val window = gtk_builder_get_object(builder.reinterpret(), "window")!!
//    g_signal_connect(window.reinterpret<GtkWindow>(), "destroy", staticCFunction { widget:CPointer<GtkWidget>, data:gpointer ->
//        gtk_main_quit()
//    }, null)
//
//    gtk_main()
//}