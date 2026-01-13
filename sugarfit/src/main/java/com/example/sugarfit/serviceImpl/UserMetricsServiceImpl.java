package com.example.sugarfit.serviceImpl;

import com.example.sugarfit.dto.UserRequest;
import com.example.sugarfit.dto.UserResponse;
import com.example.sugarfit.service.UserMetricsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class UserMetricsServiceImpl implements UserMetricsService {
    @Override
    public UserResponse processUserMetrics(UserRequest request) {
        log.info("Processing user request:::");
        String requestId = createUUID();
        return new UserResponse("Success", requestId);
    }

    public String createUUID(){
        return UUID.randomUUID().toString();
    }
}
