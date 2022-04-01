package com.example.testgitcdci.user;

import com.example.testgitcdci.entity.UserEntity;
import com.example.testgitcdci.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class UserRepositoryTest {

    private final UserRepository userRepository;

    @Autowired
    public UserRepositoryTest(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    public void testSaving() {

        UserEntity user = new UserEntity();
        user.setName("Alex");

        userRepository.save(user);

        UserEntity expected = userRepository.getById(1L);

        assertThat(expected.getName()).isEqualTo("Alex");

    }

}
