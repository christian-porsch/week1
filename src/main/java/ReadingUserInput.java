import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter <= 10) {

            System.out.println("Enter number #" + counter + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;

            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();
        }

        System.out.println("The sum of your numbers is: " + sum);

        scanner.close();

    }
}
