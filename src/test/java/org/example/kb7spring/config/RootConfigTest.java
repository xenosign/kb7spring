package org.example.kb7spring.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.web.WebAppConfiguration;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig
@WebAppConfiguration
@ContextConfiguration(classes = RootConfig.class)
@Slf4j
class RootConfigTest {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    @DisplayName("Datasource 연결 확인")
    void sqlSessionFactory() {
        try (SqlSession session = sqlSessionFactory.openSession();
             Connection con = session.getConnection()) {
            log.info("SqlSession: {}", session);
            log.info("Connection: {}", con);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }


}