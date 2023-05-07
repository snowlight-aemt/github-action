import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void add() {
        App app = new App();
        Assertions.assertEquals(app.add(1, 2), 3);

    }
}