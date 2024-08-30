import org.example.utils.RestWrapper;
import org.junit.jupiter.api.BeforeAll;

public class Base {
    public static RestWrapper api;
    @BeforeAll
    public static void authClient() {
        api = RestWrapper.login("user@pflb.ru", "user");
    }
}
