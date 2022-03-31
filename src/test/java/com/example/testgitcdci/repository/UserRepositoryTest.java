package com.example.testgitcdci.repository;

import com.example.testgitcdci.UserEntity;
import com.example.testgitcdci.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class UserRepositoryTest {

    private final UserRepo userRepo;

    @Autowired
    public UserRepositoryTest(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Test
    public void testSaving() {

        UserEntity user = new UserEntity();
        user.setName("Alex");

        userRepo.save(user);

        UserEntity expected = userRepo.getById(1L);

        assertThat(expected.getName()).isEqualTo("Alex");

    }

}
