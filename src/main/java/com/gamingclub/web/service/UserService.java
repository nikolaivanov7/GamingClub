package com.gamingclub.web.service;

import com.gamingclub.web.dto.RegistrationDto;
import com.gamingclub.web.models.UserEntity;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);
}
