import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastDigitSumTest {

    @ParameterizedTest
    @CsvSource({"252, 4", "257, 9", "0, 0", "5, 10", "-10, -1"})
    @DisplayName("Method should add the first and the last digit of a given number")
    void sumFirstAndLastDigitTest(int number, int expected) {

        // When

        int actual = FirstAndLastDigitSum.sumFirstAndLastDigit(number);

        // Then

        assertEquals(actual, expected);

    }
}