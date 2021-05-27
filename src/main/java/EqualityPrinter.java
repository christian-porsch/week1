public class EqualityPrinter {

    public static String printEqual(int value1, int value2, int value3){

        if(value1 < 0 || value2 < 0 || value3 < 0){
            return  "Invalid Value";
        }

        else if((value1 == value2) && (value1 == value3) && (value2 == value3)){
            return  "All numbers are equal";
        }

        else if((value1 != value2) && (value1 != value3) && (value2 != value3)){
            return "All numbers are different";
        }
        return "Neither all are equal or different";
    }

}
