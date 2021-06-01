import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDaysInMonthTest {

    @ParameterizedTest
    @CsvSource({"-1600, false", "1600, true", "2017, false", "2000, true"})
    void isLeapYearTest(int year, boolean expected) {

        // When

        boolean actual = NumberOfDaysInMonth.isLeapYear(year);

        // Then

        assertEquals(actual, expected);

    }

    @ParameterizedTest
    @CsvSource({"1, 2020, 31", "2, 2020, 29", "2, 2018, 28", "-1 , 2020, -1", "1, -2020, -1"})
    void getDaysInMonthTest(int month, int year, int expected){

        // When

        int actual = NumberOfDaysInMonth.getDaysInMonth(month, year);

        // Then

        assertEquals(actual, expected);

    }
}