import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SecondsAndMinutesTest {

    @ParameterizedTest
    @CsvSource({"80, 45, 01h 20m 45s", "120, 86, Invalid value"})
    @DisplayName("Method should calculate the minutes to hours and return hours, remaining minutes and seconds")
    void getDurationStringTest(int minutes, int seconds, String expected) {

        // When

        String actualDuration = SecondsAndMinutes.getDurationString(minutes, seconds);

        // Then

        assertEquals(actualDuration, expected);

    }

    @ParameterizedTest
    @CsvSource({"180, 00h 03m 00s", "-12, Invalid Value"})
    @DisplayName("Method should calculate seconds to minutes and then call the method which calculates the minutes to hours")
    void getDurationStringOverloadTest(int seconds, String expected) {

        // When

        String actualDuration = SecondsAndMinutes.getDurationString(seconds);

        // Then

        assertEquals(actualDuration, expected);

    }
}
