package com.densoft.apigateway.service;

import com.densoft.apigateway.model.User;

public interface AuthenticationService {
    User signIn(User user);
}
