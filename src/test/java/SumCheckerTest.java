import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class SumCheckerTest {

    @ParameterizedTest
    @CsvSource({"1, 1, 1, false","1, 1, 2, true","1, -1, 0, true"})

    public void hasEqualSumTest(int a, int b, int c, boolean expected){

        boolean actual = SumChecker.hasEqualSum(a, b, c);

        assertEquals (expected, actual);

    }


}
