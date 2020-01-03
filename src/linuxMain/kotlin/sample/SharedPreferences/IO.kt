package sample.SharedPreferences

import kotlinx.cinterop.*
import libgtk3.g_get_home_dir
import platform.posix.*
import sample.GtkHelpers.Application


fun Application.getSharedPreferences(name: String = "test.txt"): Int {
    val home = g_get_home_dir()?.toKString()
    val path = "$home/.var/app/$application_id/$name"
    val fd = open(path, O_RDWR or O_CREAT)




    readline(fd)

    appendline(path, "key4", "value4")


    //appendline(path, "lmnopqrst")



//    memScoped {
//        println(contentSize)
//        val bytes = allocArray<ByteVar>(contentSize)
//        val content = read(fd, bytes, contentSize.convert())
//    }





    return fd

}


fun readline(fd: Int) {
    val buffer = nativeHeap.allocArray<ByteVar>(1)

    var bytesRead: ssize_t = 0
    while (read(fd, buffer + bytesRead, 1.convert()) > 0) { bytesRead += 1 }


    //Read lines
    val map = hashMapOf<String, String>()
    buffer.readBytes(bytesRead.convert()).toKString().split("\n").dropLast(1).forEach {
        it.split("=").let {
            map[it.first()] = it.last()
        }
    }

    println(map)


//    while (bytes.value != 10) {
//        read(fd, bytes.ptr, 1uL)
//        if (bytes.value != 10) builder.append(bytes.value.toChar())
//    }
}

fun appendline(path: String, key: String, value: String){
    val fd = open(path, O_RDWR or O_APPEND or O_CREAT)
    write(fd, "$key=$value".cstr, ((key+value).length+1).convert())
}

