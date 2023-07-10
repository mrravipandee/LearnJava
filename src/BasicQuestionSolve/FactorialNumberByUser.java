package BasicQuestionSolve;

import java.util.Scanner;

public class FactorialNumberByUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        I use to find factorial numbers in method call.
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int fact = Factorial(num);

        System.out.println("Number of "+num+" factorial is "+fact);

        sc.close();
    }
//  create a method to find a factorial
    static int Factorial(int num) {

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }
}
