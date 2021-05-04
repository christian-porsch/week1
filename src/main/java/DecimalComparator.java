public class DecimalComparator {


    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue){

        firstValue = (int) (firstValue * 1000);
        secondValue = (int) (secondValue * 1000);

        return firstValue == secondValue;


    }

}
