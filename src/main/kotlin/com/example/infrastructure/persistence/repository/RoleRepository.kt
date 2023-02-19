package com.example.infrastructure.persistence.repository

import com.example.domain.role.RoleEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository: CrudRepository<RoleEntity, Long> {
}