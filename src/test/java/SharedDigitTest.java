import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SharedDigitTest {

    @ParameterizedTest
    @CsvSource({"12, 23, true", "9, 99, false", "15, 55, true"})
    @DisplayName("Method should check if two given values have one digit that ")
    void hasSharedDigitTest(int value1, int value2, boolean expected) {

        // When

        boolean actual = SharedDigit.hasSharedDigit(value1, value2);

        // Then

        assertEquals(actual, expected);
    }
}