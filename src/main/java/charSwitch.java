public class charSwitch {

    public static void main(String[] args) {

    }

    public static char switchThroughCharTest(char character) {
        switch (character) {
            case 1:
                System.out.println("Actual Character was A");
                break;
            case 2:
                System.out.println("Actual Character was B");
                break;
            case 3:
                System.out.println("Actual Character was C");
                break;
            case 4:
                System.out.println("Actual Character was D");
                break;
            case 5:
                System.out.println("Actual Character was E");
                break;
            default:
                System.out.println("No character found");
                break;
        }
        return character;
    }

}
