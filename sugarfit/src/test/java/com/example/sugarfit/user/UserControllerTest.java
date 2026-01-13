package com.example.sugarfit.user;

import com.example.sugarfit.controller.UserController;
import com.example.sugarfit.dto.UserRequest;
import com.example.sugarfit.dto.UserResponse;
import com.example.sugarfit.service.UserMetricsService;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserControllerTest {

    private final UserMetricsService userMetricsService = mock(UserMetricsService.class);
    private final UserController controller = new UserController(userMetricsService);

    @Test
    void testSaveUserMetrics() {
        UserRequest request = new UserRequest();
        UserResponse response = new UserResponse("Success", "12345");

        when(userMetricsService.processUserMetrics(request)).thenReturn(response);

        ResponseEntity<UserResponse> result = controller.saveUserMetrics(request);

        assertEquals(200, result.getStatusCodeValue());
        assertEquals("Success", result.getBody().getStatus());
    }
}
