import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class charSwitchTest {

    @ParameterizedTest (name = "Method should check for char A,B,C,D or E and return a message for every char")
    @CsvSource({"A,A", "B,B", "C,C", "D,D", "E,E"})

    public void switchThroughCharTest(char character, char expected){

        char actualChar = charSwitch.switchThroughCharTest(character);

        assertEquals (expected, actualChar);

    }

}
