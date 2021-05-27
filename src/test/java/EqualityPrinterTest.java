import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class EqualityPrinterTest {

    @ParameterizedTest
    @CsvSource({"1, 1, 1, All numbers are equal", "1, 1, 2, Neither all are equal or different", "-1, -1, -1, Invalid Value", "1, 2, 3, All numbers are different"})
    @DisplayName("Method should check if three given integer are valid, all equal, all different or neither of that")
    void printEqual(int value1, int value2, int value3, String expected) {

        // When

        String actual = EqualityPrinter.printEqual(value1, value2, value3);

        // Then

        assertEquals(actual, expected);
    }
}