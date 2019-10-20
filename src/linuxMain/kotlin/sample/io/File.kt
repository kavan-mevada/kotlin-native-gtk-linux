package io

import nio.*
import platform.posix.F_OK
import platform.posix.access
import platform.posix.mkdir
import kotlinx.cinterop.convert


data class File (internal val filePath: Path) {
    constructor(path: String) : this(Path(path))
    constructor(parent: Path, child: String) : this(parent.resolve(child))
    constructor(parent: File, child: String) : this(parent.systemPath.resolve(child))

    val path = filePath
    val absolutePath = filePath.absolutePath
    val systemPath = Path(filePath.absolutePath)

    val name: String
        get() = filePath.fileName

    val extension: String
        get() = name.substringAfterLast('.', "")

    val parent: String
        get() = filePath.parent

    val exists
        get() = access(filePath.absolutePath, F_OK) != -1

    fun child(name: String) = File(this, name)
}

fun File.write(bytes: ByteArray) = write(this, bytes)

fun File.writeText(text: String) = writeText(this, text)

fun File.read(count: Int) = read(this.filePath, count)

fun File.readAllBytes() = read(this.filePath)

fun File.readAllText() = read(this.filePath)?.map { it -> it.toChar() }?.toCharArray()?.let { String(it) }

fun File.mkdir(mode: Int = 700) {

    if(this.absolutePath.contains(path.fileSaperator)){
        val listOfDirs = this.path.resolve.split(this.path.fileSaperator)
        var basepath = ""
        listOfDirs.forEachIndexed { i , it ->
            basepath += it.replace("\\", "")
            val permission = if(i<listOfDirs.size-1) 502 else mode
            mkdir(basepath, permission.convert())
            basepath += path.fileSaperator
        }
    } else mkdir(this.absolutePath.replace("\\", ""), mode.convert())
    
}