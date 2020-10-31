import java.util.Scanner;

public class Colors {
    public static String getColor() {
        String letter = Colors.getValue();
        String result;
        switch (letter) {
            case "W":
                result = "White";
                break;
            case "B":
                result = "Black";
                break;
            case "R":
                result = "Red";
                break;
            case "G":
                result = "Green";
                break;
            default:
                return "unknown";
        }
        return result;
    }

    public static String getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first letter of color:");
        String letter = scanner.next();
        return letter;

    }

    public static void main(String[] args) {
        Colors color = new Colors();
        String result = Colors.getColor();
        System.out.println("Result: " + result);
    }
}




