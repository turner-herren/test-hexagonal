package com.example.domain.member

import com.example.common.sha256
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import jakarta.persistence.Embeddable

@JsonDeserialize(using = PasswordDeserializer::class)
@JsonSerialize(using = PasswordSerializer::class)
@Embeddable
data class Password(
    var password: String
) {
    init {
        password = sha256(password)
    }
}

private class PasswordDeserializer: JsonDeserializer<Password>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Password = Password(p.text)
}

private class PasswordSerializer: JsonSerializer<Password>() {
    override fun serialize(value: Password, gen: JsonGenerator, serializers: SerializerProvider) {
        gen?.writeString(value.password)
    }
}