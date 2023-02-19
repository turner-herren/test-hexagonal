package com.example.common

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.security.MessageDigest
import java.util.*

internal class HashTest {

    companion object {
        val encoder = MessageDigest.getInstance("SHA256")
        private fun byteToHexa(bytes: ByteArray): String = bytes.toHex().uppercase()
        private fun ByteArray.toHex(): String = joinToString(separator = "") { eachByte -> "%02x".format(eachByte) }
    }

    @Test
    fun `sha256_test`() {
        val text = "test1234"

        val encoded = byteToHexa(encoder.digest(text.toByteArray(Charsets.UTF_8)))

        Assertions.assertEquals("937E8D5FBB48BD4949536CD65B8D35C426B80D2F830C5C308E2CDEC422AE2244", encoded)
    }
}