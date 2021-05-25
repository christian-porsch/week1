import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TeenNumberCheckerTest {

    @ParameterizedTest
    @DisplayName("Method should return true if one of three parameters is between 13-19 and false if not")
    @CsvSource({"9, 99, 19, true", "23, 15, 42, true", "22, 23, 34, false"})

    public void hasTeenTest(int age1, int age2, int age3, boolean expected){

        // When
        boolean actual = TeenNumberChecker.hasTeen(age1, age2, age3);

        // Then
        assertEquals(expected, actual);

    }

}