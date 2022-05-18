import org.junit.jupiter.api.*;

public class CalculatorTesting {

    private CalculatorClass calculator;

    @BeforeEach
    public void setCalculator() {
        calculator = new CalculatorClass();
    }

    @Test
    public void addCorrectPass () {
        Assertions.assertEquals(8, calculator.add(3,5)); // this will pass
    }

    @Test
    public void addWrongPass () {
        Assertions.assertNotEquals(5.2, calculator.add(1.2,3.0)); // this will pass
    }

    @Disabled ("Testing the ignore functionality in JUnit 5")
    @Test
    public void addWrongFail () {
        Assertions.assertEquals(5.2, calculator.add(1.2,3.0)); // this will fail
    }

    @AfterEach // to run after each test
    public void doneTests () {
        System.out.println("The test is done");
    }

    @AfterAll // to run once after all tests are done
    static  void doneAll () {
        System.out.println("Finished");
    }

}
