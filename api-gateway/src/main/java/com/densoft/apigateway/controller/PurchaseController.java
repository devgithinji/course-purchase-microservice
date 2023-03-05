package com.densoft.apigateway.controller;

import com.densoft.apigateway.model.User;
import com.densoft.apigateway.request.PurchaseServiceRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gateway/purchase")
@RequiredArgsConstructor
public class PurchaseController {
    private final PurchaseServiceRequest purchaseServiceRequest;

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Object purchase) {
        return new ResponseEntity<>(purchaseServiceRequest.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchaseOfAuthorizedUser(@AuthenticationPrincipal User user) {
        return ResponseEntity.ok(purchaseServiceRequest.getAllPurchasesOfOrder(user.getId()));

    }
}
