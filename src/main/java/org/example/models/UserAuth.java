package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class UserAuth {
    private final String password;
    private final String username;

    public UserAuth(String username, String password) {
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
