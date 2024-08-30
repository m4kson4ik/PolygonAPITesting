package org.example.utils.service;


import org.example.models.Car.CarPojo;
import org.example.utils.generator.Generator;
import org.example.utils.myInterface.CarApi;

import static io.restassured.RestAssured.given;

public class CarService extends RestService implements CarApi {
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
                .body(Generator.generateCar())
                .post().as(CarPojo.class);
        return car;
    }
}
