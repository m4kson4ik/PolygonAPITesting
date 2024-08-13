import org.example.utils.RestWrapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class CarTests {
    private static RestWrapper api;

    @BeforeAll
    public static void authClient() {
        api = RestWrapper.login("user@pflb.ru", "user");
    }
    @Test
    public void createCar() {
        System.out.println(api.carService.createCar());
    }
}
