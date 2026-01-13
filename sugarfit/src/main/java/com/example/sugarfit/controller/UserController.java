package com.example.sugarfit.controller;

import com.example.sugarfit.dto.UserRequest;
import com.example.sugarfit.dto.UserResponse;
import com.example.sugarfit.service.UserMetricsService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserMetricsService userMetricsService;

    @PostMapping(value = "/saveUserMetrics")
    public ResponseEntity<UserResponse> saveUserMetrics(@Valid @RequestBody UserRequest userRequest) {
        logger.info("Received request to save user metrics:::");
        UserResponse result = userMetricsService.processUserMetrics(userRequest);
        return ResponseEntity.ok(result);
    }

}
