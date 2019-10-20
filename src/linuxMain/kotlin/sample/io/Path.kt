package io

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.toKString
import platform.posix.FILENAME_MAX
import platform.posix.getcwd
import platform.posix.*

data class Path (internal val path: String) {

    val absolutePath = if (!path.contains(fileSaperator)) {
        memScoped {
            allocArray<ByteVar>(FILENAME_MAX).let {
                getcwd(it, FILENAME_MAX)
            }?.toKString()+fileSaperator+path
        }

    } else path

    val fileSaperator
        get() = if(Platform.osFamily == OsFamily.WINDOWS) "\\" else "/"

    val nameSpace
        get() = if(Platform.osFamily == OsFamily.WINDOWS) "/ " else "\\ "

    val fileName
        get() = absolutePath.substringAfterLast('/')

    val parent: String
        get() = absolutePath.substringBeforeLast('/')

    val resolve
        get() = absolutePath.replace(" ", nameSpace)

    fun resolve(child: String)
            = absolutePath+fileSaperator+child.replace(" ", nameSpace)
}
