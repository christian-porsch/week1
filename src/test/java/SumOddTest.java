
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SumOddTest {

    @ParameterizedTest
    @CsvSource({"20, false", "86, false", "777, true", "563, true", "-10, false"})
    void isOddTest(int number, boolean expected) {

        // When

        boolean actual = SumOdd.isOdd(number);

        // Then

        assertEquals(actual, expected);

    }

    @ParameterizedTest
    @CsvSource({"1, 100, 2500", "-1, 100, -1", "100, 100, 0", "13, 13, 13", "100, -100, -1", "100, 1000, 247500"})
    void sumOddTest(int start, int end, int expected) {

        // When

        int actual = SumOdd.sumOdd(start, end);

        // Then

        assertEquals(actual, expected);

    }
}