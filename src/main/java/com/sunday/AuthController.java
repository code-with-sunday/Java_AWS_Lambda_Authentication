package com.sunday;

public class AuthController {
    private UserService userService;

    public AuthController() {
        this.userService = new UserService();
    }

    public ApiResponsebody authenticateUser(String username, String password) {
        boolean success = userService.authenticate(username, password);
        if (success) {
            return new ApiResponsebody<>(
                    true, "Successfully logged in", success
                    );
        } else {
            return new ApiResponsebody<>(
                    false, "Invalid username or password", false
            );
        }
    }
}