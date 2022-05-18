import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParameterizedTestCSV {

    @ParameterizedTest
    @CsvSource({"DOG,dog", "CAT,cat", "BIRD,bird", "COW,cow"})
    public void testCSVSourceMethod (String input, String expected) {
        String actualInput = input.toLowerCase();
        assertEquals(expected, actualInput);
    }

    @ParameterizedTest
    @CsvSource (value = {"plovdiv:PLOVDIV", "london:LONDON", "new york:NEW YORK"}, delimiter = ':')
    public void testCSVSourceMethodDelimeter (String newInput, String newActual) {
        String cityName = newInput.toUpperCase();
        assertTrue(true);
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/CSVforParameterizedTesting - Sheet1.csv", numLinesToSkip = 1)
    public void toUpperCaseMethodTest ( String input1, String expected1) {
        String actualValueWeekDay = input1.toUpperCase();
        assertEquals(expected1, actualValueWeekDay );
    }


}
