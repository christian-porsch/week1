public class charSwitch {

    public static void main(String[] args) {

    }

    public static char switchThroughCharTest(char character) {
        switch (character) {
            case 'A':
                System.out.println("Actual Character was A");
                break;
            case 'B':
                System.out.println("Actual Character was B");
                break;
            case 'C':
                System.out.println("Actual Character was C");
                break;
            case 'D':
                System.out.println("Actual Character was D");
                break;
            case 'E':
                System.out.println("Actual Character was E");
                break;
            default:
                System.out.println("No character found");
                break;
        }
        return character;
    }

}
