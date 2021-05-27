import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToYearsAndDaysTest {

    @ParameterizedTest
    @CsvSource({"525600, 525600 min = 1 y and 0 d", "1051200, 1051200 min = 2 y and 0 d", "561600, 561600 min = 1 y and 25 d"})
    @DisplayName("Method should calculate the given minutes to days and years")

    public void printYearsAndDaysTest(long minutes, String expected){

        // When

       String actual = MinutesToYearsAndDays.printYearsAndDays(minutes);

        // Then

        assertEquals(actual, expected);
    }

}
