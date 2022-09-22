package com.ll.exam.qsl.base;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
//Configuration을 넣어야 Bean이 스캔된다.
@Configuration
public class AppConfig {
    //Bean을 넣어야 JPAQueryFactory를 제공해주는 것, 이게 있어야 QueryDSL을 쓸 수 있다.
    @Bean
    public JPAQueryFactory jpaQueryFactory(EntityManager entityManager) {

        return new JPAQueryFactory(entityManager);
    }
}