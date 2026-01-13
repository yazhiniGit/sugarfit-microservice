package com.example.sugarfit.service;

import com.example.sugarfit.dto.UserRequest;
import com.example.sugarfit.dto.UserResponse;

public interface UserMetricsService {
    UserResponse processUserMetrics(UserRequest request);
}
