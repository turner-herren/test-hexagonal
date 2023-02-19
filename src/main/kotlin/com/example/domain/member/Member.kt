package com.example.domain.member

import com.example.domain.role.Role
import java.time.LocalDateTime

data class Member(
    val id: Long,
    val email: String,
    val password: String,
    val roles: List<Role>,
    val createdDate: LocalDateTime,
    val updatedDate: LocalDateTime
)
