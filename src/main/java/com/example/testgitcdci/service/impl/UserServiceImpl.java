package com.example.testgitcdci.service.impl;

import com.example.testgitcdci.body.request.UserRequest;
import com.example.testgitcdci.entity.UserEntity;
import com.example.testgitcdci.repository.UserRepository;
import com.example.testgitcdci.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity saveUser(UserRequest user) {
        UserEntity newUser = new UserEntity();
        newUser.setName(user.name());
        return userRepository.save(newUser);
    }

}
