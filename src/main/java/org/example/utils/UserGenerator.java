package org.example.utils;


import org.example.models.CreateUserRequest;

public class UserGenerator {
    public static CreateUserRequest getCreateUser() {
        CreateUserRequest newUserBody = new CreateUserRequest();
        newUserBody.setAge(2L);
        newUserBody.setFirstName("test");
        newUserBody.setSecondName("dddd");
        newUserBody.setMoney(22222L);
        newUserBody.setSex("MALE");
        return newUserBody;
    }
}
