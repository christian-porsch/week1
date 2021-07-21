public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int num = number;
        int result = 0;

        while (num != 0) {

            int lastDigit = num % 10;

            if (lastDigit % 2 == 0) {
                result += lastDigit;
            }

            num /= 10;
        }
        return result;
    }
}
