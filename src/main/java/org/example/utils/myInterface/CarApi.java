package org.example.utils.myInterface;

import org.example.models.Car.CarPojo;

public interface CarApi {
    CarPojo getCreatedCar();
    CarPojo createCar();
}
