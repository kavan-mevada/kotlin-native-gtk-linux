package sample

import kotlinx.cinterop.*
import libgtk3.gdk_threads_add_idle
import platform.posix.*
import kotlin.native.concurrent.freeze


fun createThread(f0 : () -> Unit) : pthread_t {
    val thread_id = memScoped { alloc<pthread_tVar>() }
    pthread_create(thread_id.ptr, null, staticCFunction { pointer: COpaquePointer? ->
        initRuntimeIfNeeded()
        pointer?.asStableRef<() -> Unit>()?.get()?.invoke()

        null as COpaquePointer?
    }.reinterpret(), StableRef.create(f0.freeze()).asCPointer())
    return thread_id.value
}

fun pthread_t.after(func: (id: pthread_t, value: COpaquePointer?) -> Unit) {
    val result = memScoped { alloc<COpaquePointerVar>() }.apply {
        pthread_join(this@after, this.ptr)
    }.value
    func(this@after, result)
}

val pthread_t.isrunning get() = (pthread_kill(this, 0) == 0)
val pthread_t.cancel get() = pthread_cancel(this)

    fun pthread_t.await() : COpaquePointer? {
        return memScoped { alloc<COpaquePointerVar>() }.apply {
            platform.posix.pthread_join(this@await, this.ptr)
        }.value
    }


    fun gtk_ideal(f0 : () -> Unit) {
        gdk_threads_add_idle(staticCFunction { pointer: COpaquePointer? ->
            pointer?.asStableRef<() -> Unit>()?.get()?.invoke()

            null as COpaquePointer?
        }.reinterpret(), StableRef.create(f0.freeze()).asCPointer())
    }
