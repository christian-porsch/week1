public class NumberInWord {

    public static void main(String[] args) {

    }

    public static String printNumberInWord(int number) {


        switch (number) {
            case 0:
                return "ZERO";

            case 1:
                return "ONE";

            case 2:
                return "TWO";

            case 3:
                return "THREE";

            case 4:
                return "FOUR";

            case 5:
                return "FIVE";

        default:
        return  "Out of range";
        }
    }


}
