package AssignmentOne;

import java.util.Scanner;

public class evenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int ans = evenOrOdd(num);
        System.out.println(ans);

    }

    static public int evenOrOdd(int num) {

        if (num % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }

        return num;
    }
}
