public class DigitSum {

    public static int sumDigit(int number){

        int result = 0;

        if(number <= 10){
            return -1;
        }

        while(number != 0){

            int lastDigit = number % 10;

            result += lastDigit;

            number = number / 10;

        }

        return result;

    }

}
