import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @Tag("slow")
    void add() {
        App app = new App();
        Assertions.assertEquals(app.add(1, 2), 2);

    }
    @Test
    @Tag("fast")
    void add_f() {
        App app = new App();
        Assertions.assertEquals(app.add(1, 2), 3);

    }
}