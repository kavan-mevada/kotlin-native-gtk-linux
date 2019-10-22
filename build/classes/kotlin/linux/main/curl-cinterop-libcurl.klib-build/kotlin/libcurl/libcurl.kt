@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package libcurl

import kotlin.native.SymbolName
import kotlinx.cinterop.internal.*
import kotlinx.cinterop.*
import cnames.structs.Curl_URL
import cnames.structs.curl_mime_s
import cnames.structs.curl_mimepart_s
import cnames.structs.curl_pushheaders
import platform.posix.size_t
import platform.posix.size_tVar

// NOTE THIS FILE IS AUTO-GENERATED

@CStruct("struct { void* p0; void* p1; long p2; void* p3; long p4; void* p5; long p6; void* p7; void* p8; void* p9; long p10; void* p11; void* p12; long p13; }")
class curl_httppost(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(112, 8)
    
    var next: CPointer<curl_httppost>?
        get() = memberAt<CPointerVar<curl_httppost>>(0).value
        set(value) { memberAt<CPointerVar<curl_httppost>>(0).value = value }
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var namelength: Long
        get() = memberAt<LongVar>(16).value
        set(value) { memberAt<LongVar>(16).value = value }
    
    var contents: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var contentslength: Long
        get() = memberAt<LongVar>(32).value
        set(value) { memberAt<LongVar>(32).value = value }
    
    var buffer: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(40).value
        set(value) { memberAt<CPointerVar<ByteVar>>(40).value = value }
    
    var bufferlength: Long
        get() = memberAt<LongVar>(48).value
        set(value) { memberAt<LongVar>(48).value = value }
    
    var contenttype: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(56).value
        set(value) { memberAt<CPointerVar<ByteVar>>(56).value = value }
    
    var contentheader: CPointer<curl_slist>?
        get() = memberAt<CPointerVar<curl_slist>>(64).value
        set(value) { memberAt<CPointerVar<curl_slist>>(64).value = value }
    
    var more: CPointer<curl_httppost>?
        get() = memberAt<CPointerVar<curl_httppost>>(72).value
        set(value) { memberAt<CPointerVar<curl_httppost>>(72).value = value }
    
    var flags: Long
        get() = memberAt<LongVar>(80).value
        set(value) { memberAt<LongVar>(80).value = value }
    
    var showfilename: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(88).value
        set(value) { memberAt<CPointerVar<ByteVar>>(88).value = value }
    
    var userp: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(96).value
        set(value) { memberAt<COpaquePointerVar>(96).value = value }
    
    var contentlen: curl_off_t
        get() = memberAt<curl_off_tVar>(104).value
        set(value) { memberAt<curl_off_tVar>(104).value = value }
}

@CStruct("struct { void* p0; void* p1; }")
class curl_slist(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var data: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var next: CPointer<curl_slist>?
        get() = memberAt<CPointerVar<curl_slist>>(8).value
        set(value) { memberAt<CPointerVar<curl_slist>>(8).value = value }
}

@CStruct("struct { void* p0; unsigned int p1; long p2; unsigned int p3; int p4; int p5; long p6; long p7; struct { void* p0; void* p1; void* p2; void* p3; void* p4; } p8; unsigned int p9; void* p10; unsigned long p11; unsigned long p12; }")
class curl_fileinfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(128, 8)
    
    var filename: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var filetype: curlfiletype
        get() = memberAt<curlfiletypeVar>(8).value
        set(value) { memberAt<curlfiletypeVar>(8).value = value }
    
    var time: time_t
        get() = memberAt<time_tVar>(16).value
        set(value) { memberAt<time_tVar>(16).value = value }
    
    var perm: UInt
        get() = memberAt<UIntVar>(24).value
        set(value) { memberAt<UIntVar>(24).value = value }
    
    var uid: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var gid: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var size: curl_off_t
        get() = memberAt<curl_off_tVar>(40).value
        set(value) { memberAt<curl_off_tVar>(40).value = value }
    
    var hardlinks: Long
        get() = memberAt<LongVar>(48).value
        set(value) { memberAt<LongVar>(48).value = value }
    
    val strings: anonymousStruct1
        get() = memberAt(56)
    
    var flags: UInt
        get() = memberAt<UIntVar>(96).value
        set(value) { memberAt<UIntVar>(96).value = value }
    
    var b_data: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(104).value
        set(value) { memberAt<CPointerVar<ByteVar>>(104).value = value }
    
    var b_size: size_t
        get() = memberAt<size_tVar>(112).value
        set(value) { memberAt<size_tVar>(112).value = value }
    
    var b_used: size_t
        get() = memberAt<size_tVar>(120).value
        set(value) { memberAt<size_tVar>(120).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; }")
class anonymousStruct1(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var time: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var perm: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var user: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var group: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var target: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(32).value
        set(value) { memberAt<CPointerVar<ByteVar>>(32).value = value }
}

@CStruct("struct { int p0; int p1; int p2; unsigned int p3; struct { unsigned short p0; char p1[14]; } p4; }")
class curl_sockaddr(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 4)
    
    var family: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var socktype: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var protocol: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var addrlen: UInt
        get() = memberAt<UIntVar>(12).value
        set(value) { memberAt<UIntVar>(12).value = value }
    
    val addr: sockaddr
        get() = memberAt(16)
}

@CStruct("struct { unsigned short p0; char p1[14]; }")
class sockaddr(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 2)
    
    var sa_family: sa_family_t
        get() = memberAt<sa_family_tVar>(0).value
        set(value) { memberAt<sa_family_tVar>(0).value = value }
    
    val sa_data: CArrayPointer<ByteVar>
        get() = arrayMemberAt(2)
}

@CStruct("struct { void* p0; unsigned long p1; unsigned int p2; }")
class curl_khkey(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var key: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var len: size_t
        get() = memberAt<size_tVar>(8).value
        set(value) { memberAt<size_tVar>(8).value = value }
    
    var keytype: curl_khtype
        get() = memberAt<curl_khtype.Var>(16).value
        set(value) { memberAt<curl_khtype.Var>(16).value = value }
}

@CStruct("struct { unsigned int p0; void* p1; }")
class curl_forms(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var option: CURLformoption
        get() = memberAt<CURLformoption.Var>(0).value
        set(value) { memberAt<CURLformoption.Var>(0).value = value }
    
    var value: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
}

@CStruct("struct { unsigned int p0; void* p1; }")
class curl_ssl_backend(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var id: curl_sslbackend
        get() = memberAt<curl_sslbackendVar>(0).value
        set(value) { memberAt<curl_sslbackendVar>(0).value = value }
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
}

@CStruct("struct { int p0; void* p1; }")
class curl_certinfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var num_of_certs: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var certinfo: CPointer<CPointerVar<curl_slist>>?
        get() = memberAt<CPointerVar<CPointerVar<curl_slist>>>(8).value
        set(value) { memberAt<CPointerVar<CPointerVar<curl_slist>>>(8).value = value }
}

@CStruct("struct { unsigned int p0; void* p1; }")
class curl_tlssessioninfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var backend: curl_sslbackend
        get() = memberAt<curl_sslbackendVar>(0).value
        set(value) { memberAt<curl_sslbackendVar>(0).value = value }
    
    var internals: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
}

@CStruct("struct { unsigned int p0; void* p1; unsigned int p2; void* p3; int p4; void* p5; long p6; void* p7; void* p8; void* p9; int p10; void* p11; int p12; void* p13; unsigned int p14; void* p15; unsigned int p16; void* p17; void* p18; }")
class curl_version_info_data(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(152, 8)
    
    var age: CURLversion
        get() = memberAt<CURLversion.Var>(0).value
        set(value) { memberAt<CURLversion.Var>(0).value = value }
    
    var version: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var version_num: UInt
        get() = memberAt<UIntVar>(16).value
        set(value) { memberAt<UIntVar>(16).value = value }
    
    var host: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var features: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var ssl_version: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(40).value
        set(value) { memberAt<CPointerVar<ByteVar>>(40).value = value }
    
    var ssl_version_num: Long
        get() = memberAt<LongVar>(48).value
        set(value) { memberAt<LongVar>(48).value = value }
    
    var libz_version: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(56).value
        set(value) { memberAt<CPointerVar<ByteVar>>(56).value = value }
    
    var protocols: CPointer<CPointerVar<ByteVar>>?
        get() = memberAt<CPointerVar<CPointerVar<ByteVar>>>(64).value
        set(value) { memberAt<CPointerVar<CPointerVar<ByteVar>>>(64).value = value }
    
    var ares: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(72).value
        set(value) { memberAt<CPointerVar<ByteVar>>(72).value = value }
    
    var ares_num: Int
        get() = memberAt<IntVar>(80).value
        set(value) { memberAt<IntVar>(80).value = value }
    
    var libidn: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(88).value
        set(value) { memberAt<CPointerVar<ByteVar>>(88).value = value }
    
    var iconv_ver_num: Int
        get() = memberAt<IntVar>(96).value
        set(value) { memberAt<IntVar>(96).value = value }
    
    var libssh_version: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(104).value
        set(value) { memberAt<CPointerVar<ByteVar>>(104).value = value }
    
    var brotli_ver_num: UInt
        get() = memberAt<UIntVar>(112).value
        set(value) { memberAt<UIntVar>(112).value = value }
    
    var brotli_version: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(120).value
        set(value) { memberAt<CPointerVar<ByteVar>>(120).value = value }
    
    var nghttp2_ver_num: UInt
        get() = memberAt<UIntVar>(128).value
        set(value) { memberAt<UIntVar>(128).value = value }
    
    var nghttp2_version: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(136).value
        set(value) { memberAt<CPointerVar<ByteVar>>(136).value = value }
    
    var quic_version: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(144).value
        set(value) { memberAt<CPointerVar<ByteVar>>(144).value = value }
}

@CStruct("struct { unsigned int p0; void* p1; union { void* p0; unsigned int p1; } p2; }")
class CURLMsg(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var msg: CURLMSG
        get() = memberAt<CURLMSG.Var>(0).value
        set(value) { memberAt<CURLMSG.Var>(0).value = value }
    
    var easy_handle: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    val data: anonymousStruct2
        get() = memberAt(16)
}

@CStruct("union { void* p0; unsigned int p1; }")
class anonymousStruct2(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var whatever: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var result: CURLcode
        get() = memberAt<CURLcodeVar>(0).value
        set(value) { memberAt<CURLcodeVar>(0).value = value }
}

@CStruct("struct { int p0; short p1; short p2; }")
class curl_waitfd(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var fd: curl_socket_t
        get() = memberAt<curl_socket_tVar>(0).value
        set(value) { memberAt<curl_socket_tVar>(0).value = value }
    
    var events: Short
        get() = memberAt<ShortVar>(4).value
        set(value) { memberAt<ShortVar>(4).value = value }
    
    var revents: Short
        get() = memberAt<ShortVar>(6).value
        set(value) { memberAt<ShortVar>(6).value = value }
}

@CStruct("struct { long p0[16]; }")
class fd_set(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(128, 8)
    
    val __fds_bits: CArrayPointer<__fd_maskVar>
        get() = arrayMemberAt(0)
}

