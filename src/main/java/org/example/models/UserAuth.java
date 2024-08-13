package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class UserAuth {
    private String password;
    private String username;

    public UserAuth(String username, String password) {
        this.password = password;
        this.username = username;
    }
}
