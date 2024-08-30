package org.example.utils.generator;


import org.example.models.Car.CarPojo;
import org.example.models.House.HousePojo;
import org.example.models.UserPojo;

import java.util.ArrayList;

public class Generator {
    public static UserPojo generateUser() {
        return new UserPojo(0, "test", "test", 22, "MALE", 2222L);
    }

    public static CarPojo generateCar() {
        return new CarPojo("Diesel",0L,"Honda", "Civic", 10000D);
    }

    public static HousePojo generateHouse() {
        return new HousePojo(1, 22, 2222, new ArrayList<>(), new ArrayList<>());
    }
}
