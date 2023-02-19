package com.example.infrastructure.persistence.repository

import com.example.domain.resource.ResourceEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ResourceRepository: CrudRepository<ResourceEntity, Long> {
}