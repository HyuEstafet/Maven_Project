import org.junit.Test;
import org.junit.jupiter.api.*;

public class CalculatorTesting {

    private CalculatorClass calculator;

    @Test
    public void addCorrectPass () {
        CalculatorClass calculator = new CalculatorClass();
        Assertions.assertEquals(8, calculator.add(3,5));
    }

    @Test
    public void addWrongPass () {
        CalculatorClass calculator = new CalculatorClass();
        Assertions.assertNotEquals(5.2, calculator.add(1.2,3.0));
    }

    @Test
    public void addWrongFail () {
        CalculatorClass calculator = new CalculatorClass();
        Assertions.assertEquals(5.2, calculator.add(1.2,3.0));
    }

}
