package AssignmentOne;
import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int factorial = fact(num);

        System.out.println("Factorial number of: "+factorial);

    }

    static int fact(int num) {
        int output;
        if(num==1){
            return 1;
        }
        output = fact(num-1)* num;
        return output;
    }
}
