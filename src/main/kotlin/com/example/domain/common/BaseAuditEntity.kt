package com.example.domain.common

import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.jpa.domain.support.AuditingEntityListener

@EntityListeners(AuditingEntityListener::class)
@MappedSuperclass
abstract class BaseAuditEntity(
    @CreatedBy
    private val createdId: Long,

    @LastModifiedBy
    private val updatedId: Long
) : BaseDateTimeEntity()