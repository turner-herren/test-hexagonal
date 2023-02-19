package com.example.domain.member

import com.example.domain.common.BaseDateTimeEntity
import jakarta.persistence.*

@Table(name = "member")
@Entity
class MemberEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,

    private val email: String,

    @AttributeOverride(name = "password", column = Column(name = "password", nullable = false))
    private val password: Password,

    @OneToMany(mappedBy = "member")
    private var memberRoles: List<MemberRoleEntity>
)  : BaseDateTimeEntity()