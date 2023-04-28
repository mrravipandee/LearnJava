package AssignmentOne;
import java.util.Scanner;

public class CalculatorProgram {
    static int result;

    public static void main(String[] args) {
        //Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st num: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter 2nd num: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose operator: +, -, /, *");
        char operator = scanner.next().charAt(0);

        switch (operator) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("Please select above operators only.");
        }

        System.out.printf("%d %c %d = %d",num1, operator, num2, result);
    }
}
