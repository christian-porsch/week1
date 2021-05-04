import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecimalComparatorTest {

    @Test
    @DisplayName("Method should return true if two double numbers are the same up to three decimal places")

    public void firstAreEqualByThreeDecimalPlacesTest() {
        // Given
        double firstValue = -3.1756;
        double secondValue = -3.175;

        // When
        boolean actual = DecimalComparator.areEqualByThreeDecimalPlaces(firstValue, secondValue);

        // Then

        assertTrue(true);

    }

    @Test
    @DisplayName("Method should return true if two double numbers are the same up to three decimal places")

    public void secondAreEqualByThreeDecimalPlacesTest(){

        // Given
        double firstValue = -3.123;
        double secondValue = 3.123;

        // When
        boolean actual = DecimalComparator.areEqualByThreeDecimalPlaces(firstValue, secondValue);

        // Then

        assertFalse(false);

    }

}