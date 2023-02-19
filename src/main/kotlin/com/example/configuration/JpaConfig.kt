package com.example.configuration

import com.linecorp.kotlinjdsl.QueryFactory
import com.linecorp.kotlinjdsl.QueryFactoryImpl
import com.linecorp.kotlinjdsl.query.creator.CriteriaQueryCreatorImpl
import com.linecorp.kotlinjdsl.query.creator.SubqueryCreatorImpl
import jakarta.persistence.EntityManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaAuditing
@EnableJpaRepositories(basePackages = ["com.example"])
@Configuration
class JpaConfig {

    @Bean
    fun queryFactory(entityManager: EntityManager): QueryFactory = QueryFactoryImpl(
        criteriaQueryCreator = CriteriaQueryCreatorImpl(entityManager),
        subqueryCreator = SubqueryCreatorImpl()
    )
}