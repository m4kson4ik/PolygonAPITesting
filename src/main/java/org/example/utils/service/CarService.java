package org.example.utils.service;


import org.example.models.Car.CarPojo;

import static io.restassured.RestAssured.given;

public class CarService extends RestService {
    public CarService(String token) {
        super(token);
    }

    @Override
    protected String getBasePath() {
        return "/car";
    }

    private CarPojo car;

    public CarPojo getCreatedCar() {
        return car;
    }

    public CarPojo createCar() {
                car = given()
                .spec(REQ_SPEC)
                .body(new CarPojo("Diesel",0L,"Honda", "Civic", 10000D))
                .post().as(CarPojo.class);
        return car;
    }
}
