import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberInWordTest {

    @ParameterizedTest
    @CsvSource({
            "0, ZERO",
            "1, ONE",
            "2, TWO",
            "3, THREE",
            "4, FOUR",
            "5, FIVE",
            "6, Out of range"
    })

    public void printNumberInWordTest(int number,String expected){

        // WHEN

        String actual = NumberInWord.printNumberInWord(number);

        // THEN

        assertEquals(expected, actual);

    }

}
