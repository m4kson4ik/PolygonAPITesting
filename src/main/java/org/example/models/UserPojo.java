package org.example.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.text.DecimalFormat;

@Data
@Builder
@NoArgsConstructor
public class UserPojo {
    public Integer id;
    public String firstName;
    public String secondName;
    public int age;
    public String sex;
    public double money;

    public UserPojo(Integer id, String firstName, String secondName, Integer age, String sex, double money) {
        this.money = money;
        this.sex = sex;
        this.age = age;
        this.secondName = secondName;
        this.firstName = firstName;
        this.id = id;
    }
}
