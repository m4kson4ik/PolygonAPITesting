package org.example.utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import io.restassured.specification.RequestSpecification;
import org.example.models.UserAuth;
import org.example.utils.service.CarService;
import org.example.utils.service.HouseService;
import org.example.utils.service.UserService;


import java.util.List;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class RestWrapper {
    private static final String URL = "http://77.50.236.203:4879";
    private static RequestSpecification REQUEST_SPECIFICATION;
    private Cookies cookies;

    public UserService userService;
    public CarService carService;
    public HouseService houseService;

    private RestWrapper(String token) {
        userService = new UserService(token);
        carService = new CarService(token);
        houseService = new HouseService(token);
        REQUEST_SPECIFICATION = new RequestSpecBuilder()
                .setBaseUri(URL)
                .setContentType(ContentType.JSON)
                .build();
    }
    public static RestWrapper login(String username, String password) {
        String token = given()
                .when()
                .contentType(ContentType.JSON)
                .baseUri(URL)
                .basePath("/login")
                .body(new UserAuth(username, password))
                .post().jsonPath().getString("access_token");
        return new RestWrapper(token);
    }
}
