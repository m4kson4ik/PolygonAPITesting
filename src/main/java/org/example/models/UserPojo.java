package org.example.models;


import lombok.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;

@Data
@Builder
@NoArgsConstructor
public class UserPojo {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public double getMoney() {
        return money;
    }

    private String firstName;
    private String secondName;
    private int age;
    private String sex;
    private double money;

    public UserPojo(Integer id, String firstName, String secondName, int age, String sex, double money) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.sex = sex;
        this.money = money;
    }
}
