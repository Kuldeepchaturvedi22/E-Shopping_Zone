package com.userservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @NotBlank(message = "Full name is required")
    private String fullName;
    private String image;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is required")
    private String emailId;

    @NotNull(message = "Mobile number is required")
    private Long mobileNumber;

    private String about;

    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date dateOfBirth;

    @NotBlank(message = "Gender is required")
    private String gender;

    @NotNull(message = "Role is required")
    private String role;

    @NotBlank(message = "Password is required")
    private String password;
}
