import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitCheckerTest {

    @ParameterizedTest
    @CsvSource({"41, 22, 71, true", "23, 32, 42, true", "9, 99, 999, false"})
    @DisplayName("Method should check if the last digit of one of three given values is the same")
    void hasSameLastDigit(int value1, int value2, int value3, boolean expected) {

        // When

        boolean actual = LastDigitChecker.hasSameLastDigit(value1, value2, value3);

        // Then

        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({"10, true", "468, true", "1051, false"})
    @DisplayName("Method should check if a given number is between 10 and 1000")
    void isValidTest(int number, boolean expected) {

        // When

        boolean actual = LastDigitChecker.isValid(number);

        // Then

        assertEquals(actual, expected);
    }
}