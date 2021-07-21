public class LastDigitChecker {

    public static boolean hasSameLastDigit(int value1, int value2, int value3) {

        if ((value1 >= 10 && value1 <= 1000) && (value2 >= 10 && value2 <= 1000) && (value3 >= 10 && value3 <= 1000)) {

            return ((value1 % 10 == value2 % 10) || (value1 % 10 == value3 % 10) || (value2 % 10 == value3 % 10));
        }
        return false;
    }

    public static boolean isValid(int number) {

        return ((number >= 10) && (number <= 1000));
    }
}
