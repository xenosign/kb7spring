package org.example.kb7spring.user.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String role;

    public static User createMember(String username, String encodedPassword) {
        User user = new User();
        user.username = username;
        user.password = encodedPassword;
        user.role = "ROLE_MEMBER";
        return user;
    }

    public static User createAdmin(String username, String encodedPassword) {
        User user = new User();
        user.username = username;
        user.password = encodedPassword;
        user.role = "ROLE_ADMIN";
        return user;
    }
}
