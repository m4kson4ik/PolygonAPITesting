import org.example.utils.RestWrapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HouseTests {
    public static RestWrapper restWrapper;

    @BeforeAll
    public static void authClient() {
        restWrapper = RestWrapper.login("user@pflb.ru", "user");
    }

    @Test
    void createHouse() {
        restWrapper.houseService.createHouse();
    }
}
