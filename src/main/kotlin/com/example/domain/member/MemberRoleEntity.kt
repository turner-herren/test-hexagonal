package com.example.domain.member

import com.example.domain.role.RoleEntity
import jakarta.persistence.*

@Table(name = "member_role")
@Entity
class MemberRoleEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,

    @ManyToOne
    @JoinColumn(name = "member_id")
    private var member: MemberEntity,

    @OneToOne
    @JoinColumn(name = "role_id")
    private var role: RoleEntity
)