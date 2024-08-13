
import org.example.models.UserPojo;
import org.example.utils.RestWrapper;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;


import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
public class UserTests {

    private static RestWrapper api;

    @BeforeAll
    public static void authClient() {
        api = RestWrapper.login("user@pflb.ru", "user");
    }

//    @Test
//    void getUsersList() {
//       System.out.println(api.userService.getUsers());
//    }

    @Test
    void createUser() {
        System.out.println(1);
        var item = api.userService.createUser(new UserPojo(1, "dd", "dd", 22, "MALE", 200D));
        System.out.println(item);
        assertThat(item)
                .isNotNull();
    }

    @Test
    void getUserById() {
        System.out.println(api.userService.getUserById(api.userService.getCreatedUser().id));
    }

//    @Test
//    void accrualMoneyTheUserAndCheckBalance() {
//        api.userService.accrualMoneyTheUser(api.userService.getCreatedUser().id, BigDecimal.valueOf(2000));
//    }
    @Test
    void buyCarAndCheckBalance() {
        var car = api.carService.createCar();
        var user = api.userService.createUser(new UserPojo(1, "dd", "dd", 22, "MALE", 20000D));
        var newItem = api.userService.buyCarIsUser(api.userService.getCreatedUser().id, api.carService.getCreatedCar().id);
        assertThat(newItem.money).isEqualTo(user.money - car.price);
        System.out.println(newItem);
    }

    @Test
    void deletedUser() {
        api.userService.createUser(new UserPojo(1, "dd", "dd", 22, "MALE", 20000D));
        System.out.println(api.userService.deletedUser(api.userService.getCreatedUser().id));
    }

    @Test
    void userInHouse() {
        var house = api.houseService.createHouse();
        var user = api.userService.createUser(new UserPojo(1, "dd", "dd", 22, "MALE", 20000D));
        System.out.println(api.houseService.settleUserInHouse(house.id, user.id));
    }
}
