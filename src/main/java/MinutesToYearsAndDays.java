public class MinutesToYearsAndDays {

    public static String printYearsAndDays(long minutes){

        if (minutes < 0){
            System.out.println("Invalid Value");
        }

        long hours = minutes / 60;

        long days = hours / 24;

        long years = days / 365;

        long remainingDays = days % 365;

        return  minutes + " min = " + years + " y and " + remainingDays + " d";

    }

}
