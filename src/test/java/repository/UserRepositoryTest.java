package repository;

import com.example.That.s.Just.Gravy.entity.User;
import com.example.That.s.Just.Gravy.repository.UserRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;
    User user;

    @BeforeEach
    public void init() {
        user = new User();
        user.setEmail("harriet@like.com");
        user.setPassword("bubbles");
    }

    @Test
    public void testAddUser()
    {

        userRepository.save(user);
        Assertions.assertTrue(userRepository.count() > 0);
    }
}

