import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    @ParameterizedTest
    @CsvSource({"5.0, 78.53981633974483", "-1, -1"})

    public void areaTest(double radius, double expected){

        double actual = AreaCalculator.area(radius);

        assertEquals(actual,expected);

    }

    @ParameterizedTest
    @CsvSource({"5.0, 4.0, 20.0", "-1, 4.0, -1"})
    public void areaOverloadTest(double x, double y, double expected){

        double actual = AreaCalculator.area(x, y);

        assertEquals(actual, expected);

    }

}