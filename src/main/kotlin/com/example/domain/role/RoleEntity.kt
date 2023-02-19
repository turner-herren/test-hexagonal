package com.example.domain.role

import com.example.domain.resource.ResourceEntity
import com.example.domain.common.BaseDateTimeEntity
import jakarta.persistence.*

@Table(name = "role")
@Entity
class RoleEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,

    @Column
    private val name: String,

    @OneToMany
    @JoinColumn(name = "role")
    private var resources: List<ResourceEntity>

) : BaseDateTimeEntity()