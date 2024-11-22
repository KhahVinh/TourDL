package org.example.request;

import jakarta.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank(message = "Email cannot be blank")
    private String email;
    @NotBlank(message = "password cannot be blank")
    private String password;

    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public LoginRequest() {
    }

    public @NotBlank(message = "Email cannot be blank") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email cannot be blank") String email) {
        this.email = email;
    }

    public @NotBlank(message = "password cannot be blank") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "password cannot be blank") String password) {
        this.password = password;
    }
}
