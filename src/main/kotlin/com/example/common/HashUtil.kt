package com.example.common

import java.security.MessageDigest

private val hashEncoder: MessageDigest = MessageDigest.getInstance("SHA256")

fun sha256(plainText: String): String = byteToHexa(hashEncoder.digest(plainText.toByteArray(Charsets.UTF_8)))

private fun byteToHexa(bytes: ByteArray): String = bytes.toHex().uppercase()
private fun ByteArray.toHex(): String = joinToString(separator = "") { eachByte -> "%02x".format(eachByte) }