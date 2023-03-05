package com.densoft.apigateway.service.impl;

import com.densoft.apigateway.model.User;
import com.densoft.apigateway.security.jwt.JwtProvider;
import com.densoft.apigateway.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final AuthenticationManager authenticationManager;
    private final JwtProvider jwtProvider;

    @Override
    public User signIn(User user) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
        );
        User newUser = (User) authentication.getPrincipal();
        String token = jwtProvider.generateToken(newUser);
        newUser.setToken(token);
        return newUser;
    }
}
