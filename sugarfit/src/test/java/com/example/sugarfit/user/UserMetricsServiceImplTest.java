package com.example.sugarfit.user;

import com.example.sugarfit.dto.UserRequest;
import com.example.sugarfit.dto.UserResponse;
import com.example.sugarfit.serviceImpl.UserMetricsServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserMetricsServiceImplTest {

    private final UserMetricsServiceImpl service = new UserMetricsServiceImpl();

    @Test
    void testProcessUserMetrics() {
        UserRequest request = new UserRequest();
        UserResponse response = service.processUserMetrics(request);

        assertNotNull(response);
        assertEquals("Success", response.getStatus());
        assertNotNull(response.getRequestId());
    }

    @Test
    void testProcessUserMetricsWithNullRequest() {
        Exception exception = assertThrows(NullPointerException.class, () -> service.processUserMetrics(null));
        assertEquals("Request cannot be null", exception.getMessage());
    }

    @Test
    void testCreateUUID() {
        String uuid = service.createUUID();
        assertNotNull(uuid);
        assertFalse(uuid.isEmpty());
    }

    @Test
    void testCreateUUIDNotEmpty() {
        String uuid = service.createUUID();
        assertNotEquals("", uuid);
    }
}
