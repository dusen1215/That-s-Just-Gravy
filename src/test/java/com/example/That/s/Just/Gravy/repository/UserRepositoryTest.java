package com.example.That.s.Just.Gravy.repository;

import com.example.That.s.Just.Gravy.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserRepositoryTest {

    User user;

    @BeforeEach
    public void init() {
        user = new User();
        user.setEmail("harriet@like.com");
        user.setPassword("bubbles");
    }
}
