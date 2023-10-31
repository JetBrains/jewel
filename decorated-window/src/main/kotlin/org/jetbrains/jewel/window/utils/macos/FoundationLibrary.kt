package org.jetbrains.jewel.window.utils.macos

import com.sun.jna.Callback
import com.sun.jna.Library
import com.sun.jna.Pointer

internal interface FoundationLibrary : Library {

    public fun NSLog(pString: Pointer?, thing: Any?)

    public fun NSFullUserName(): ID?

    public fun objc_allocateClassPair(supercls: ID?, name: String?, extraBytes: Int): ID?

    public fun objc_registerClassPair(cls: ID?)

    public fun CFStringCreateWithBytes(
        allocator: Pointer?,
        bytes: ByteArray?,
        byteCount: Int,
        encoding: Int,
        isExternalRepresentation: Byte,
    ): ID?

    public fun CFStringGetCString(
        theString: ID?,
        buffer: ByteArray?,
        bufferSize: Int,
        encoding: Int,
    ): Byte

    public fun CFStringGetLength(theString: ID?): Int

    public fun CFStringConvertNSStringEncodingToEncoding(nsEncoding: Long): Long

    public fun CFStringConvertEncodingToIANACharSetName(cfEncoding: Long): ID?

    public fun CFStringConvertIANACharSetNameToEncoding(encodingName: ID?): Long

    public fun CFStringConvertEncodingToNSStringEncoding(cfEncoding: Long): Long

    public fun CFRetain(cfTypeRef: ID?)

    public fun CFRelease(cfTypeRef: ID?)

    public fun CFGetRetainCount(cfTypeRef: Pointer?): Int

    public fun objc_getClass(className: String?): ID?

    public fun objc_getProtocol(name: String?): ID?

    public fun class_createInstance(pClass: ID?, extraBytes: Int): ID?

    public fun sel_registerName(selectorName: String?): Pointer?

    public fun class_replaceMethod(cls: ID?, selName: Pointer?, impl: Callback?, types: String?): ID?

    public fun objc_getMetaClass(name: String?): ID?

    /**
     * Note: Vararg version. Should only be used only for selectors with a single fixed argument
     * followed by varargs.
     */
    public fun objc_msgSend(receiver: ID?, selector: Pointer?, firstArg: Any?, vararg args: Any?): ID?

    public fun class_respondsToSelector(cls: ID?, selName: Pointer?): Boolean

    public fun class_addMethod(cls: ID?, selName: Pointer?, imp: Callback?, types: String?): Boolean

    public fun class_addMethod(cls: ID?, selName: Pointer?, imp: ID?, types: String?): Boolean

    public fun class_addProtocol(aClass: ID?, protocol: ID?): Boolean

    public fun class_isMetaClass(cls: ID?): Boolean

    public fun NSStringFromSelector(selector: Pointer?): ID?

    public fun NSStringFromClass(aClass: ID?): ID?

    public fun objc_getClass(clazz: Pointer?): Pointer?

    public companion object {

        const val kCFStringEncodingMacRoman = 0
        const val kCFStringEncodingWindowsLatin1 = 0x0500
        const val kCFStringEncodingISOLatin1 = 0x0201
        const val kCFStringEncodingNextStepLatin = 0x0B01
        const val kCFStringEncodingASCII = 0x0600
        const val kCFStringEncodingUnicode = 0x0100
        const val kCFStringEncodingUTF8 = 0x08000100
        const val kCFStringEncodingNonLossyASCII = 0x0BFF
        const val kCFStringEncodingUTF16 = 0x0100
        const val kCFStringEncodingUTF16BE = 0x10000100
        const val kCFStringEncodingUTF16LE = 0x14000100
        const val kCFStringEncodingUTF32 = 0x0c000100
        const val kCFStringEncodingUTF32BE = 0x18000100
        const val kCFStringEncodingUTF32LE = 0x1c000100

        // https://developer.apple.com/library/mac/documentation/Carbon/Reference/CGWindow_Reference/Constants/Constants.html#//apple_ref/doc/constant_group/Window_List_Option_Constants
        const val kCGWindowListOptionAll = 0
        const val kCGWindowListOptionOnScreenOnly = 1
        const val kCGWindowListOptionOnScreenAboveWindow = 2
        const val kCGWindowListOptionOnScreenBelowWindow = 4
        const val kCGWindowListOptionIncludingWindow = 8
        const val kCGWindowListExcludeDesktopElements = 16

        // https://developer.apple.com/library/mac/documentation/Carbon/Reference/CGWindow_Reference/Constants/Constants.html#//apple_ref/doc/constant_group/Window_Image_Types
        const val kCGWindowImageDefault = 0
        const val kCGWindowImageBoundsIgnoreFraming = 1
        const val kCGWindowImageShouldBeOpaque = 2
        const val kCGWindowImageOnlyShadows = 4
        const val kCGWindowImageBestResolution = 8
        const val kCGWindowImageNominalResolution = 16

        // see enum NSBitmapImageFileType
        const val NSBitmapImageFileTypeTIFF = 0
        const val NSBitmapImageFileTypeBMP = 1
        const val NSBitmapImageFileTypeGIF = 2
        const val NSBitmapImageFileTypeJPEG = 3
        const val NSBitmapImageFileTypePNG = 4
        const val NSBitmapImageFileTypeJPEG2000 = 5
    }
}
