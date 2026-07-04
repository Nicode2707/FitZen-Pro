package com.fitzen.dto;

import com.fitzen.enums.Gender;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RegisterRequest {

    @NotBlank(message = "Full name is required")
    private String fullName;

    @Email(message = "Invalid email")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must contain at least 6 characters")
    private String password;

    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
    private String phone;

    @Min(value = 10)
    @Max(value = 100)
    private Integer age;

    @NotNull(message = "Gender is required")
    private Gender gender;

    @Positive
    private Double height;

    @Positive
    private Double weight;

    @Past
    private LocalDate dateOfBirth;
}