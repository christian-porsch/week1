import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberPalindromeTest {

    @ParameterizedTest
    @CsvSource({"-1221, true", "707, true", "11212, false"})
    void isPalindromeTest(int number, boolean expected) {

        // When

        boolean actual = NumberPalindrome.isPalindrome(number);

        // Then

        assertEquals(actual, expected);
    }
}