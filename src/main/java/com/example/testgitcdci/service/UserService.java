package com.example.testgitcdci.service;

import com.example.testgitcdci.body.request.UserRequest;
import com.example.testgitcdci.entity.UserEntity;

public interface UserService {

    UserEntity saveUser(UserRequest user);

}
