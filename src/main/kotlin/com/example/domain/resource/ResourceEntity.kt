package com.example.domain.resource

import com.example.domain.common.BaseDateTimeEntity
import jakarta.persistence.*

@Table(name = "resource")
@Entity
class ResourceEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,


) : BaseDateTimeEntity()