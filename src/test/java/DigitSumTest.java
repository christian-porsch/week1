import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DigitSumTest {

    @ParameterizedTest
    @CsvSource({"125, 8", "489, 21", "9, -1", "-12, -1"})

    void sumDigitTest (int number, int expected){

        // When

        int actual = DigitSum.sumDigit(number);

        // Then

        assertEquals(actual, expected);

    }

}