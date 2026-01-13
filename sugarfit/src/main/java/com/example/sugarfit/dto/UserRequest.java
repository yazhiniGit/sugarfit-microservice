package com.example.sugarfit.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserRequest {

    @NotBlank(message = "UserId cannot be null or empty")
    private String userId;

    @NotNull(message = "Value cannot be null or empty")
    @Min(value = 0, message = "Value must be positive")
    private Integer value;
}
