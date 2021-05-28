import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCatTest {

    @ParameterizedTest
    @CsvSource({"true, 10, false", "false, 36, false", "false, 35, true"})
    @DisplayName("Method should check if the cat is playing. " +
            "If the temperature is between 25 und 35 and it is not summer should return true. " +
            "If it is summer the temperature could be between 25 and 45 for true")

    public void isCatPlayingTest(boolean summer, int temperature, boolean expected){

        // When

        boolean actual = PlayingCat.isCatPlaying(summer, temperature);

        // Then

        assertEquals(actual, expected);

    }

}