enum class curlsocktype(override val value: UInt) : CEnum {
    CURLSOCKTYPE_IPCXN(0u),
    CURLSOCKTYPE_ACCEPT(1u),
    CURLSOCKTYPE_LAST(2u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = curlsocktype.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: curlsocktype
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class curlioerr(override val value: UInt) : CEnum {
    CURLIOE_OK(0u),
    CURLIOE_UNKNOWNCMD(1u),
    CURLIOE_FAILRESTART(2u),
    CURLIOE_LAST(3u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = curlioerr.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: curlioerr
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class curliocmd(override val value: UInt) : CEnum {
    CURLIOCMD_NOP(0u),
    CURLIOCMD_RESTARTREAD(1u),
    CURLIOCMD_LAST(2u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = curliocmd.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: curliocmd
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class curl_khtype(override val value: UInt) : CEnum {
    CURLKHTYPE_UNKNOWN(0u),
    CURLKHTYPE_RSA1(1u),
    CURLKHTYPE_RSA(2u),
    CURLKHTYPE_DSS(3u),
    CURLKHTYPE_ECDSA(4u),
    CURLKHTYPE_ED25519(5u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = curl_khtype.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: curl_khtype
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class curl_khstat(override val value: UInt) : CEnum {
    CURLKHSTAT_FINE_ADD_TO_FILE(0u),
    CURLKHSTAT_FINE(1u),
    CURLKHSTAT_REJECT(2u),
    CURLKHSTAT_DEFER(3u),
    CURLKHSTAT_LAST(4u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = curl_khstat.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: curl_khstat
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class curl_khmatch(override val value: UInt) : CEnum {
    CURLKHMATCH_OK(0u),
    CURLKHMATCH_MISMATCH(1u),
    CURLKHMATCH_MISSING(2u),
    CURLKHMATCH_LAST(3u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = curl_khmatch.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: curl_khmatch
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class curl_usessl(override val value: UInt) : CEnum {
    CURLUSESSL_NONE(0u),
    CURLUSESSL_TRY(1u),
    CURLUSESSL_CONTROL(2u),
    CURLUSESSL_ALL(3u),
    CURLUSESSL_LAST(4u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = curl_usessl.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: curl_usessl
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class curl_ftpccc(override val value: UInt) : CEnum {
    CURLFTPSSL_CCC_NONE(0u),
    CURLFTPSSL_CCC_PASSIVE(1u),
    CURLFTPSSL_CCC_ACTIVE(2u),
    CURLFTPSSL_CCC_LAST(3u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = curl_ftpccc.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: curl_ftpccc
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class curl_ftpauth(override val value: UInt) : CEnum {
    CURLFTPAUTH_DEFAULT(0u),
    CURLFTPAUTH_SSL(1u),
    CURLFTPAUTH_TLS(2u),
    CURLFTPAUTH_LAST(3u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = curl_ftpauth.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: curl_ftpauth
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class curl_ftpcreatedir(override val value: UInt) : CEnum {
    CURLFTP_CREATE_DIR_NONE(0u),
    CURLFTP_CREATE_DIR(1u),
    CURLFTP_CREATE_DIR_RETRY(2u),
    CURLFTP_CREATE_DIR_LAST(3u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = curl_ftpcreatedir.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: curl_ftpcreatedir
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class curl_ftpmethod(override val value: UInt) : CEnum {
    CURLFTPMETHOD_DEFAULT(0u),
    CURLFTPMETHOD_MULTICWD(1u),
    CURLFTPMETHOD_NOCWD(2u),
    CURLFTPMETHOD_SINGLECWD(3u),
    CURLFTPMETHOD_LAST(4u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = curl_ftpmethod.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: curl_ftpmethod
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class CURL_NETRC_OPTION(override val value: UInt) : CEnum {
    CURL_NETRC_IGNORED(0u),
    CURL_NETRC_OPTIONAL(1u),
    CURL_NETRC_REQUIRED(2u),
    CURL_NETRC_LAST(3u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = CURL_NETRC_OPTION.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: CURL_NETRC_OPTION
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class CURL_TLSAUTH(override val value: UInt) : CEnum {
    CURL_TLSAUTH_NONE(0u),
    CURL_TLSAUTH_SRP(1u),
    CURL_TLSAUTH_LAST(2u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = CURL_TLSAUTH.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: CURL_TLSAUTH
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class curl_TimeCond(override val value: UInt) : CEnum {
    CURL_TIMECOND_NONE(0u),
    CURL_TIMECOND_IFMODSINCE(1u),
    CURL_TIMECOND_IFUNMODSINCE(2u),
    CURL_TIMECOND_LASTMOD(3u),
    CURL_TIMECOND_LAST(4u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = curl_TimeCond.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: curl_TimeCond
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class CURLformoption(override val value: UInt) : CEnum {
    CURLFORM_NOTHING(0u),
    CURLFORM_COPYNAME(1u),
    CURLFORM_PTRNAME(2u),
    CURLFORM_NAMELENGTH(3u),
    CURLFORM_COPYCONTENTS(4u),
    CURLFORM_PTRCONTENTS(5u),
    CURLFORM_CONTENTSLENGTH(6u),
    CURLFORM_FILECONTENT(7u),
    CURLFORM_ARRAY(8u),
    CURLFORM_OBSOLETE(9u),
    CURLFORM_FILE(10u),
    CURLFORM_BUFFER(11u),
    CURLFORM_BUFFERPTR(12u),
    CURLFORM_BUFFERLENGTH(13u),
    CURLFORM_CONTENTTYPE(14u),
    CURLFORM_CONTENTHEADER(15u),
    CURLFORM_FILENAME(16u),
    CURLFORM_END(17u),
    CURLFORM_OBSOLETE2(18u),
    CURLFORM_STREAM(19u),
    CURLFORM_CONTENTLEN(20u),
    CURLFORM_LASTENTRY(21u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = CURLformoption.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: CURLformoption
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class CURLFORMcode(override val value: UInt) : CEnum {
    CURL_FORMADD_OK(0u),
    CURL_FORMADD_MEMORY(1u),
    CURL_FORMADD_OPTION_TWICE(2u),
    CURL_FORMADD_NULL(3u),
    CURL_FORMADD_UNKNOWN_OPTION(4u),
    CURL_FORMADD_INCOMPLETE(5u),
    CURL_FORMADD_ILLEGAL_ARRAY(6u),
    CURL_FORMADD_DISABLED(7u),
    CURL_FORMADD_LAST(8u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = CURLFORMcode.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: CURLFORMcode
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class curl_closepolicy(override val value: UInt) : CEnum {
    CURLCLOSEPOLICY_NONE(0u),
    CURLCLOSEPOLICY_OLDEST(1u),
    CURLCLOSEPOLICY_LEAST_RECENTLY_USED(2u),
    CURLCLOSEPOLICY_LEAST_TRAFFIC(3u),
    CURLCLOSEPOLICY_SLOWEST(4u),
    CURLCLOSEPOLICY_CALLBACK(5u),
    CURLCLOSEPOLICY_LAST(6u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = curl_closepolicy.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: curl_closepolicy
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class CURLSHcode(override val value: UInt) : CEnum {
    CURLSHE_OK(0u),
    CURLSHE_BAD_OPTION(1u),
    CURLSHE_IN_USE(2u),
    CURLSHE_INVALID(3u),
    CURLSHE_NOMEM(4u),
    CURLSHE_NOT_BUILT_IN(5u),
    CURLSHE_LAST(6u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = CURLSHcode.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: CURLSHcode
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class CURLSHoption(override val value: UInt) : CEnum {
    CURLSHOPT_NONE(0u),
    CURLSHOPT_SHARE(1u),
    CURLSHOPT_UNSHARE(2u),
    CURLSHOPT_LOCKFUNC(3u),
    CURLSHOPT_UNLOCKFUNC(4u),
    CURLSHOPT_USERDATA(5u),
    CURLSHOPT_LAST(6u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = CURLSHoption.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: CURLSHoption
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class CURLversion(override val value: UInt) : CEnum {
    CURLVERSION_FIRST(0u),
    CURLVERSION_SECOND(1u),
    CURLVERSION_THIRD(2u),
    CURLVERSION_FOURTH(3u),
    CURLVERSION_FIFTH(4u),
    CURLVERSION_SIXTH(5u),
    CURLVERSION_LAST(6u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = CURLversion.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: CURLversion
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class CURLMSG(override val value: UInt) : CEnum {
    CURLMSG_NONE(0u),
    CURLMSG_DONE(1u),
    CURLMSG_LAST(2u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = CURLMSG.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: CURLMSG
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class CURLUcode(override val value: UInt) : CEnum {
    CURLUE_OK(0u),
    CURLUE_BAD_HANDLE(1u),
    CURLUE_BAD_PARTPOINTER(2u),
    CURLUE_MALFORMED_INPUT(3u),
    CURLUE_BAD_PORT_NUMBER(4u),
    CURLUE_UNSUPPORTED_SCHEME(5u),
    CURLUE_URLDECODE(6u),
    CURLUE_OUT_OF_MEMORY(7u),
    CURLUE_USER_NOT_ALLOWED(8u),
    CURLUE_UNKNOWN_PART(9u),
    CURLUE_NO_SCHEME(10u),
    CURLUE_NO_USER(11u),
    CURLUE_NO_PASSWORD(12u),
    CURLUE_NO_OPTIONS(13u),
    CURLUE_NO_HOST(14u),
    CURLUE_NO_PORT(15u),
    CURLUE_NO_QUERY(16u),
    CURLUE_NO_FRAGMENT(17u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = CURLUcode.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: CURLUcode
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class CURLUPart(override val value: UInt) : CEnum {
    CURLUPART_URL(0u),
    CURLUPART_SCHEME(1u),
    CURLUPART_USER(2u),
    CURLUPART_PASSWORD(3u),
    CURLUPART_OPTIONS(4u),
    CURLUPART_HOST(5u),
    CURLUPART_PORT(6u),
    CURLUPART_PATH(7u),
    CURLUPART_QUERY(8u),
    CURLUPART_FRAGMENT(9u),
    CURLUPART_ZONEID(10u),
    ;
    
    companion object {
        
        fun byValue(value: UInt) = CURLUPart.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: CURLUPart
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

fun curl_strequal(@CCall.CString s1: String?, @CCall.CString s2: String?): Int {
    memScoped {
        return kniBridge0(s1?.cstr?.getPointer(memScope).rawValue, s2?.cstr?.getPointer(memScope).rawValue)
    }
}

fun curl_strnequal(@CCall.CString s1: String?, @CCall.CString s2: String?, n: size_t): Int {
    memScoped {
        return kniBridge1(s1?.cstr?.getPointer(memScope).rawValue, s2?.cstr?.getPointer(memScope).rawValue, n)
    }
}

fun curl_mime_init(easy: CValuesRef<*>?): CPointer<curl_mime>? {
    memScoped {
        return interpretCPointer<curl_mime>(kniBridge2(easy?.getPointer(memScope).rawValue))
    }
}

fun curl_mime_free(mime: CValuesRef<curl_mime>?): Unit {
    memScoped {
        return kniBridge3(mime?.getPointer(memScope).rawValue)
    }
}

fun curl_mime_addpart(mime: CValuesRef<curl_mime>?): CPointer<curl_mimepart>? {
    memScoped {
        return interpretCPointer<curl_mimepart>(kniBridge4(mime?.getPointer(memScope).rawValue))
    }
}

fun curl_mime_name(part: CValuesRef<curl_mimepart>?, @CCall.CString name: String?): CURLcode {
    memScoped {
        return kniBridge5(part?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun curl_mime_filename(part: CValuesRef<curl_mimepart>?, @CCall.CString filename: String?): CURLcode {
    memScoped {
        return kniBridge6(part?.getPointer(memScope).rawValue, filename?.cstr?.getPointer(memScope).rawValue)
    }
}

fun curl_mime_type(part: CValuesRef<curl_mimepart>?, @CCall.CString mimetype: String?): CURLcode {
    memScoped {
        return kniBridge7(part?.getPointer(memScope).rawValue, mimetype?.cstr?.getPointer(memScope).rawValue)
    }
}

fun curl_mime_encoder(part: CValuesRef<curl_mimepart>?, @CCall.CString encoding: String?): CURLcode {
    memScoped {
        return kniBridge8(part?.getPointer(memScope).rawValue, encoding?.cstr?.getPointer(memScope).rawValue)
    }
}

fun curl_mime_data(part: CValuesRef<curl_mimepart>?, @CCall.CString data: String?, datasize: size_t): CURLcode {
    memScoped {
        return kniBridge9(part?.getPointer(memScope).rawValue, data?.cstr?.getPointer(memScope).rawValue, datasize)
    }
}

fun curl_mime_filedata(part: CValuesRef<curl_mimepart>?, @CCall.CString filename: String?): CURLcode {
    memScoped {
        return kniBridge10(part?.getPointer(memScope).rawValue, filename?.cstr?.getPointer(memScope).rawValue)
    }
}

fun curl_mime_data_cb(part: CValuesRef<curl_mimepart>?, datasize: curl_off_t, readfunc: curl_read_callback?, seekfunc: curl_seek_callback?, freefunc: curl_free_callback?, arg: CValuesRef<*>?): CURLcode {
    memScoped {
        return kniBridge11(part?.getPointer(memScope).rawValue, datasize, readfunc.rawValue, seekfunc.rawValue, freefunc.rawValue, arg?.getPointer(memScope).rawValue)
    }
}

fun curl_mime_subparts(part: CValuesRef<curl_mimepart>?, subparts: CValuesRef<curl_mime>?): CURLcode {
    memScoped {
        return kniBridge12(part?.getPointer(memScope).rawValue, subparts?.getPointer(memScope).rawValue)
    }
}

fun curl_mime_headers(part: CValuesRef<curl_mimepart>?, headers: CValuesRef<curl_slist>?, take_ownership: Int): CURLcode {
    memScoped {
        return kniBridge13(part?.getPointer(memScope).rawValue, headers?.getPointer(memScope).rawValue, take_ownership)
    }
}

@CCall("knifunptr_libcurl0")
external fun curl_formadd(httppost: CValuesRef<CPointerVar<curl_httppost>>?, last_post: CValuesRef<CPointerVar<curl_httppost>>?, vararg variadicArguments: Any?): CURLFORMcode

fun curl_formget(form: CValuesRef<curl_httppost>?, arg: CValuesRef<*>?, append: curl_formget_callback?): Int {
    memScoped {
        return kniBridge14(form?.getPointer(memScope).rawValue, arg?.getPointer(memScope).rawValue, append.rawValue)
    }
}

fun curl_formfree(form: CValuesRef<curl_httppost>?): Unit {
    memScoped {
        return kniBridge15(form?.getPointer(memScope).rawValue)
    }
}

fun curl_getenv(@CCall.CString variable: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge16(variable?.cstr?.getPointer(memScope).rawValue))
    }
}

fun curl_version(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge17())
}

fun curl_easy_escape(handle: CValuesRef<*>?, @CCall.CString string: String?, length: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge18(handle?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue, length))
    }
}

fun curl_escape(@CCall.CString string: String?, length: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge19(string?.cstr?.getPointer(memScope).rawValue, length))
    }
}

fun curl_easy_unescape(handle: CValuesRef<*>?, @CCall.CString string: String?, length: Int, outlength: CValuesRef<IntVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge20(handle?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue, length, outlength?.getPointer(memScope).rawValue))
    }
}

fun curl_unescape(@CCall.CString string: String?, length: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge21(string?.cstr?.getPointer(memScope).rawValue, length))
    }
}

fun curl_free(p: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge22(p?.getPointer(memScope).rawValue)
    }
}

fun curl_global_init(flags: Long): CURLcode {
    return kniBridge23(flags)
}

fun curl_global_init_mem(flags: Long, m: curl_malloc_callback?, f: curl_free_callback?, r: curl_realloc_callback?, s: curl_strdup_callback?, c: curl_calloc_callback?): CURLcode {
    return kniBridge24(flags, m.rawValue, f.rawValue, r.rawValue, s.rawValue, c.rawValue)
}

fun curl_global_cleanup(): Unit {
    return kniBridge25()
}

fun curl_global_sslset(id: curl_sslbackend, @CCall.CString name: String?, avail: CValuesRef<CPointerVar<CPointerVar<curl_ssl_backend>>>?): CURLsslset {
    memScoped {
        return kniBridge26(id, name?.cstr?.getPointer(memScope).rawValue, avail?.getPointer(memScope).rawValue)
    }
}

fun curl_slist_append(arg0: CValuesRef<curl_slist>?, @CCall.CString arg1: String?): CPointer<curl_slist>? {
    memScoped {
        return interpretCPointer<curl_slist>(kniBridge27(arg0?.getPointer(memScope).rawValue, arg1?.cstr?.getPointer(memScope).rawValue))
    }
}

fun curl_slist_free_all(arg0: CValuesRef<curl_slist>?): Unit {
    memScoped {
        return kniBridge28(arg0?.getPointer(memScope).rawValue)
    }
}

fun curl_getdate(@CCall.CString p: String?, unused: CValuesRef<time_tVar>?): time_t {
    memScoped {
        return kniBridge29(p?.cstr?.getPointer(memScope).rawValue, unused?.getPointer(memScope).rawValue)
    }
}

fun curl_share_init(): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge30())
}

@CCall("knifunptr_libcurl1")
external fun curl_share_setopt(arg0: CValuesRef<*>?, option: CURLSHoption, vararg variadicArguments: Any?): CURLSHcode

fun curl_share_cleanup(arg0: CValuesRef<*>?): CURLSHcode {
    memScoped {
        return CURLSHcode.byValue(kniBridge31(arg0?.getPointer(memScope).rawValue))
    }
}

fun curl_version_info(arg0: CURLversion): CPointer<curl_version_info_data>? {
    return interpretCPointer<curl_version_info_data>(kniBridge32(arg0.value))
}

fun curl_easy_strerror(arg0: CURLcode): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge33(arg0))
}

fun curl_share_strerror(arg0: CURLSHcode): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge34(arg0.value))
}

fun curl_easy_pause(handle: CValuesRef<*>?, bitmask: Int): CURLcode {
    memScoped {
        return kniBridge35(handle?.getPointer(memScope).rawValue, bitmask)
    }
}

fun curl_easy_init(): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge36())
}

@CCall("knifunptr_libcurl2")
external fun curl_easy_setopt(curl: CValuesRef<*>?, option: CURLoption, vararg variadicArguments: Any?): CURLcode

fun curl_easy_perform(curl: CValuesRef<*>?): CURLcode {
    memScoped {
        return kniBridge37(curl?.getPointer(memScope).rawValue)
    }
}

fun curl_easy_cleanup(curl: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge38(curl?.getPointer(memScope).rawValue)
    }
}

@CCall("knifunptr_libcurl3")
external fun curl_easy_getinfo(curl: CValuesRef<*>?, info: CURLINFO, vararg variadicArguments: Any?): CURLcode

fun curl_easy_duphandle(curl: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge39(curl?.getPointer(memScope).rawValue))
    }
}

fun curl_easy_reset(curl: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge40(curl?.getPointer(memScope).rawValue)
    }
}

fun curl_easy_recv(curl: CValuesRef<*>?, buffer: CValuesRef<*>?, buflen: size_t, n: CValuesRef<size_tVar>?): CURLcode {
    memScoped {
        return kniBridge41(curl?.getPointer(memScope).rawValue, buffer?.getPointer(memScope).rawValue, buflen, n?.getPointer(memScope).rawValue)
    }
}

fun curl_easy_send(curl: CValuesRef<*>?, buffer: CValuesRef<*>?, buflen: size_t, n: CValuesRef<size_tVar>?): CURLcode {
    memScoped {
        return kniBridge42(curl?.getPointer(memScope).rawValue, buffer?.getPointer(memScope).rawValue, buflen, n?.getPointer(memScope).rawValue)
    }
}

fun curl_easy_upkeep(curl: CValuesRef<*>?): CURLcode {
    memScoped {
        return kniBridge43(curl?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_init(): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge44())
}

fun curl_multi_add_handle(multi_handle: CValuesRef<*>?, curl_handle: CValuesRef<*>?): CURLMcode {
    memScoped {
        return kniBridge45(multi_handle?.getPointer(memScope).rawValue, curl_handle?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_remove_handle(multi_handle: CValuesRef<*>?, curl_handle: CValuesRef<*>?): CURLMcode {
    memScoped {
        return kniBridge46(multi_handle?.getPointer(memScope).rawValue, curl_handle?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_fdset(multi_handle: CValuesRef<*>?, read_fd_set: CValuesRef<fd_set>?, write_fd_set: CValuesRef<fd_set>?, exc_fd_set: CValuesRef<fd_set>?, max_fd: CValuesRef<IntVar>?): CURLMcode {
    memScoped {
        return kniBridge47(multi_handle?.getPointer(memScope).rawValue, read_fd_set?.getPointer(memScope).rawValue, write_fd_set?.getPointer(memScope).rawValue, exc_fd_set?.getPointer(memScope).rawValue, max_fd?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_wait(multi_handle: CValuesRef<*>?, extra_fds: CValuesRef<curl_waitfd>?, extra_nfds: UInt, timeout_ms: Int, ret: CValuesRef<IntVar>?): CURLMcode {
    memScoped {
        return kniBridge48(multi_handle?.getPointer(memScope).rawValue, extra_fds?.getPointer(memScope).rawValue, extra_nfds, timeout_ms, ret?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_poll(multi_handle: CValuesRef<*>?, extra_fds: CValuesRef<curl_waitfd>?, extra_nfds: UInt, timeout_ms: Int, ret: CValuesRef<IntVar>?): CURLMcode {
    memScoped {
        return kniBridge49(multi_handle?.getPointer(memScope).rawValue, extra_fds?.getPointer(memScope).rawValue, extra_nfds, timeout_ms, ret?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_perform(multi_handle: CValuesRef<*>?, running_handles: CValuesRef<IntVar>?): CURLMcode {
    memScoped {
        return kniBridge50(multi_handle?.getPointer(memScope).rawValue, running_handles?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_cleanup(multi_handle: CValuesRef<*>?): CURLMcode {
    memScoped {
        return kniBridge51(multi_handle?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_info_read(multi_handle: CValuesRef<*>?, msgs_in_queue: CValuesRef<IntVar>?): CPointer<CURLMsg>? {
    memScoped {
        return interpretCPointer<CURLMsg>(kniBridge52(multi_handle?.getPointer(memScope).rawValue, msgs_in_queue?.getPointer(memScope).rawValue))
    }
}

fun curl_multi_strerror(arg0: CURLMcode): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge53(arg0))
}

fun curl_multi_socket(multi_handle: CValuesRef<*>?, s: curl_socket_t, running_handles: CValuesRef<IntVar>?): CURLMcode {
    memScoped {
        return kniBridge54(multi_handle?.getPointer(memScope).rawValue, s, running_handles?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_socket_action(multi_handle: CValuesRef<*>?, s: curl_socket_t, ev_bitmask: Int, running_handles: CValuesRef<IntVar>?): CURLMcode {
    memScoped {
        return kniBridge55(multi_handle?.getPointer(memScope).rawValue, s, ev_bitmask, running_handles?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_socket_all(multi_handle: CValuesRef<*>?, running_handles: CValuesRef<IntVar>?): CURLMcode {
    memScoped {
        return kniBridge56(multi_handle?.getPointer(memScope).rawValue, running_handles?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_timeout(multi_handle: CValuesRef<*>?, milliseconds: CValuesRef<LongVar>?): CURLMcode {
    memScoped {
        return kniBridge57(multi_handle?.getPointer(memScope).rawValue, milliseconds?.getPointer(memScope).rawValue)
    }
}

@CCall("knifunptr_libcurl4")
external fun curl_multi_setopt(multi_handle: CValuesRef<*>?, option: CURLMoption, vararg variadicArguments: Any?): CURLMcode

fun curl_multi_assign(multi_handle: CValuesRef<*>?, sockfd: curl_socket_t, sockp: CValuesRef<*>?): CURLMcode {
    memScoped {
        return kniBridge58(multi_handle?.getPointer(memScope).rawValue, sockfd, sockp?.getPointer(memScope).rawValue)
    }
}

fun curl_pushheader_bynum(h: CValuesRef<curl_pushheaders>?, num: size_t): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge59(h?.getPointer(memScope).rawValue, num))
    }
}

fun curl_pushheader_byname(h: CValuesRef<curl_pushheaders>?, @CCall.CString name: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge60(h?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun curl_url(): CPointer<CURLU>? {
    return interpretCPointer<CURLU>(kniBridge61())
}

fun curl_url_cleanup(handle: CValuesRef<CURLU>?): Unit {
    memScoped {
        return kniBridge62(handle?.getPointer(memScope).rawValue)
    }
}

fun curl_url_dup(`in`: CValuesRef<CURLU>?): CPointer<CURLU>? {
    memScoped {
        return interpretCPointer<CURLU>(kniBridge63(`in`?.getPointer(memScope).rawValue))
    }
}

fun curl_url_get(handle: CValuesRef<CURLU>?, what: CURLUPart, part: CValuesRef<CPointerVar<ByteVar>>?, flags: UInt): CURLUcode {
    memScoped {
        return CURLUcode.byValue(kniBridge64(handle?.getPointer(memScope).rawValue, what.value, part?.getPointer(memScope).rawValue, flags))
    }
}

fun curl_url_set(handle: CValuesRef<CURLU>?, what: CURLUPart, @CCall.CString part: String?, flags: UInt): CURLUcode {
    memScoped {
        return CURLUcode.byValue(kniBridge65(handle?.getPointer(memScope).rawValue, what.value, part?.cstr?.getPointer(memScope).rawValue, flags))
    }
}

val LIBCURL_COPYRIGHT: String get() = "1996 \u002D 2019 Daniel Stenberg, \u003Cdaniel@haxx.se\u003E."

val LIBCURL_VERSION: String get() = "7.66.0"

const val LIBCURL_VERSION_MAJOR: Int = 7

const val LIBCURL_VERSION_MINOR: Int = 66

const val LIBCURL_VERSION_PATCH: Int = 0

const val LIBCURL_VERSION_NUM: Int = 475648

val LIBCURL_TIMESTAMP: String get() = "2019\u002D09\u002D11"

val CURL_FORMAT_CURL_OFF_T: String get() = "ld"

val CURL_FORMAT_CURL_OFF_TU: String get() = "lu"

const val CURL_PULL_SYS_TYPES_H: Int = 1

const val CURL_PULL_SYS_SOCKET_H: Int = 1

const val CURL_SOCKET_BAD: Int = -1

const val CURLSSLBACKEND_LIBRESSL: Int = 1

const val CURLSSLBACKEND_BORINGSSL: Int = 1

const val CURLSSLBACKEND_CYASSL: Int = 7

const val CURLSSLBACKEND_DARWINSSL: Int = 9

const val CURL_HTTPPOST_FILENAME: Int = 1

const val CURL_HTTPPOST_READFILE: Int = 2

const val CURL_HTTPPOST_PTRNAME: Int = 4

const val CURL_HTTPPOST_PTRCONTENTS: Int = 8

const val CURL_HTTPPOST_BUFFER: Int = 16

const val CURL_HTTPPOST_PTRBUFFER: Int = 32

const val CURL_HTTPPOST_CALLBACK: Int = 64

const val CURL_HTTPPOST_LARGE: Int = 128

const val CURL_MAX_READ_SIZE: Int = 524288

const val CURL_MAX_WRITE_SIZE: Int = 16384

const val CURL_MAX_HTTP_HEADER: Int = 102400

const val CURL_WRITEFUNC_PAUSE: Int = 268435457

const val CURLFINFOFLAG_KNOWN_FILENAME: Int = 1

const val CURLFINFOFLAG_KNOWN_FILETYPE: Int = 2

const val CURLFINFOFLAG_KNOWN_TIME: Int = 4

const val CURLFINFOFLAG_KNOWN_PERM: Int = 8

const val CURLFINFOFLAG_KNOWN_UID: Int = 16

const val CURLFINFOFLAG_KNOWN_GID: Int = 32

const val CURLFINFOFLAG_KNOWN_SIZE: Int = 64

const val CURLFINFOFLAG_KNOWN_HLINKCOUNT: Int = 128

const val CURL_CHUNK_BGN_FUNC_OK: Int = 0

const val CURL_CHUNK_BGN_FUNC_FAIL: Int = 1

const val CURL_CHUNK_BGN_FUNC_SKIP: Int = 2

const val CURL_CHUNK_END_FUNC_OK: Int = 0

const val CURL_CHUNK_END_FUNC_FAIL: Int = 1

const val CURL_FNMATCHFUNC_MATCH: Int = 0

const val CURL_FNMATCHFUNC_NOMATCH: Int = 1

const val CURL_FNMATCHFUNC_FAIL: Int = 2

const val CURL_SEEKFUNC_OK: Int = 0

const val CURL_SEEKFUNC_FAIL: Int = 1

const val CURL_SEEKFUNC_CANTSEEK: Int = 2

const val CURL_READFUNC_ABORT: Int = 268435456

const val CURL_READFUNC_PAUSE: Int = 268435457

const val CURL_TRAILERFUNC_OK: Int = 0

const val CURL_TRAILERFUNC_ABORT: Int = 1

const val CURL_SOCKOPT_OK: Int = 0

const val CURL_SOCKOPT_ERROR: Int = 1

const val CURL_SOCKOPT_ALREADY_CONNECTED: Int = 2

const val CURLE_OBSOLETE16: Int = 16

const val CURLE_OBSOLETE10: Int = 10

const val CURLE_OBSOLETE12: Int = 12

const val CURLOPT_ENCODING: Int = 10102

const val CURLE_FTP_WEIRD_SERVER_REPLY: Int = 8

const val CURLE_SSL_CACERT: Int = 60

const val CURLE_UNKNOWN_TELNET_OPTION: Int = 48

const val CURLE_SSL_PEER_CERTIFICATE: Int = 60

const val CURLE_OBSOLETE: Int = 50

const val CURLE_BAD_PASSWORD_ENTERED: Int = 46

const val CURLE_BAD_CALLING_ORDER: Int = 44

const val CURLE_FTP_USER_PASSWORD_INCORRECT: Int = 10

const val CURLE_FTP_CANT_RECONNECT: Int = 16

const val CURLE_FTP_COULDNT_GET_SIZE: Int = 32

const val CURLE_FTP_COULDNT_SET_ASCII: Int = 29

const val CURLE_FTP_WEIRD_USER_REPLY: Int = 12

const val CURLE_FTP_WRITE_ERROR: Int = 20

const val CURLE_LIBRARY_NOT_FOUND: Int = 40

const val CURLE_MALFORMAT_USER: Int = 24

const val CURLE_SHARE_IN_USE: Int = 57

const val CURLE_URL_MALFORMAT_USER: Int = 4

const val CURLE_FTP_ACCESS_DENIED: Int = 9

const val CURLE_FTP_COULDNT_SET_BINARY: Int = 17

const val CURLE_FTP_QUOTE_ERROR: Int = 21

const val CURLE_TFTP_DISKFULL: Int = 70

const val CURLE_TFTP_EXISTS: Int = 73

const val CURLE_HTTP_RANGE_ERROR: Int = 33

const val CURLE_FTP_SSL_FAILED: Int = 64

const val CURLE_OPERATION_TIMEOUTED: Int = 28

const val CURLE_HTTP_NOT_FOUND: Int = 22

const val CURLE_HTTP_PORT_FAILED: Int = 45

const val CURLE_FTP_COULDNT_STOR_FILE: Int = 25

const val CURLE_FTP_PARTIAL_FILE: Int = 18

const val CURLE_FTP_BAD_DOWNLOAD_RESUME: Int = 36

const val CURLE_ALREADY_COMPLETE: Int = 99999

const val CURLOPT_FILE: Int = 10001

const val CURLOPT_INFILE: Int = 10009

const val CURLOPT_WRITEHEADER: Int = 10029

const val CURLOPT_WRITEINFO: Int = 10040

const val CURLOPT_CLOSEPOLICY: Int = 72

const val CURLAUTH_NONE: ULong = 0u

const val CURLAUTH_BASIC: ULong = 1u

const val CURLAUTH_DIGEST: ULong = 2u

const val CURLAUTH_NEGOTIATE: ULong = 4u

const val CURLAUTH_GSSNEGOTIATE: ULong = 4u

const val CURLAUTH_GSSAPI: ULong = 4u

const val CURLAUTH_NTLM: ULong = 8u

const val CURLAUTH_DIGEST_IE: ULong = 16u

const val CURLAUTH_NTLM_WB: ULong = 32u

const val CURLAUTH_BEARER: ULong = 64u

const val CURLAUTH_ONLY: ULong = 2147483648u

const val CURLAUTH_ANY: ULong = 18446744073709551599u

const val CURLAUTH_ANYSAFE: ULong = 18446744073709551598u

const val CURLSSH_AUTH_ANY: Int = -1

const val CURLSSH_AUTH_NONE: Int = 0

const val CURLSSH_AUTH_PUBLICKEY: Int = 1

const val CURLSSH_AUTH_PASSWORD: Int = 2

const val CURLSSH_AUTH_HOST: Int = 4

const val CURLSSH_AUTH_KEYBOARD: Int = 8

const val CURLSSH_AUTH_AGENT: Int = 16

const val CURLSSH_AUTH_GSSAPI: Int = 32

const val CURLSSH_AUTH_DEFAULT: Int = -1

const val CURLGSSAPI_DELEGATION_NONE: Int = 0

const val CURLGSSAPI_DELEGATION_POLICY_FLAG: Int = 1

const val CURLGSSAPI_DELEGATION_FLAG: Int = 2

const val CURL_ERROR_SIZE: Int = 256

const val CURLSSLOPT_ALLOW_BEAST: Int = 1

const val CURLSSLOPT_NO_REVOKE: Int = 2

const val CURL_HET_DEFAULT: Long = 200

const val CURL_UPKEEP_INTERVAL_DEFAULT: Long = 60000

const val CURLFTPSSL_NONE: Int = 0

const val CURLFTPSSL_TRY: Int = 1

const val CURLFTPSSL_CONTROL: Int = 2

const val CURLFTPSSL_ALL: Int = 3

const val CURLFTPSSL_LAST: Int = 4

const val CURLHEADER_UNIFIED: Int = 0

const val CURLHEADER_SEPARATE: Int = 1

const val CURLALTSVC_IMMEDIATELY: Int = 1

const val CURLALTSVC_READONLYFILE: Int = 4

const val CURLALTSVC_H1: Int = 8

const val CURLALTSVC_H2: Int = 16

const val CURLALTSVC_H3: Int = 32

const val CURLPROTO_HTTP: Int = 1

const val CURLPROTO_HTTPS: Int = 2

const val CURLPROTO_FTP: Int = 4

const val CURLPROTO_FTPS: Int = 8

const val CURLPROTO_SCP: Int = 16

const val CURLPROTO_SFTP: Int = 32

const val CURLPROTO_TELNET: Int = 64

const val CURLPROTO_LDAP: Int = 128

const val CURLPROTO_LDAPS: Int = 256

const val CURLPROTO_DICT: Int = 512

const val CURLPROTO_FILE: Int = 1024

const val CURLPROTO_TFTP: Int = 2048

const val CURLPROTO_IMAP: Int = 4096

const val CURLPROTO_IMAPS: Int = 8192

const val CURLPROTO_POP3: Int = 16384

const val CURLPROTO_POP3S: Int = 32768

const val CURLPROTO_SMTP: Int = 65536

const val CURLPROTO_SMTPS: Int = 131072

const val CURLPROTO_RTSP: Int = 262144

const val CURLPROTO_RTMP: Int = 524288

const val CURLPROTO_RTMPT: Int = 1048576

const val CURLPROTO_RTMPE: Int = 2097152

const val CURLPROTO_RTMPTE: Int = 4194304

const val CURLPROTO_RTMPS: Int = 8388608

const val CURLPROTO_RTMPTS: Int = 16777216

const val CURLPROTO_GOPHER: Int = 33554432

const val CURLPROTO_SMB: Int = 67108864

const val CURLPROTO_SMBS: Int = 134217728

const val CURLPROTO_ALL: Int = -1

const val CURLOPTTYPE_LONG: Int = 0

const val CURLOPTTYPE_OBJECTPOINT: Int = 10000

const val CURLOPTTYPE_FUNCTIONPOINT: Int = 20000

const val CURLOPTTYPE_OFF_T: Int = 30000

const val CURLOPTTYPE_STRINGPOINT: Int = 10000

const val CURLOPTTYPE_SLISTPOINT: Int = 10000

const val CURLOPT_XFERINFODATA: Int = 10057

const val CURLOPT_SERVER_RESPONSE_TIMEOUT: Int = 112

const val CURLOPT_POST301: Int = 161

const val CURLOPT_SSLKEYPASSWD: Int = 10026

const val CURLOPT_FTPAPPEND: Int = 50

const val CURLOPT_FTPLISTONLY: Int = 48

const val CURLOPT_FTP_SSL: Int = 119

const val CURLOPT_SSLCERTPASSWD: Int = 10026

const val CURLOPT_KRB4LEVEL: Int = 10063

const val CURL_IPRESOLVE_WHATEVER: Int = 0

const val CURL_IPRESOLVE_V4: Int = 1

const val CURL_IPRESOLVE_V6: Int = 2

const val CURLOPT_RTSPHEADER: Int = 10023

const val CURL_HTTP_VERSION_2: Int = 3

const val CURL_REDIR_GET_ALL: Int = 0

const val CURL_REDIR_POST_301: Int = 1

const val CURL_REDIR_POST_302: Int = 2

const val CURL_REDIR_POST_303: Int = 4

const val CURL_REDIR_POST_ALL: Int = 7

const val CURL_ZERO_TERMINATED: size_t = 18446744073709551615u

const val CURLINFO_STRING: Int = 1048576

const val CURLINFO_LONG: Int = 2097152

const val CURLINFO_DOUBLE: Int = 3145728

const val CURLINFO_SLIST: Int = 4194304

const val CURLINFO_PTR: Int = 4194304

const val CURLINFO_SOCKET: Int = 5242880

const val CURLINFO_OFF_T: Int = 6291456

const val CURLINFO_MASK: Int = 1048575

const val CURLINFO_TYPEMASK: Int = 15728640

const val CURLINFO_HTTP_CODE: Int = 2097154

const val CURL_GLOBAL_SSL: Int = 1

const val CURL_GLOBAL_WIN32: Int = 2

const val CURL_GLOBAL_ALL: Int = 3

const val CURL_GLOBAL_NOTHING: Int = 0

const val CURL_GLOBAL_DEFAULT: Int = 3

const val CURL_GLOBAL_ACK_EINTR: Int = 4

const val CURLVERSION_NOW: Int = 5

const val CURL_VERSION_IPV6: Int = 1

const val CURL_VERSION_KERBEROS4: Int = 2

const val CURL_VERSION_SSL: Int = 4

const val CURL_VERSION_LIBZ: Int = 8

const val CURL_VERSION_NTLM: Int = 16

const val CURL_VERSION_GSSNEGOTIATE: Int = 32

const val CURL_VERSION_DEBUG: Int = 64

const val CURL_VERSION_ASYNCHDNS: Int = 128

const val CURL_VERSION_SPNEGO: Int = 256

const val CURL_VERSION_LARGEFILE: Int = 512

const val CURL_VERSION_IDN: Int = 1024

const val CURL_VERSION_SSPI: Int = 2048

const val CURL_VERSION_CONV: Int = 4096

const val CURL_VERSION_CURLDEBUG: Int = 8192

const val CURL_VERSION_TLSAUTH_SRP: Int = 16384

const val CURL_VERSION_NTLM_WB: Int = 32768

const val CURL_VERSION_HTTP2: Int = 65536

const val CURL_VERSION_GSSAPI: Int = 131072

const val CURL_VERSION_KERBEROS5: Int = 262144

const val CURL_VERSION_UNIX_SOCKETS: Int = 524288

const val CURL_VERSION_PSL: Int = 1048576

const val CURL_VERSION_HTTPS_PROXY: Int = 2097152

const val CURL_VERSION_MULTI_SSL: Int = 4194304

const val CURL_VERSION_BROTLI: Int = 8388608

const val CURL_VERSION_ALTSVC: Int = 16777216

const val CURL_VERSION_HTTP3: Int = 33554432

const val CURLPAUSE_RECV: Int = 1

const val CURLPAUSE_RECV_CONT: Int = 0

const val CURLPAUSE_SEND: Int = 4

const val CURLPAUSE_SEND_CONT: Int = 0

const val CURLPAUSE_ALL: Int = 5

const val CURLPAUSE_CONT: Int = 0

const val CURLM_CALL_MULTI_SOCKET: Int = -1

const val CURLPIPE_NOTHING: Long = 0

const val CURLPIPE_HTTP1: Long = 1

const val CURLPIPE_MULTIPLEX: Long = 2

const val CURL_WAIT_POLLIN: Int = 1

const val CURL_WAIT_POLLPRI: Int = 2

const val CURL_WAIT_POLLOUT: Int = 4

const val CURL_POLL_NONE: Int = 0

const val CURL_POLL_IN: Int = 1

const val CURL_POLL_OUT: Int = 2

const val CURL_POLL_INOUT: Int = 3

const val CURL_POLL_REMOVE: Int = 4

const val CURL_SOCKET_TIMEOUT: Int = -1

const val CURL_CSELECT_IN: Int = 1

const val CURL_CSELECT_OUT: Int = 2

const val CURL_CSELECT_ERR: Int = 4

const val CURL_PUSH_OK: Int = 0

const val CURL_PUSH_DENY: Int = 1

const val CURLU_DEFAULT_PORT: Int = 1

const val CURLU_NO_DEFAULT_PORT: Int = 2

const val CURLU_DEFAULT_SCHEME: Int = 4

const val CURLU_NON_SUPPORT_SCHEME: Int = 8

const val CURLU_PATH_AS_IS: Int = 16

const val CURLU_DISALLOW_USER: Int = 32

const val CURLU_URLDECODE: Int = 64

const val CURLU_URLENCODE: Int = 128

const val CURLU_APPENDQUERY: Int = 256

const val CURLU_GUESS_SCHEME: Int = 512

typealias __socklen_tVar = UIntVarOf<__socklen_t>

typealias __socklen_t = UInt

typealias socklen_tVar = UIntVarOf<socklen_t>

typealias socklen_t = __socklen_t

typealias curl_socklen_tVar = UIntVarOf<curl_socklen_t>

typealias curl_socklen_t = socklen_t

typealias curl_off_tVar = LongVarOf<curl_off_t>

typealias curl_off_t = Long

typealias curl_socket_tVar = IntVarOf<curl_socket_t>

typealias curl_socket_t = Int

typealias curl_progress_callbackVar = CPointerVarOf<curl_progress_callback>

typealias curl_progress_callback = CPointer<CFunction<(COpaquePointer?, Double, Double, Double, Double) -> Int>>

typealias curl_xferinfo_callbackVar = CPointerVarOf<curl_xferinfo_callback>

typealias curl_xferinfo_callback = CPointer<CFunction<(COpaquePointer?, curl_off_t, curl_off_t, curl_off_t, curl_off_t) -> Int>>

typealias curl_write_callbackVar = CPointerVarOf<curl_write_callback>

typealias curl_write_callback = CPointer<CFunction<(CPointer<ByteVar>?, size_t, size_t, COpaquePointer?) -> size_t>>

typealias curl_resolver_start_callbackVar = CPointerVarOf<curl_resolver_start_callback>

typealias curl_resolver_start_callback = CPointer<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int>>

typealias __time_tVar = LongVarOf<__time_t>

typealias __time_t = Long

typealias time_tVar = LongVarOf<time_t>

typealias time_t = __time_t

typealias curl_chunk_bgn_callbackVar = CPointerVarOf<curl_chunk_bgn_callback>

typealias curl_chunk_bgn_callback = CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int) -> Long>>

typealias curl_chunk_end_callbackVar = CPointerVarOf<curl_chunk_end_callback>

typealias curl_chunk_end_callback = CPointer<CFunction<(COpaquePointer?) -> Long>>

typealias curl_fnmatch_callbackVar = CPointerVarOf<curl_fnmatch_callback>

typealias curl_fnmatch_callback = CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>

typealias curl_seek_callbackVar = CPointerVarOf<curl_seek_callback>

typealias curl_seek_callback = CPointer<CFunction<(COpaquePointer?, curl_off_t, Int) -> Int>>

typealias curl_read_callbackVar = CPointerVarOf<curl_read_callback>

typealias curl_read_callback = CPointer<CFunction<(CPointer<ByteVar>?, size_t, size_t, COpaquePointer?) -> size_t>>

typealias curl_trailer_callbackVar = CPointerVarOf<curl_trailer_callback>

typealias curl_trailer_callback = CPointer<CFunction<(CPointer<CPointerVar<curl_slist>>?, COpaquePointer?) -> Int>>

typealias curl_sockopt_callbackVar = CPointerVarOf<curl_sockopt_callback>

typealias curl_sockopt_callback = CPointer<CFunction<(COpaquePointer?, curl_socket_t, curlsocktype) -> Int>>

typealias sa_family_tVar = UShortVarOf<sa_family_t>

typealias sa_family_t = UShort

typealias curl_opensocket_callbackVar = CPointerVarOf<curl_opensocket_callback>

typealias curl_opensocket_callback = CPointer<CFunction<(COpaquePointer?, curlsocktype, CPointer<curl_sockaddr>?) -> curl_socket_t>>

typealias curl_closesocket_callbackVar = CPointerVarOf<curl_closesocket_callback>

typealias curl_closesocket_callback = CPointer<CFunction<(COpaquePointer?, curl_socket_t) -> Int>>

typealias curl_ioctl_callbackVar = CPointerVarOf<curl_ioctl_callback>

typealias curl_ioctl_callback = CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?) -> curlioerr>>

typealias curl_malloc_callbackVar = CPointerVarOf<curl_malloc_callback>

typealias curl_malloc_callback = CPointer<CFunction<(size_t) -> COpaquePointer?>>

typealias curl_free_callbackVar = CPointerVarOf<curl_free_callback>

typealias curl_free_callback = CPointer<CFunction<(COpaquePointer?) -> Unit>>

typealias curl_realloc_callbackVar = CPointerVarOf<curl_realloc_callback>

typealias curl_realloc_callback = CPointer<CFunction<(COpaquePointer?, size_t) -> COpaquePointer?>>

typealias curl_strdup_callbackVar = CPointerVarOf<curl_strdup_callback>

typealias curl_strdup_callback = CPointer<CFunction<(CPointer<ByteVar>?) -> CPointer<ByteVar>?>>

typealias curl_calloc_callbackVar = CPointerVarOf<curl_calloc_callback>

typealias curl_calloc_callback = CPointer<CFunction<(size_t, size_t) -> COpaquePointer?>>

typealias curl_debug_callbackVar = CPointerVarOf<curl_debug_callback>

typealias curl_debug_callback = CPointer<CFunction<(COpaquePointer?, curl_infotype, CPointer<ByteVar>?, size_t, COpaquePointer?) -> Int>>

typealias curl_conv_callbackVar = CPointerVarOf<curl_conv_callback>

typealias curl_conv_callback = CPointer<CFunction<(CPointer<ByteVar>?, size_t) -> CURLcode>>

typealias curl_ssl_ctx_callbackVar = CPointerVarOf<curl_ssl_ctx_callback>

typealias curl_ssl_ctx_callback = CPointer<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CURLcode>>

typealias curl_sshkeycallbackVar = CPointerVarOf<curl_sshkeycallback>

typealias curl_sshkeycallback = CPointer<CFunction<(COpaquePointer?, CPointer<curl_khkey>?, CPointer<curl_khkey>?, curl_khmatch, COpaquePointer?) -> Int>>

typealias curl_mime = curl_mime_s

typealias curl_mimepart = curl_mimepart_s

typealias curl_formget_callbackVar = CPointerVarOf<curl_formget_callback>

typealias curl_formget_callback = CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, size_t) -> size_t>>

typealias curl_lock_functionVar = CPointerVarOf<curl_lock_function>

typealias curl_lock_function = CPointer<CFunction<(COpaquePointer?, curl_lock_data, curl_lock_access, COpaquePointer?) -> Unit>>

typealias curl_unlock_functionVar = CPointerVarOf<curl_unlock_function>

typealias curl_unlock_function = CPointer<CFunction<(COpaquePointer?, curl_lock_data, COpaquePointer?) -> Unit>>

typealias __fd_maskVar = LongVarOf<__fd_mask>

typealias __fd_mask = Long

typealias curl_socket_callbackVar = CPointerVarOf<curl_socket_callback>

typealias curl_socket_callback = CPointer<CFunction<(COpaquePointer?, curl_socket_t, Int, COpaquePointer?, COpaquePointer?) -> Int>>

typealias curl_multi_timer_callbackVar = CPointerVarOf<curl_multi_timer_callback>

typealias curl_multi_timer_callback = CPointer<CFunction<(COpaquePointer?, Long, COpaquePointer?) -> Int>>

typealias curl_push_callbackVar = CPointerVarOf<curl_push_callback>

typealias curl_push_callback = CPointer<CFunction<(COpaquePointer?, COpaquePointer?, size_t, CPointer<curl_pushheaders>?, COpaquePointer?) -> Int>>

typealias CURLU = Curl_URL


val CURLSSLBACKEND_NONE: curl_sslbackend get() = 0u

val CURLSSLBACKEND_OPENSSL: curl_sslbackend get() = 1u

val CURLSSLBACKEND_GNUTLS: curl_sslbackend get() = 2u

val CURLSSLBACKEND_NSS: curl_sslbackend get() = 3u

val CURLSSLBACKEND_OBSOLETE4: curl_sslbackend get() = 4u

val CURLSSLBACKEND_GSKIT: curl_sslbackend get() = 5u

val CURLSSLBACKEND_POLARSSL: curl_sslbackend get() = 6u

val CURLSSLBACKEND_WOLFSSL: curl_sslbackend get() = 7u

val CURLSSLBACKEND_SCHANNEL: curl_sslbackend get() = 8u

val CURLSSLBACKEND_SECURETRANSPORT: curl_sslbackend get() = 9u

val CURLSSLBACKEND_AXTLS: curl_sslbackend get() = 10u

val CURLSSLBACKEND_MBEDTLS: curl_sslbackend get() = 11u

val CURLSSLBACKEND_MESALINK: curl_sslbackend get() = 12u

typealias curl_sslbackendVar = UIntVarOf<curl_sslbackend>

typealias curl_sslbackend = UInt


val CURLFILETYPE_FILE: curlfiletype get() = 0u

val CURLFILETYPE_DIRECTORY: curlfiletype get() = 1u

val CURLFILETYPE_SYMLINK: curlfiletype get() = 2u

val CURLFILETYPE_DEVICE_BLOCK: curlfiletype get() = 3u

val CURLFILETYPE_DEVICE_CHAR: curlfiletype get() = 4u

val CURLFILETYPE_NAMEDPIPE: curlfiletype get() = 5u

val CURLFILETYPE_SOCKET: curlfiletype get() = 6u

val CURLFILETYPE_DOOR: curlfiletype get() = 7u

val CURLFILETYPE_UNKNOWN: curlfiletype get() = 8u

typealias curlfiletypeVar = UIntVarOf<curlfiletype>

typealias curlfiletype = UInt


val CURLINFO_TEXT: curl_infotype get() = 0u

val CURLINFO_HEADER_IN: curl_infotype get() = 1u

val CURLINFO_HEADER_OUT: curl_infotype get() = 2u

val CURLINFO_DATA_IN: curl_infotype get() = 3u

val CURLINFO_DATA_OUT: curl_infotype get() = 4u

val CURLINFO_SSL_DATA_IN: curl_infotype get() = 5u

val CURLINFO_SSL_DATA_OUT: curl_infotype get() = 6u

val CURLINFO_END: curl_infotype get() = 7u

typealias curl_infotypeVar = UIntVarOf<curl_infotype>

typealias curl_infotype = UInt


val CURLE_OK: CURLcode get() = 0u

val CURLE_UNSUPPORTED_PROTOCOL: CURLcode get() = 1u

val CURLE_FAILED_INIT: CURLcode get() = 2u

val CURLE_URL_MALFORMAT: CURLcode get() = 3u

val CURLE_NOT_BUILT_IN: CURLcode get() = 4u

val CURLE_COULDNT_RESOLVE_PROXY: CURLcode get() = 5u

val CURLE_COULDNT_RESOLVE_HOST: CURLcode get() = 6u

val CURLE_COULDNT_CONNECT: CURLcode get() = 7u

val CURLE_WEIRD_SERVER_REPLY: CURLcode get() = 8u

val CURLE_REMOTE_ACCESS_DENIED: CURLcode get() = 9u

val CURLE_FTP_ACCEPT_FAILED: CURLcode get() = 10u

val CURLE_FTP_WEIRD_PASS_REPLY: CURLcode get() = 11u

val CURLE_FTP_ACCEPT_TIMEOUT: CURLcode get() = 12u

val CURLE_FTP_WEIRD_PASV_REPLY: CURLcode get() = 13u

val CURLE_FTP_WEIRD_227_FORMAT: CURLcode get() = 14u

val CURLE_FTP_CANT_GET_HOST: CURLcode get() = 15u

val CURLE_HTTP2: CURLcode get() = 16u

val CURLE_FTP_COULDNT_SET_TYPE: CURLcode get() = 17u

val CURLE_PARTIAL_FILE: CURLcode get() = 18u

val CURLE_FTP_COULDNT_RETR_FILE: CURLcode get() = 19u

val CURLE_OBSOLETE20: CURLcode get() = 20u

val CURLE_QUOTE_ERROR: CURLcode get() = 21u

val CURLE_HTTP_RETURNED_ERROR: CURLcode get() = 22u

val CURLE_WRITE_ERROR: CURLcode get() = 23u

val CURLE_OBSOLETE24: CURLcode get() = 24u

val CURLE_UPLOAD_FAILED: CURLcode get() = 25u

val CURLE_READ_ERROR: CURLcode get() = 26u

val CURLE_OUT_OF_MEMORY: CURLcode get() = 27u

val CURLE_OPERATION_TIMEDOUT: CURLcode get() = 28u

val CURLE_OBSOLETE29: CURLcode get() = 29u

val CURLE_FTP_PORT_FAILED: CURLcode get() = 30u

val CURLE_FTP_COULDNT_USE_REST: CURLcode get() = 31u

val CURLE_OBSOLETE32: CURLcode get() = 32u

val CURLE_RANGE_ERROR: CURLcode get() = 33u

val CURLE_HTTP_POST_ERROR: CURLcode get() = 34u

val CURLE_SSL_CONNECT_ERROR: CURLcode get() = 35u

val CURLE_BAD_DOWNLOAD_RESUME: CURLcode get() = 36u

val CURLE_FILE_COULDNT_READ_FILE: CURLcode get() = 37u

val CURLE_LDAP_CANNOT_BIND: CURLcode get() = 38u

val CURLE_LDAP_SEARCH_FAILED: CURLcode get() = 39u

val CURLE_OBSOLETE40: CURLcode get() = 40u

val CURLE_FUNCTION_NOT_FOUND: CURLcode get() = 41u

val CURLE_ABORTED_BY_CALLBACK: CURLcode get() = 42u

val CURLE_BAD_FUNCTION_ARGUMENT: CURLcode get() = 43u

val CURLE_OBSOLETE44: CURLcode get() = 44u

val CURLE_INTERFACE_FAILED: CURLcode get() = 45u

val CURLE_OBSOLETE46: CURLcode get() = 46u

val CURLE_TOO_MANY_REDIRECTS: CURLcode get() = 47u

val CURLE_UNKNOWN_OPTION: CURLcode get() = 48u

val CURLE_TELNET_OPTION_SYNTAX: CURLcode get() = 49u

val CURLE_OBSOLETE50: CURLcode get() = 50u

val CURLE_OBSOLETE51: CURLcode get() = 51u

val CURLE_GOT_NOTHING: CURLcode get() = 52u

val CURLE_SSL_ENGINE_NOTFOUND: CURLcode get() = 53u

val CURLE_SSL_ENGINE_SETFAILED: CURLcode get() = 54u

val CURLE_SEND_ERROR: CURLcode get() = 55u

val CURLE_RECV_ERROR: CURLcode get() = 56u

val CURLE_OBSOLETE57: CURLcode get() = 57u

val CURLE_SSL_CERTPROBLEM: CURLcode get() = 58u

val CURLE_SSL_CIPHER: CURLcode get() = 59u

val CURLE_PEER_FAILED_VERIFICATION: CURLcode get() = 60u

val CURLE_BAD_CONTENT_ENCODING: CURLcode get() = 61u

val CURLE_LDAP_INVALID_URL: CURLcode get() = 62u

val CURLE_FILESIZE_EXCEEDED: CURLcode get() = 63u

val CURLE_USE_SSL_FAILED: CURLcode get() = 64u

val CURLE_SEND_FAIL_REWIND: CURLcode get() = 65u

val CURLE_SSL_ENGINE_INITFAILED: CURLcode get() = 66u

val CURLE_LOGIN_DENIED: CURLcode get() = 67u

val CURLE_TFTP_NOTFOUND: CURLcode get() = 68u

val CURLE_TFTP_PERM: CURLcode get() = 69u

val CURLE_REMOTE_DISK_FULL: CURLcode get() = 70u

val CURLE_TFTP_ILLEGAL: CURLcode get() = 71u

val CURLE_TFTP_UNKNOWNID: CURLcode get() = 72u

val CURLE_REMOTE_FILE_EXISTS: CURLcode get() = 73u

val CURLE_TFTP_NOSUCHUSER: CURLcode get() = 74u

val CURLE_CONV_FAILED: CURLcode get() = 75u

val CURLE_CONV_REQD: CURLcode get() = 76u

val CURLE_SSL_CACERT_BADFILE: CURLcode get() = 77u

val CURLE_REMOTE_FILE_NOT_FOUND: CURLcode get() = 78u

val CURLE_SSH: CURLcode get() = 79u

val CURLE_SSL_SHUTDOWN_FAILED: CURLcode get() = 80u

val CURLE_AGAIN: CURLcode get() = 81u

val CURLE_SSL_CRL_BADFILE: CURLcode get() = 82u

val CURLE_SSL_ISSUER_ERROR: CURLcode get() = 83u

val CURLE_FTP_PRET_FAILED: CURLcode get() = 84u

val CURLE_RTSP_CSEQ_ERROR: CURLcode get() = 85u

val CURLE_RTSP_SESSION_ERROR: CURLcode get() = 86u

val CURLE_FTP_BAD_FILE_LIST: CURLcode get() = 87u

val CURLE_CHUNK_FAILED: CURLcode get() = 88u

val CURLE_NO_CONNECTION_AVAILABLE: CURLcode get() = 89u

val CURLE_SSL_PINNEDPUBKEYNOTMATCH: CURLcode get() = 90u

val CURLE_SSL_INVALIDCERTSTATUS: CURLcode get() = 91u

val CURLE_HTTP2_STREAM: CURLcode get() = 92u

val CURLE_RECURSIVE_API_CALL: CURLcode get() = 93u

val CURLE_AUTH_ERROR: CURLcode get() = 94u

val CURL_LAST: CURLcode get() = 95u

typealias CURLcodeVar = UIntVarOf<CURLcode>

typealias CURLcode = UInt


val CURLPROXY_HTTP: curl_proxytype get() = 0u

val CURLPROXY_HTTP_1_0: curl_proxytype get() = 1u

val CURLPROXY_HTTPS: curl_proxytype get() = 2u

val CURLPROXY_SOCKS4: curl_proxytype get() = 4u

val CURLPROXY_SOCKS5: curl_proxytype get() = 5u

val CURLPROXY_SOCKS4A: curl_proxytype get() = 6u

val CURLPROXY_SOCKS5_HOSTNAME: curl_proxytype get() = 7u

typealias curl_proxytypeVar = UIntVarOf<curl_proxytype>

typealias curl_proxytype = UInt


val CURLOPT_WRITEDATA: CURLoption get() = 10001u

val CURLOPT_URL: CURLoption get() = 10002u

val CURLOPT_PORT: CURLoption get() = 3u

val CURLOPT_PROXY: CURLoption get() = 10004u

val CURLOPT_USERPWD: CURLoption get() = 10005u

val CURLOPT_PROXYUSERPWD: CURLoption get() = 10006u

val CURLOPT_RANGE: CURLoption get() = 10007u

val CURLOPT_READDATA: CURLoption get() = 10009u

val CURLOPT_ERRORBUFFER: CURLoption get() = 10010u

val CURLOPT_WRITEFUNCTION: CURLoption get() = 20011u

val CURLOPT_READFUNCTION: CURLoption get() = 20012u

val CURLOPT_TIMEOUT: CURLoption get() = 13u

val CURLOPT_INFILESIZE: CURLoption get() = 14u

val CURLOPT_POSTFIELDS: CURLoption get() = 10015u

val CURLOPT_REFERER: CURLoption get() = 10016u

val CURLOPT_FTPPORT: CURLoption get() = 10017u

val CURLOPT_USERAGENT: CURLoption get() = 10018u

val CURLOPT_LOW_SPEED_LIMIT: CURLoption get() = 19u

val CURLOPT_LOW_SPEED_TIME: CURLoption get() = 20u

val CURLOPT_RESUME_FROM: CURLoption get() = 21u

val CURLOPT_COOKIE: CURLoption get() = 10022u

val CURLOPT_HTTPHEADER: CURLoption get() = 10023u

val CURLOPT_HTTPPOST: CURLoption get() = 10024u

val CURLOPT_SSLCERT: CURLoption get() = 10025u

val CURLOPT_KEYPASSWD: CURLoption get() = 10026u

val CURLOPT_CRLF: CURLoption get() = 27u

val CURLOPT_QUOTE: CURLoption get() = 10028u

val CURLOPT_HEADERDATA: CURLoption get() = 10029u

val CURLOPT_COOKIEFILE: CURLoption get() = 10031u

val CURLOPT_SSLVERSION: CURLoption get() = 32u

val CURLOPT_TIMECONDITION: CURLoption get() = 33u

val CURLOPT_TIMEVALUE: CURLoption get() = 34u

val CURLOPT_CUSTOMREQUEST: CURLoption get() = 10036u

val CURLOPT_STDERR: CURLoption get() = 10037u

val CURLOPT_POSTQUOTE: CURLoption get() = 10039u

val CURLOPT_OBSOLETE40: CURLoption get() = 10040u

val CURLOPT_VERBOSE: CURLoption get() = 41u

val CURLOPT_HEADER: CURLoption get() = 42u

val CURLOPT_NOPROGRESS: CURLoption get() = 43u

val CURLOPT_NOBODY: CURLoption get() = 44u

val CURLOPT_FAILONERROR: CURLoption get() = 45u

val CURLOPT_UPLOAD: CURLoption get() = 46u

val CURLOPT_POST: CURLoption get() = 47u

val CURLOPT_DIRLISTONLY: CURLoption get() = 48u

val CURLOPT_APPEND: CURLoption get() = 50u

val CURLOPT_NETRC: CURLoption get() = 51u

val CURLOPT_FOLLOWLOCATION: CURLoption get() = 52u

val CURLOPT_TRANSFERTEXT: CURLoption get() = 53u

val CURLOPT_PUT: CURLoption get() = 54u

val CURLOPT_PROGRESSFUNCTION: CURLoption get() = 20056u

val CURLOPT_PROGRESSDATA: CURLoption get() = 10057u

val CURLOPT_AUTOREFERER: CURLoption get() = 58u

val CURLOPT_PROXYPORT: CURLoption get() = 59u

val CURLOPT_POSTFIELDSIZE: CURLoption get() = 60u

val CURLOPT_HTTPPROXYTUNNEL: CURLoption get() = 61u

val CURLOPT_INTERFACE: CURLoption get() = 10062u

val CURLOPT_KRBLEVEL: CURLoption get() = 10063u

val CURLOPT_SSL_VERIFYPEER: CURLoption get() = 64u

val CURLOPT_CAINFO: CURLoption get() = 10065u

val CURLOPT_MAXREDIRS: CURLoption get() = 68u

val CURLOPT_FILETIME: CURLoption get() = 69u

val CURLOPT_TELNETOPTIONS: CURLoption get() = 10070u

val CURLOPT_MAXCONNECTS: CURLoption get() = 71u

val CURLOPT_OBSOLETE72: CURLoption get() = 72u

val CURLOPT_FRESH_CONNECT: CURLoption get() = 74u

val CURLOPT_FORBID_REUSE: CURLoption get() = 75u

val CURLOPT_RANDOM_FILE: CURLoption get() = 10076u

val CURLOPT_EGDSOCKET: CURLoption get() = 10077u

val CURLOPT_CONNECTTIMEOUT: CURLoption get() = 78u

val CURLOPT_HEADERFUNCTION: CURLoption get() = 20079u

val CURLOPT_HTTPGET: CURLoption get() = 80u

val CURLOPT_SSL_VERIFYHOST: CURLoption get() = 81u

val CURLOPT_COOKIEJAR: CURLoption get() = 10082u

val CURLOPT_SSL_CIPHER_LIST: CURLoption get() = 10083u

val CURLOPT_HTTP_VERSION: CURLoption get() = 84u

val CURLOPT_FTP_USE_EPSV: CURLoption get() = 85u

val CURLOPT_SSLCERTTYPE: CURLoption get() = 10086u

val CURLOPT_SSLKEY: CURLoption get() = 10087u

val CURLOPT_SSLKEYTYPE: CURLoption get() = 10088u

val CURLOPT_SSLENGINE: CURLoption get() = 10089u

val CURLOPT_SSLENGINE_DEFAULT: CURLoption get() = 90u

val CURLOPT_DNS_USE_GLOBAL_CACHE: CURLoption get() = 91u

val CURLOPT_DNS_CACHE_TIMEOUT: CURLoption get() = 92u

val CURLOPT_PREQUOTE: CURLoption get() = 10093u

val CURLOPT_DEBUGFUNCTION: CURLoption get() = 20094u

val CURLOPT_DEBUGDATA: CURLoption get() = 10095u

val CURLOPT_COOKIESESSION: CURLoption get() = 96u

val CURLOPT_CAPATH: CURLoption get() = 10097u

val CURLOPT_BUFFERSIZE: CURLoption get() = 98u

val CURLOPT_NOSIGNAL: CURLoption get() = 99u

val CURLOPT_SHARE: CURLoption get() = 10100u

val CURLOPT_PROXYTYPE: CURLoption get() = 101u

val CURLOPT_ACCEPT_ENCODING: CURLoption get() = 10102u

val CURLOPT_PRIVATE: CURLoption get() = 10103u

val CURLOPT_HTTP200ALIASES: CURLoption get() = 10104u

val CURLOPT_UNRESTRICTED_AUTH: CURLoption get() = 105u

val CURLOPT_FTP_USE_EPRT: CURLoption get() = 106u

val CURLOPT_HTTPAUTH: CURLoption get() = 107u

val CURLOPT_SSL_CTX_FUNCTION: CURLoption get() = 20108u

val CURLOPT_SSL_CTX_DATA: CURLoption get() = 10109u

val CURLOPT_FTP_CREATE_MISSING_DIRS: CURLoption get() = 110u

val CURLOPT_PROXYAUTH: CURLoption get() = 111u

val CURLOPT_FTP_RESPONSE_TIMEOUT: CURLoption get() = 112u

val CURLOPT_IPRESOLVE: CURLoption get() = 113u

val CURLOPT_MAXFILESIZE: CURLoption get() = 114u

val CURLOPT_INFILESIZE_LARGE: CURLoption get() = 30115u

val CURLOPT_RESUME_FROM_LARGE: CURLoption get() = 30116u

val CURLOPT_MAXFILESIZE_LARGE: CURLoption get() = 30117u

val CURLOPT_NETRC_FILE: CURLoption get() = 10118u

val CURLOPT_USE_SSL: CURLoption get() = 119u

val CURLOPT_POSTFIELDSIZE_LARGE: CURLoption get() = 30120u

val CURLOPT_TCP_NODELAY: CURLoption get() = 121u

val CURLOPT_FTPSSLAUTH: CURLoption get() = 129u

val CURLOPT_IOCTLFUNCTION: CURLoption get() = 20130u

val CURLOPT_IOCTLDATA: CURLoption get() = 10131u

val CURLOPT_FTP_ACCOUNT: CURLoption get() = 10134u

val CURLOPT_COOKIELIST: CURLoption get() = 10135u

val CURLOPT_IGNORE_CONTENT_LENGTH: CURLoption get() = 136u

val CURLOPT_FTP_SKIP_PASV_IP: CURLoption get() = 137u

val CURLOPT_FTP_FILEMETHOD: CURLoption get() = 138u

val CURLOPT_LOCALPORT: CURLoption get() = 139u

val CURLOPT_LOCALPORTRANGE: CURLoption get() = 140u

val CURLOPT_CONNECT_ONLY: CURLoption get() = 141u

val CURLOPT_CONV_FROM_NETWORK_FUNCTION: CURLoption get() = 20142u

val CURLOPT_CONV_TO_NETWORK_FUNCTION: CURLoption get() = 20143u

val CURLOPT_CONV_FROM_UTF8_FUNCTION: CURLoption get() = 20144u

val CURLOPT_MAX_SEND_SPEED_LARGE: CURLoption get() = 30145u

val CURLOPT_MAX_RECV_SPEED_LARGE: CURLoption get() = 30146u

val CURLOPT_FTP_ALTERNATIVE_TO_USER: CURLoption get() = 10147u

val CURLOPT_SOCKOPTFUNCTION: CURLoption get() = 20148u

val CURLOPT_SOCKOPTDATA: CURLoption get() = 10149u

val CURLOPT_SSL_SESSIONID_CACHE: CURLoption get() = 150u

val CURLOPT_SSH_AUTH_TYPES: CURLoption get() = 151u

val CURLOPT_SSH_PUBLIC_KEYFILE: CURLoption get() = 10152u

val CURLOPT_SSH_PRIVATE_KEYFILE: CURLoption get() = 10153u

val CURLOPT_FTP_SSL_CCC: CURLoption get() = 154u

val CURLOPT_TIMEOUT_MS: CURLoption get() = 155u

val CURLOPT_CONNECTTIMEOUT_MS: CURLoption get() = 156u

val CURLOPT_HTTP_TRANSFER_DECODING: CURLoption get() = 157u

val CURLOPT_HTTP_CONTENT_DECODING: CURLoption get() = 158u

val CURLOPT_NEW_FILE_PERMS: CURLoption get() = 159u

val CURLOPT_NEW_DIRECTORY_PERMS: CURLoption get() = 160u

val CURLOPT_POSTREDIR: CURLoption get() = 161u

val CURLOPT_SSH_HOST_PUBLIC_KEY_MD5: CURLoption get() = 10162u

val CURLOPT_OPENSOCKETFUNCTION: CURLoption get() = 20163u

val CURLOPT_OPENSOCKETDATA: CURLoption get() = 10164u

val CURLOPT_COPYPOSTFIELDS: CURLoption get() = 10165u

val CURLOPT_PROXY_TRANSFER_MODE: CURLoption get() = 166u

val CURLOPT_SEEKFUNCTION: CURLoption get() = 20167u

val CURLOPT_SEEKDATA: CURLoption get() = 10168u

val CURLOPT_CRLFILE: CURLoption get() = 10169u

val CURLOPT_ISSUERCERT: CURLoption get() = 10170u

val CURLOPT_ADDRESS_SCOPE: CURLoption get() = 171u

val CURLOPT_CERTINFO: CURLoption get() = 172u

val CURLOPT_USERNAME: CURLoption get() = 10173u

val CURLOPT_PASSWORD: CURLoption get() = 10174u

val CURLOPT_PROXYUSERNAME: CURLoption get() = 10175u

val CURLOPT_PROXYPASSWORD: CURLoption get() = 10176u

val CURLOPT_NOPROXY: CURLoption get() = 10177u

val CURLOPT_TFTP_BLKSIZE: CURLoption get() = 178u

val CURLOPT_SOCKS5_GSSAPI_SERVICE: CURLoption get() = 10179u

val CURLOPT_SOCKS5_GSSAPI_NEC: CURLoption get() = 180u

val CURLOPT_PROTOCOLS: CURLoption get() = 181u

val CURLOPT_REDIR_PROTOCOLS: CURLoption get() = 182u

val CURLOPT_SSH_KNOWNHOSTS: CURLoption get() = 10183u

val CURLOPT_SSH_KEYFUNCTION: CURLoption get() = 20184u

val CURLOPT_SSH_KEYDATA: CURLoption get() = 10185u

val CURLOPT_MAIL_FROM: CURLoption get() = 10186u

val CURLOPT_MAIL_RCPT: CURLoption get() = 10187u

val CURLOPT_FTP_USE_PRET: CURLoption get() = 188u

val CURLOPT_RTSP_REQUEST: CURLoption get() = 189u

val CURLOPT_RTSP_SESSION_ID: CURLoption get() = 10190u

val CURLOPT_RTSP_STREAM_URI: CURLoption get() = 10191u

val CURLOPT_RTSP_TRANSPORT: CURLoption get() = 10192u

val CURLOPT_RTSP_CLIENT_CSEQ: CURLoption get() = 193u

val CURLOPT_RTSP_SERVER_CSEQ: CURLoption get() = 194u

val CURLOPT_INTERLEAVEDATA: CURLoption get() = 10195u

val CURLOPT_INTERLEAVEFUNCTION: CURLoption get() = 20196u

val CURLOPT_WILDCARDMATCH: CURLoption get() = 197u

val CURLOPT_CHUNK_BGN_FUNCTION: CURLoption get() = 20198u

val CURLOPT_CHUNK_END_FUNCTION: CURLoption get() = 20199u

val CURLOPT_FNMATCH_FUNCTION: CURLoption get() = 20200u

val CURLOPT_CHUNK_DATA: CURLoption get() = 10201u

val CURLOPT_FNMATCH_DATA: CURLoption get() = 10202u

val CURLOPT_RESOLVE: CURLoption get() = 10203u

val CURLOPT_TLSAUTH_USERNAME: CURLoption get() = 10204u

val CURLOPT_TLSAUTH_PASSWORD: CURLoption get() = 10205u

val CURLOPT_TLSAUTH_TYPE: CURLoption get() = 10206u

val CURLOPT_TRANSFER_ENCODING: CURLoption get() = 207u

val CURLOPT_CLOSESOCKETFUNCTION: CURLoption get() = 20208u

val CURLOPT_CLOSESOCKETDATA: CURLoption get() = 10209u

val CURLOPT_GSSAPI_DELEGATION: CURLoption get() = 210u

val CURLOPT_DNS_SERVERS: CURLoption get() = 10211u

val CURLOPT_ACCEPTTIMEOUT_MS: CURLoption get() = 212u

val CURLOPT_TCP_KEEPALIVE: CURLoption get() = 213u

val CURLOPT_TCP_KEEPIDLE: CURLoption get() = 214u

val CURLOPT_TCP_KEEPINTVL: CURLoption get() = 215u

val CURLOPT_SSL_OPTIONS: CURLoption get() = 216u

val CURLOPT_MAIL_AUTH: CURLoption get() = 10217u

val CURLOPT_SASL_IR: CURLoption get() = 218u

val CURLOPT_XFERINFOFUNCTION: CURLoption get() = 20219u

val CURLOPT_XOAUTH2_BEARER: CURLoption get() = 10220u

val CURLOPT_DNS_INTERFACE: CURLoption get() = 10221u

val CURLOPT_DNS_LOCAL_IP4: CURLoption get() = 10222u

val CURLOPT_DNS_LOCAL_IP6: CURLoption get() = 10223u

val CURLOPT_LOGIN_OPTIONS: CURLoption get() = 10224u

val CURLOPT_SSL_ENABLE_NPN: CURLoption get() = 225u

val CURLOPT_SSL_ENABLE_ALPN: CURLoption get() = 226u

val CURLOPT_EXPECT_100_TIMEOUT_MS: CURLoption get() = 227u

val CURLOPT_PROXYHEADER: CURLoption get() = 10228u

val CURLOPT_HEADEROPT: CURLoption get() = 229u

val CURLOPT_PINNEDPUBLICKEY: CURLoption get() = 10230u

val CURLOPT_UNIX_SOCKET_PATH: CURLoption get() = 10231u

val CURLOPT_SSL_VERIFYSTATUS: CURLoption get() = 232u

val CURLOPT_SSL_FALSESTART: CURLoption get() = 233u

val CURLOPT_PATH_AS_IS: CURLoption get() = 234u

val CURLOPT_PROXY_SERVICE_NAME: CURLoption get() = 10235u

val CURLOPT_SERVICE_NAME: CURLoption get() = 10236u

val CURLOPT_PIPEWAIT: CURLoption get() = 237u

val CURLOPT_DEFAULT_PROTOCOL: CURLoption get() = 10238u

val CURLOPT_STREAM_WEIGHT: CURLoption get() = 239u

val CURLOPT_STREAM_DEPENDS: CURLoption get() = 10240u

val CURLOPT_STREAM_DEPENDS_E: CURLoption get() = 10241u

val CURLOPT_TFTP_NO_OPTIONS: CURLoption get() = 242u

val CURLOPT_CONNECT_TO: CURLoption get() = 10243u

val CURLOPT_TCP_FASTOPEN: CURLoption get() = 244u

val CURLOPT_KEEP_SENDING_ON_ERROR: CURLoption get() = 245u

val CURLOPT_PROXY_CAINFO: CURLoption get() = 10246u

val CURLOPT_PROXY_CAPATH: CURLoption get() = 10247u

val CURLOPT_PROXY_SSL_VERIFYPEER: CURLoption get() = 248u

val CURLOPT_PROXY_SSL_VERIFYHOST: CURLoption get() = 249u

val CURLOPT_PROXY_SSLVERSION: CURLoption get() = 250u

val CURLOPT_PROXY_TLSAUTH_USERNAME: CURLoption get() = 10251u

val CURLOPT_PROXY_TLSAUTH_PASSWORD: CURLoption get() = 10252u

val CURLOPT_PROXY_TLSAUTH_TYPE: CURLoption get() = 10253u

val CURLOPT_PROXY_SSLCERT: CURLoption get() = 10254u

val CURLOPT_PROXY_SSLCERTTYPE: CURLoption get() = 10255u

val CURLOPT_PROXY_SSLKEY: CURLoption get() = 10256u

val CURLOPT_PROXY_SSLKEYTYPE: CURLoption get() = 10257u

val CURLOPT_PROXY_KEYPASSWD: CURLoption get() = 10258u

val CURLOPT_PROXY_SSL_CIPHER_LIST: CURLoption get() = 10259u

val CURLOPT_PROXY_CRLFILE: CURLoption get() = 10260u

val CURLOPT_PROXY_SSL_OPTIONS: CURLoption get() = 261u

val CURLOPT_PRE_PROXY: CURLoption get() = 10262u

val CURLOPT_PROXY_PINNEDPUBLICKEY: CURLoption get() = 10263u

val CURLOPT_ABSTRACT_UNIX_SOCKET: CURLoption get() = 10264u

val CURLOPT_SUPPRESS_CONNECT_HEADERS: CURLoption get() = 265u

val CURLOPT_REQUEST_TARGET: CURLoption get() = 10266u

val CURLOPT_SOCKS5_AUTH: CURLoption get() = 267u

val CURLOPT_SSH_COMPRESSION: CURLoption get() = 268u

val CURLOPT_MIMEPOST: CURLoption get() = 10269u

val CURLOPT_TIMEVALUE_LARGE: CURLoption get() = 30270u

val CURLOPT_HAPPY_EYEBALLS_TIMEOUT_MS: CURLoption get() = 271u

val CURLOPT_RESOLVER_START_FUNCTION: CURLoption get() = 20272u

val CURLOPT_RESOLVER_START_DATA: CURLoption get() = 10273u

val CURLOPT_HAPROXYPROTOCOL: CURLoption get() = 274u

val CURLOPT_DNS_SHUFFLE_ADDRESSES: CURLoption get() = 275u

val CURLOPT_TLS13_CIPHERS: CURLoption get() = 10276u

val CURLOPT_PROXY_TLS13_CIPHERS: CURLoption get() = 10277u

val CURLOPT_DISALLOW_USERNAME_IN_URL: CURLoption get() = 278u

val CURLOPT_DOH_URL: CURLoption get() = 10279u

val CURLOPT_UPLOAD_BUFFERSIZE: CURLoption get() = 280u

val CURLOPT_UPKEEP_INTERVAL_MS: CURLoption get() = 281u

val CURLOPT_CURLU: CURLoption get() = 10282u

val CURLOPT_TRAILERFUNCTION: CURLoption get() = 20283u

val CURLOPT_TRAILERDATA: CURLoption get() = 10284u

val CURLOPT_HTTP09_ALLOWED: CURLoption get() = 285u

val CURLOPT_ALTSVC_CTRL: CURLoption get() = 286u

val CURLOPT_ALTSVC: CURLoption get() = 10287u

val CURLOPT_MAXAGE_CONN: CURLoption get() = 288u

val CURLOPT_SASL_AUTHZID: CURLoption get() = 10289u

val CURLOPT_LASTENTRY: CURLoption get() = 10290u

typealias CURLoptionVar = UIntVarOf<CURLoption>

typealias CURLoption = UInt

// enum (anonymous at /usr/include/curl/curl.h:1973:1):

val CURL_HTTP_VERSION_NONE: UInt get() = 0u

val CURL_HTTP_VERSION_1_0: UInt get() = 1u

val CURL_HTTP_VERSION_1_1: UInt get() = 2u

val CURL_HTTP_VERSION_2_0: UInt get() = 3u

val CURL_HTTP_VERSION_2TLS: UInt get() = 4u

val CURL_HTTP_VERSION_2_PRIOR_KNOWLEDGE: UInt get() = 5u

val CURL_HTTP_VERSION_3: UInt get() = 30u

val CURL_HTTP_VERSION_LAST: UInt get() = 31u

// enum (anonymous at /usr/include/curl/curl.h:1996:1):

val CURL_RTSPREQ_NONE: UInt get() = 0u

val CURL_RTSPREQ_OPTIONS: UInt get() = 1u

val CURL_RTSPREQ_DESCRIBE: UInt get() = 2u

val CURL_RTSPREQ_ANNOUNCE: UInt get() = 3u

val CURL_RTSPREQ_SETUP: UInt get() = 4u

val CURL_RTSPREQ_PLAY: UInt get() = 5u

val CURL_RTSPREQ_PAUSE: UInt get() = 6u

val CURL_RTSPREQ_TEARDOWN: UInt get() = 7u

val CURL_RTSPREQ_GET_PARAMETER: UInt get() = 8u

val CURL_RTSPREQ_SET_PARAMETER: UInt get() = 9u

val CURL_RTSPREQ_RECORD: UInt get() = 10u

val CURL_RTSPREQ_RECEIVE: UInt get() = 11u

val CURL_RTSPREQ_LAST: UInt get() = 12u

// enum (anonymous at /usr/include/curl/curl.h:2024:1):

val CURL_SSLVERSION_DEFAULT: UInt get() = 0u

val CURL_SSLVERSION_TLSv1: UInt get() = 1u

val CURL_SSLVERSION_SSLv2: UInt get() = 2u

val CURL_SSLVERSION_SSLv3: UInt get() = 3u

val CURL_SSLVERSION_TLSv1_0: UInt get() = 4u

val CURL_SSLVERSION_TLSv1_1: UInt get() = 5u

val CURL_SSLVERSION_TLSv1_2: UInt get() = 6u

val CURL_SSLVERSION_TLSv1_3: UInt get() = 7u

val CURL_SSLVERSION_LAST: UInt get() = 8u

// enum (anonymous at /usr/include/curl/curl.h:2037:1):

val CURL_SSLVERSION_MAX_NONE: UInt get() = 0u

val CURL_SSLVERSION_MAX_DEFAULT: UInt get() = 65536u

val CURL_SSLVERSION_MAX_TLSv1_0: UInt get() = 262144u

val CURL_SSLVERSION_MAX_TLSv1_1: UInt get() = 327680u

val CURL_SSLVERSION_MAX_TLSv1_2: UInt get() = 393216u

val CURL_SSLVERSION_MAX_TLSv1_3: UInt get() = 458752u

val CURL_SSLVERSION_MAX_LAST: UInt get() = 524288u


val CURLSSLSET_OK: CURLsslset get() = 0u

val CURLSSLSET_UNKNOWN_BACKEND: CURLsslset get() = 1u

val CURLSSLSET_TOO_LATE: CURLsslset get() = 2u

val CURLSSLSET_NO_BACKENDS: CURLsslset get() = 3u

typealias CURLsslsetVar = UIntVarOf<CURLsslset>

typealias CURLsslset = UInt


val CURLINFO_NONE: CURLINFO get() = 0u

val CURLINFO_EFFECTIVE_URL: CURLINFO get() = 1048577u

val CURLINFO_RESPONSE_CODE: CURLINFO get() = 2097154u

val CURLINFO_TOTAL_TIME: CURLINFO get() = 3145731u

val CURLINFO_NAMELOOKUP_TIME: CURLINFO get() = 3145732u

val CURLINFO_CONNECT_TIME: CURLINFO get() = 3145733u

val CURLINFO_PRETRANSFER_TIME: CURLINFO get() = 3145734u

val CURLINFO_SIZE_UPLOAD: CURLINFO get() = 3145735u

val CURLINFO_SIZE_UPLOAD_T: CURLINFO get() = 6291463u

val CURLINFO_SIZE_DOWNLOAD: CURLINFO get() = 3145736u

val CURLINFO_SIZE_DOWNLOAD_T: CURLINFO get() = 6291464u

val CURLINFO_SPEED_DOWNLOAD: CURLINFO get() = 3145737u

val CURLINFO_SPEED_DOWNLOAD_T: CURLINFO get() = 6291465u

val CURLINFO_SPEED_UPLOAD: CURLINFO get() = 3145738u

val CURLINFO_SPEED_UPLOAD_T: CURLINFO get() = 6291466u

val CURLINFO_HEADER_SIZE: CURLINFO get() = 2097163u

val CURLINFO_REQUEST_SIZE: CURLINFO get() = 2097164u

val CURLINFO_SSL_VERIFYRESULT: CURLINFO get() = 2097165u

val CURLINFO_FILETIME: CURLINFO get() = 2097166u

val CURLINFO_FILETIME_T: CURLINFO get() = 6291470u

val CURLINFO_CONTENT_LENGTH_DOWNLOAD: CURLINFO get() = 3145743u

val CURLINFO_CONTENT_LENGTH_DOWNLOAD_T: CURLINFO get() = 6291471u

val CURLINFO_CONTENT_LENGTH_UPLOAD: CURLINFO get() = 3145744u

val CURLINFO_CONTENT_LENGTH_UPLOAD_T: CURLINFO get() = 6291472u

val CURLINFO_STARTTRANSFER_TIME: CURLINFO get() = 3145745u

val CURLINFO_CONTENT_TYPE: CURLINFO get() = 1048594u

val CURLINFO_REDIRECT_TIME: CURLINFO get() = 3145747u

val CURLINFO_REDIRECT_COUNT: CURLINFO get() = 2097172u

val CURLINFO_PRIVATE: CURLINFO get() = 1048597u

val CURLINFO_HTTP_CONNECTCODE: CURLINFO get() = 2097174u

val CURLINFO_HTTPAUTH_AVAIL: CURLINFO get() = 2097175u

val CURLINFO_PROXYAUTH_AVAIL: CURLINFO get() = 2097176u

val CURLINFO_OS_ERRNO: CURLINFO get() = 2097177u

val CURLINFO_NUM_CONNECTS: CURLINFO get() = 2097178u

val CURLINFO_SSL_ENGINES: CURLINFO get() = 4194331u

val CURLINFO_COOKIELIST: CURLINFO get() = 4194332u

val CURLINFO_LASTSOCKET: CURLINFO get() = 2097181u

val CURLINFO_FTP_ENTRY_PATH: CURLINFO get() = 1048606u

val CURLINFO_REDIRECT_URL: CURLINFO get() = 1048607u

val CURLINFO_PRIMARY_IP: CURLINFO get() = 1048608u

val CURLINFO_APPCONNECT_TIME: CURLINFO get() = 3145761u

val CURLINFO_CERTINFO: CURLINFO get() = 4194338u

val CURLINFO_CONDITION_UNMET: CURLINFO get() = 2097187u

val CURLINFO_RTSP_SESSION_ID: CURLINFO get() = 1048612u

val CURLINFO_RTSP_CLIENT_CSEQ: CURLINFO get() = 2097189u

val CURLINFO_RTSP_SERVER_CSEQ: CURLINFO get() = 2097190u

val CURLINFO_RTSP_CSEQ_RECV: CURLINFO get() = 2097191u

val CURLINFO_PRIMARY_PORT: CURLINFO get() = 2097192u

val CURLINFO_LOCAL_IP: CURLINFO get() = 1048617u

val CURLINFO_LOCAL_PORT: CURLINFO get() = 2097194u

val CURLINFO_TLS_SESSION: CURLINFO get() = 4194347u

val CURLINFO_ACTIVESOCKET: CURLINFO get() = 5242924u

val CURLINFO_TLS_SSL_PTR: CURLINFO get() = 4194349u

val CURLINFO_HTTP_VERSION: CURLINFO get() = 2097198u

val CURLINFO_PROXY_SSL_VERIFYRESULT: CURLINFO get() = 2097199u

val CURLINFO_PROTOCOL: CURLINFO get() = 2097200u

val CURLINFO_SCHEME: CURLINFO get() = 1048625u

val CURLINFO_TOTAL_TIME_T: CURLINFO get() = 6291506u

val CURLINFO_NAMELOOKUP_TIME_T: CURLINFO get() = 6291507u

val CURLINFO_CONNECT_TIME_T: CURLINFO get() = 6291508u

val CURLINFO_PRETRANSFER_TIME_T: CURLINFO get() = 6291509u

val CURLINFO_STARTTRANSFER_TIME_T: CURLINFO get() = 6291510u

val CURLINFO_REDIRECT_TIME_T: CURLINFO get() = 6291511u

val CURLINFO_APPCONNECT_TIME_T: CURLINFO get() = 6291512u

val CURLINFO_RETRY_AFTER: CURLINFO get() = 6291513u

val CURLINFO_LASTONE: CURLINFO get() = 57u

typealias CURLINFOVar = UIntVarOf<CURLINFO>

typealias CURLINFO = UInt


val CURL_LOCK_DATA_NONE: curl_lock_data get() = 0u

val CURL_LOCK_DATA_SHARE: curl_lock_data get() = 1u

val CURL_LOCK_DATA_COOKIE: curl_lock_data get() = 2u

val CURL_LOCK_DATA_DNS: curl_lock_data get() = 3u

val CURL_LOCK_DATA_SSL_SESSION: curl_lock_data get() = 4u

val CURL_LOCK_DATA_CONNECT: curl_lock_data get() = 5u

val CURL_LOCK_DATA_PSL: curl_lock_data get() = 6u

val CURL_LOCK_DATA_LAST: curl_lock_data get() = 7u

typealias curl_lock_dataVar = UIntVarOf<curl_lock_data>

typealias curl_lock_data = UInt


val CURL_LOCK_ACCESS_NONE: curl_lock_access get() = 0u

val CURL_LOCK_ACCESS_SHARED: curl_lock_access get() = 1u

val CURL_LOCK_ACCESS_SINGLE: curl_lock_access get() = 2u

val CURL_LOCK_ACCESS_LAST: curl_lock_access get() = 3u

typealias curl_lock_accessVar = UIntVarOf<curl_lock_access>

typealias curl_lock_access = UInt


val CURLM_CALL_MULTI_PERFORM: CURLMcode get() = -1

val CURLM_OK: CURLMcode get() = 0

val CURLM_BAD_HANDLE: CURLMcode get() = 1

val CURLM_BAD_EASY_HANDLE: CURLMcode get() = 2

val CURLM_OUT_OF_MEMORY: CURLMcode get() = 3

val CURLM_INTERNAL_ERROR: CURLMcode get() = 4

val CURLM_BAD_SOCKET: CURLMcode get() = 5

val CURLM_UNKNOWN_OPTION: CURLMcode get() = 6

val CURLM_ADDED_ALREADY: CURLMcode get() = 7

val CURLM_RECURSIVE_API_CALL: CURLMcode get() = 8

val CURLM_LAST: CURLMcode get() = 9

typealias CURLMcodeVar = IntVarOf<CURLMcode>

typealias CURLMcode = Int


val CURLMOPT_SOCKETFUNCTION: CURLMoption get() = 20001u

val CURLMOPT_SOCKETDATA: CURLMoption get() = 10002u

val CURLMOPT_PIPELINING: CURLMoption get() = 3u

val CURLMOPT_TIMERFUNCTION: CURLMoption get() = 20004u

val CURLMOPT_TIMERDATA: CURLMoption get() = 10005u

val CURLMOPT_MAXCONNECTS: CURLMoption get() = 6u

val CURLMOPT_MAX_HOST_CONNECTIONS: CURLMoption get() = 7u

val CURLMOPT_MAX_PIPELINE_LENGTH: CURLMoption get() = 8u

val CURLMOPT_CONTENT_LENGTH_PENALTY_SIZE: CURLMoption get() = 30009u

val CURLMOPT_CHUNK_LENGTH_PENALTY_SIZE: CURLMoption get() = 30010u

val CURLMOPT_PIPELINING_SITE_BL: CURLMoption get() = 10011u

val CURLMOPT_PIPELINING_SERVER_BL: CURLMoption get() = 10012u

val CURLMOPT_MAX_TOTAL_CONNECTIONS: CURLMoption get() = 13u

val CURLMOPT_PUSHFUNCTION: CURLMoption get() = 20014u

val CURLMOPT_PUSHDATA: CURLMoption get() = 10015u

val CURLMOPT_LASTENTRY: CURLMoption get() = 10016u

typealias CURLMoptionVar = UIntVarOf<CURLMoption>

typealias CURLMoption = UInt
@SymbolName("libcurl_kniBridge0")
private external fun kniBridge0(p0: NativePtr, p1: NativePtr): Int
@SymbolName("libcurl_kniBridge1")
private external fun kniBridge1(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("libcurl_kniBridge2")
private external fun kniBridge2(p0: NativePtr): NativePtr
@SymbolName("libcurl_kniBridge3")
private external fun kniBridge3(p0: NativePtr): Unit
@SymbolName("libcurl_kniBridge4")
private external fun kniBridge4(p0: NativePtr): NativePtr
@SymbolName("libcurl_kniBridge5")
private external fun kniBridge5(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("libcurl_kniBridge6")
private external fun kniBridge6(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("libcurl_kniBridge7")
private external fun kniBridge7(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("libcurl_kniBridge8")
private external fun kniBridge8(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("libcurl_kniBridge9")
private external fun kniBridge9(p0: NativePtr, p1: NativePtr, p2: ULong): UInt
@SymbolName("libcurl_kniBridge10")
private external fun kniBridge10(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("libcurl_kniBridge11")
private external fun kniBridge11(p0: NativePtr, p1: Long, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): UInt
@SymbolName("libcurl_kniBridge12")
private external fun kniBridge12(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("libcurl_kniBridge13")
private external fun kniBridge13(p0: NativePtr, p1: NativePtr, p2: Int): UInt
@SymbolName("libcurl_kniBridge14")
private external fun kniBridge14(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("libcurl_kniBridge15")
private external fun kniBridge15(p0: NativePtr): Unit
@SymbolName("libcurl_kniBridge16")
private external fun kniBridge16(p0: NativePtr): NativePtr
@SymbolName("libcurl_kniBridge17")
private external fun kniBridge17(): NativePtr
@SymbolName("libcurl_kniBridge18")
private external fun kniBridge18(p0: NativePtr, p1: NativePtr, p2: Int): NativePtr
@SymbolName("libcurl_kniBridge19")
private external fun kniBridge19(p0: NativePtr, p1: Int): NativePtr
@SymbolName("libcurl_kniBridge20")
private external fun kniBridge20(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): NativePtr
@SymbolName("libcurl_kniBridge21")
private external fun kniBridge21(p0: NativePtr, p1: Int): NativePtr
@SymbolName("libcurl_kniBridge22")
private external fun kniBridge22(p0: NativePtr): Unit
@SymbolName("libcurl_kniBridge23")
private external fun kniBridge23(p0: Long): UInt
@SymbolName("libcurl_kniBridge24")
private external fun kniBridge24(p0: Long, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): UInt
@SymbolName("libcurl_kniBridge25")
private external fun kniBridge25(): Unit
@SymbolName("libcurl_kniBridge26")
private external fun kniBridge26(p0: UInt, p1: NativePtr, p2: NativePtr): UInt
@SymbolName("libcurl_kniBridge27")
private external fun kniBridge27(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("libcurl_kniBridge28")
private external fun kniBridge28(p0: NativePtr): Unit
@SymbolName("libcurl_kniBridge29")
private external fun kniBridge29(p0: NativePtr, p1: NativePtr): Long
@SymbolName("libcurl_kniBridge30")
private external fun kniBridge30(): NativePtr
@SymbolName("libcurl_kniBridge31")
private external fun kniBridge31(p0: NativePtr): UInt
@SymbolName("libcurl_kniBridge32")
private external fun kniBridge32(p0: UInt): NativePtr
@SymbolName("libcurl_kniBridge33")
private external fun kniBridge33(p0: UInt): NativePtr
@SymbolName("libcurl_kniBridge34")
private external fun kniBridge34(p0: UInt): NativePtr
@SymbolName("libcurl_kniBridge35")
private external fun kniBridge35(p0: NativePtr, p1: Int): UInt
@SymbolName("libcurl_kniBridge36")
private external fun kniBridge36(): NativePtr
@SymbolName("libcurl_kniBridge37")
private external fun kniBridge37(p0: NativePtr): UInt
@SymbolName("libcurl_kniBridge38")
private external fun kniBridge38(p0: NativePtr): Unit
@SymbolName("libcurl_kniBridge39")
private external fun kniBridge39(p0: NativePtr): NativePtr
@SymbolName("libcurl_kniBridge40")
private external fun kniBridge40(p0: NativePtr): Unit
@SymbolName("libcurl_kniBridge41")
private external fun kniBridge41(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr): UInt
@SymbolName("libcurl_kniBridge42")
private external fun kniBridge42(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr): UInt
@SymbolName("libcurl_kniBridge43")
private external fun kniBridge43(p0: NativePtr): UInt
@SymbolName("libcurl_kniBridge44")
private external fun kniBridge44(): NativePtr
@SymbolName("libcurl_kniBridge45")
private external fun kniBridge45(p0: NativePtr, p1: NativePtr): Int
@SymbolName("libcurl_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: NativePtr): Int
@SymbolName("libcurl_kniBridge47")
private external fun kniBridge47(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("libcurl_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: NativePtr, p2: UInt, p3: Int, p4: NativePtr): Int
@SymbolName("libcurl_kniBridge49")
private external fun kniBridge49(p0: NativePtr, p1: NativePtr, p2: UInt, p3: Int, p4: NativePtr): Int
@SymbolName("libcurl_kniBridge50")
private external fun kniBridge50(p0: NativePtr, p1: NativePtr): Int
@SymbolName("libcurl_kniBridge51")
private external fun kniBridge51(p0: NativePtr): Int
@SymbolName("libcurl_kniBridge52")
private external fun kniBridge52(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("libcurl_kniBridge53")
private external fun kniBridge53(p0: Int): NativePtr
@SymbolName("libcurl_kniBridge54")
private external fun kniBridge54(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("libcurl_kniBridge55")
private external fun kniBridge55(p0: NativePtr, p1: Int, p2: Int, p3: NativePtr): Int
@SymbolName("libcurl_kniBridge56")
private external fun kniBridge56(p0: NativePtr, p1: NativePtr): Int
@SymbolName("libcurl_kniBridge57")
private external fun kniBridge57(p0: NativePtr, p1: NativePtr): Int
@SymbolName("libcurl_kniBridge58")
private external fun kniBridge58(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("libcurl_kniBridge59")
private external fun kniBridge59(p0: NativePtr, p1: ULong): NativePtr
@SymbolName("libcurl_kniBridge60")
private external fun kniBridge60(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("libcurl_kniBridge61")
private external fun kniBridge61(): NativePtr
@SymbolName("libcurl_kniBridge62")
private external fun kniBridge62(p0: NativePtr): Unit
@SymbolName("libcurl_kniBridge63")
private external fun kniBridge63(p0: NativePtr): NativePtr
@SymbolName("libcurl_kniBridge64")
private external fun kniBridge64(p0: NativePtr, p1: UInt, p2: NativePtr, p3: UInt): UInt
@SymbolName("libcurl_kniBridge65")
private external fun kniBridge65(p0: NativePtr, p1: UInt, p2: NativePtr, p3: UInt): UInt
