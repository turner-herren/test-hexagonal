package com.example.domain.member

import com.example.infrastructure.persistence.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {

    fun save() {}


    fun find() {}

    fun update() {}

    fun delete() {}
}