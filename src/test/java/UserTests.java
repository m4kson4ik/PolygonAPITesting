
import org.example.models.UserPojo;
import org.example.utils.RestWrapper;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;


import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.utils.generator.Generator.generateUser;

public class UserTests extends Base {

    @Test
    @DisplayName("Создание пользователя")
    void createUser() {
        var item = api.userService.createUser(generateUser());
        assertThat(item)
                .isNotNull();
    }

    @Test
    @DisplayName("Получение созданного пользователя по айди")
    void getUserById() {
        System.out.println(api.userService.getUserById(api.userService.getCreatedUser().getId()));
    }


    @Test
    @DisplayName("Покупка автомобиля созданному пользователю, и проверка снятия денег")
    void buyCarAndCheckBalance() {
        var car = api.carApi.createCar();
        var user = api.userService.createUser(new UserPojo(1, "dd", "dd", 22, "MALE", 20000D));
        var newItem = api.userService.buyCarIsUser(api.userService.getCreatedUser().getId(), api.carApi.getCreatedCar().getId());
        assertThat(newItem.getMoney()).isEqualTo(user.getMoney() - car.getPrice());
        System.out.println(newItem);
    }

    @Test
    @DisplayName("Удаление пользователя")
    void deletedUser() {
        var itemCreated = api.userService.createUser(new UserPojo(1, "dd", "dd", 22, "MALE", 20000D));
        var itemDeleted = api.userService.deletedUser(itemCreated.getId());
        assert(itemDeleted == 204);
    }

    @Test
    @DisplayName("Заселения пользователя в новый дом")
    void userInHouse() {
      //  var house = api.houseService.createHouse();
        var user = api.userService.createUser(new UserPojo(1, "dd", "dd", 22, "MALE", 20000D));
       // System.out.println(api.houseService.settleUserInHouse(house.id, user.getId()));
    }
}
