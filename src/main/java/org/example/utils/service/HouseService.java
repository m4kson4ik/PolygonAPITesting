package org.example.utils.service;



import org.example.models.House.HousePojo;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class HouseService extends RestService{
    public HouseService(String token) {
        super(token);
    }

    @Override
    protected String getBasePath() {
        return "/house";
    }

    public HousePojo createHouse() {
        return given()
                .spec(REQ_SPEC)
                .body(new HousePojo(1, 22, 2222, new ArrayList<>(), new ArrayList<>()))
                .log().all()
                .post().as(HousePojo.class);
    }

    public HousePojo settleUserInHouse(int idHouse, int idUser) {
        return given()
                .spec(REQ_SPEC)
                .post("/" + idHouse + "/" +idUser)
                .as(HousePojo.class);
    }
}
