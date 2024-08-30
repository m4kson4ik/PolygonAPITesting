import org.example.utils.RestWrapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CarTests extends Base {
    @Test
    @DisplayName("Создание автомобиля")
    public void createCar() {
        System.out.println(api.carApi.createCar());
    }
}
