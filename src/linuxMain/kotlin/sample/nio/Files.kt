package nio

import kotlinx.cinterop.*
import io.File
import io.Path
import platform.posix.*


/**
 *    Opening Modes in Standard I/O
 *    --------------------------------
 *
 *
 *    r	   Open for reading.
 *         If the file does not exist, fopen() returns NULL.
 *
 *    rb   Open for reading in binary mode.
 *         If the file does not exist, fopen() returns NULL.
 *
 *    w	   Open for writing. If the file exists,
 *         its contents are overwritten. If the file
 *         does not exist, it will be created.
 *
 *    wb   Open for writing in binary mode.
 *         If the file exists, its contents are overwritten.
 *         If the file does not exist, it will be created.
 *
 *    a	   Open for append. i.e, Data is added to end of file.
 *         If the file does not exists, it will be created.
 *
 *    ab   Open for append in binary mode.
 *         i.e, Data is added to end of file.
 *         If the file does not exists, it will be created.
 *
 *    r+   Open for both reading and writing.
 *         If the file does not exist, fopen() returns null.
 *
 *    rb+  Open for both reading and writing in binary mode.
 *         If the file does not exist, fopen() returns null.
 *
 *    w+   Open for both reading and writing.
 *         If the file exists, its contents are overwritten.
 *         If the file does not exist, it will be created.
 *
 *    wb+  Open for both reading and writing in binary mode.
 *         If the file exists, its contents are overwritten.
 *         If the file does not exist, it will be created.
 *
 *    a+   Open for both reading and appending.
 *         If the file does not exists, it will be created.
 *
 *    ab+  Open for both reading and appending in binary mode.
 *         If the file does not exists, it will be created.
 *
 **/

val BUFFER_SIZE = 1024


fun write(file: File, bytes: ByteArray, mode: String = "wb") {
    val fptr = fopen(file.absolutePath, mode)
    try {
        fwrite(bytes.refTo(0), bytes.size.convert(), 1, fptr)
    } finally {
        fclose(fptr)
    }
}

fun writeText(file: File, text: String, mode: String = "wb") {
    val fptr = fopen(file.absolutePath, mode)
    text.cstr.let {
        try {
        fwrite(it, it.size.convert(), 1, fptr)
        } finally {
            fclose(fptr)
        }
    }
}

/**
 * The maximum size of array to allocate.
 * Some VMs reserve some header words in an array.
 * Attempts to allocate larger arrays may result in
 * OutOfMemoryError: Requested array size exceeds VM limit
 */

internal val MAX_BUFFER_SIZE = Int.MAX_VALUE - 8

/**
 * Uses `initialSize` as a hint about
 * how many bytes the stream will have.
 *
 * If `initialSize` not specified then
 * it Reads all the bytes from a file.
 * The method ensures that the file is
 * closed when all bytes have been read or an I/O error,
 * or other runtime exception, is thrown.
 *
 * @param   source
 * the input stream to read from
 * @param   initialSize
 * the initial size of the byte array to allocate
 *
 * @return  a byte array containing the bytes read from the file
 *
 * @throws  OutOfMemoryError
 *          if an array of the required size cannot be allocated
 */

internal fun read(source: Path, initialSize: Int? = null, permission: Int = O_RDONLY /* 0_RDWR */): ByteArray? {
    val fp = open(source.absolutePath, O_RDONLY or O_RSYNC)

    // Error handling
    if(fp == -1) throw Error("Error reading file on specified path.")

    val length = initialSize ?: (lseek(fp, 0, SEEK_END)).toInt()

    if (length>MAX_BUFFER_SIZE) throw OutOfMemoryError()

    var kavan = mmap(null, length.convert(), PROT_READ, MAP_SHARED, fp,0)

    if(mprotect(null, length.convert(), PROT_READ or PROT_WRITE) == -1) {
        //perror("mprotect")
        return fread(source, length)
    } else {
        return kavan?.readBytes(length)
    }
}

internal fun fread(source: Path, length: Int): ByteArray? {
    val file = fopen(source.absolutePath, "r")
    memScoped {
        val buffer = allocArray<ByteVar>(length)
        fread(buffer, length.convert(), 1, file)
        return buffer.readBytes(length.toInt())
    }
}


