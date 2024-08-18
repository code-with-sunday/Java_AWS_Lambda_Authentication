package com.sunday;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, String> users = new HashMap<>();

    public UserService() {
        users.put("user1", "password123");
        users.put("user2", "password456");
    }

    public boolean authenticate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}