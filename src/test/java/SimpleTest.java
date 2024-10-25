import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

interface baseInterface {
    String getText();
}

interface interface1 extends baseInterface {
    default String getText() {
        return "interface1";
    }
}

interface interface2 extends baseInterface {
    default String getText() {
        return "interface2";
    }

}

class JedTheInterfacer1 implements interface1 {
}

class JedTheInterfacer2 implements interface2 {
}

public class SimpleTest {
    @Test
    void test1() {
        assertEquals("interface1", new JedTheInterfacer1().getText());
        assertEquals("interface2", new JedTheInterfacer2().getText());
    }


}
