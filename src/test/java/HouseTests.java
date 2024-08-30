import org.example.utils.RestWrapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HouseTests extends Base {
    @Test
    @DisplayName("Создание дома")
    void createHouse() {
        api.houseService.createHouse();
    }
}
