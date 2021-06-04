public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int reverse = 0;

        // if we use number directly it will be saved as 0 in the end, so we need a temp variable for the loop

        int num = number;

        while (num != 0) {

            /*reverse = reverse * 10 + num % 10;*/


            reverse = reverse * 10;

            int lastDigit = num % 10;

            reverse += lastDigit;

            num = num / 10;

        }

        return reverse == number;

    }
}
