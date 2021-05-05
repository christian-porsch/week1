import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DayOfTheWeekTest {

    @ParameterizedTest
    @DisplayName("Method should check with a given number for the day of the week that is equal to the number")
    @CsvSource({"0, Monday", "1, Tuesday", "2, Wednesday", "3 , Thursday", "4, Friday", "5, Saturday", "6, Sunday", "7, Invalid Day"})


    public void printDayOfTheWeekTest(int day, String expected){

        // When

        String actualDay = DayOfTheWeek.printDayOfTheWeek(day);

        // Then

        assertEquals(expected, actualDay);

    }

}