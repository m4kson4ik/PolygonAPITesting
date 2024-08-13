package org.example.utils.service;

import io.restassured.http.ContentType;

import org.apache.http.Header;
import org.example.models.CreateUserRequest;
import org.example.models.UserPojo;

import java.math.BigDecimal;
import java.util.List;

import static io.restassured.RestAssured.given;

public class UserService extends RestService {
    private UserPojo user;

    @Override
    protected String getBasePath() {
        return "/user";
    }

    public UserService(String token) {
        super(token);
    }

    public UserPojo createUser(UserPojo newUser) {
         user = given()
                .spec(REQ_SPEC)
                .body(newUser)
                .post()
                .as(UserPojo.class);
         return user;
    }

    public UserPojo getCreatedUser() {
        return user;
    }

    public UserPojo getUserById(int id) {
        return given().spec(REQ_SPEC)
                .header("ContentType","application/json")
                .get("/" + id).as(UserPojo.class);
    }

    public List<UserPojo> getUsers() {
        return given().spec(REQ_SPEC)
                .contentType(ContentType.JSON)
                .get()
                .jsonPath().getList("", UserPojo.class);
    }

    public UserPojo accrualMoneyTheUser(int id, BigDecimal money) {
        return given()
                .spec(REQ_SPEC)
                .contentType("application/json")
                .header("Host", "")
                .post("/"+id +"/money/"+money).as(UserPojo.class);
    }

    public int deletedUser(int id) {
        return given()
                .spec(REQ_SPEC)
                .delete("/"+id).statusCode();
    }

    public UserPojo editingUser(int id, CreateUserRequest model) {
        return given()
                .spec(REQ_SPEC)
                .body(model)
                .put("/"+ id)
                .as(UserPojo.class);
    }

    public UserPojo buyCarIsUser(int idUser, Long idCar) {
        return given()
                .spec(REQ_SPEC)
                .post("/"+ idUser + "/buyCar/"+idCar)
                .as(UserPojo.class);
    }

    public UserPojo sellCarIsUser(int idUser, int idCar) {
        return given()
                .spec(REQ_SPEC)
                .post("/"+ idUser + "/sellCar/"+idCar)
                .as(UserPojo.class);
    }
}
