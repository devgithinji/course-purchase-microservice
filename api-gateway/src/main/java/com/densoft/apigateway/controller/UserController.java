package com.densoft.apigateway.controller;

import com.densoft.apigateway.model.Role;
import com.densoft.apigateway.model.User;
import com.densoft.apigateway.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PutMapping("change/{role}")
    public ResponseEntity<?> changeRole(@AuthenticationPrincipal User user, @PathVariable("role") Role role) {
        userService.changeRole(role, user.getUsername());
        return ResponseEntity.ok(true);
    }
}
