package com.example.domain.common

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@EntityListeners(AuditingEntityListener::class)
@MappedSuperclass
abstract class BaseDateTimeEntity(
    @Column(name = "create_datetime", nullable = false, updatable = false)
    @CreatedDate
    private val createdDate: LocalDateTime = LocalDateTime.now(),

    @Column(name = "update_datetime", nullable = false, updatable = true)
    @LastModifiedDate
    private var modifiedDate: LocalDateTime = LocalDateTime.now()
)