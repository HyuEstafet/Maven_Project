;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTestJUnit5 {

    @ParameterizedTest
    @ValueSource (ints = {1,2,3,4})
    void testMethod (int a) {
        assertTrue(a%2==0);

    }

    @ParameterizedTest
    @ValueSource (strings = {"father","mother","brother", "sister"})
    void testStrings (String str) {
        assertFalse(str.contains("a"));
    }

}
