package org.example.kb7spring.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

@Slf4j
public class JDBCTest {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("JDBC 드라이버 연결 확인")
    public void testConnection() {
        String url = "jdbc:mysql://127.0.0.1:3306/kb7spring";
        try (Connection con = DriverManager.getConnection(url, "root", "1234")) {
            log.info("Connection : {}", con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
