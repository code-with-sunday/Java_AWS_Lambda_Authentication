package com.sunday;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class LambdaHandler implements RequestHandler<Map<String, String>, ApiResponsebody> {
    private AuthController authController;

    public LambdaHandler() {
        this.authController = new AuthController();
    }

    @Override
    public ApiResponsebody handleRequest(Map<String, String> input, Context context) {
        String username = input.get("username");
        String password = input.get("password");

        return authController.authenticateUser(username, password);

    }
}
