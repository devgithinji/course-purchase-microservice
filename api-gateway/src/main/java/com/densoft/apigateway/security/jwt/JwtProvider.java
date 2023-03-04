package com.densoft.apigateway.security.jwt;

import com.densoft.apigateway.model.User;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface JwtProvider {

    String generateToken(User user);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest httpServletRequest);
}
