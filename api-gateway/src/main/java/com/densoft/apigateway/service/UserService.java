package com.densoft.apigateway.service;

import com.densoft.apigateway.model.Role;
import com.densoft.apigateway.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends UserDetailsService {
    User saveUser(User user);

    User findUserByUsername(String username);

    void changeRole(Role role, String username);
}

