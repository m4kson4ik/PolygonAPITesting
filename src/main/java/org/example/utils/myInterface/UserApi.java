package org.example.utils.myInterface;

import org.example.models.UserPojo;

import java.math.BigDecimal;
import java.util.List;

public interface UserApi {
    UserPojo createUser(UserPojo newUser);
    UserPojo getCreatedUser();
    UserPojo getUserById(int id);
    List<UserPojo> getUsers();
    UserPojo accrualMoneyTheUser(int id, BigDecimal money);
    int deletedUser(int id);
    UserPojo editingUser(int id, UserPojo model);
    UserPojo buyCarIsUser(int idUser, Long idCar);
    UserPojo sellCarIsUser(int idUser, int idCar);
}
