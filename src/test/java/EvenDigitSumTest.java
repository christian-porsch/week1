import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitSumTest {

    @ParameterizedTest
    @CsvSource({"123456789, 20", "252, 4", "-22, -1"})
    @DisplayName("Method should evaluate the even numbers of two given values and sum that even numbers")
    void getEvenDigitSumTest(int number, int expected) {

        // When

        int actual = EvenDigitSum.getEvenDigitSum(number);

        // Then

        assertEquals(actual, expected);
    }
}