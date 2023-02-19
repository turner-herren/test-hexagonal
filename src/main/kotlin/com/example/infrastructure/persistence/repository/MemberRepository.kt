package com.example.infrastructure.persistence.repository

import com.example.domain.member.MemberEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : CrudRepository<MemberEntity, Long>{
}