package AssignmentTwo;

import java.util.Scanner;

public class EvenOdd {

    public EvenOdd(int n) {

        if (n % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a numbers: ");
        int num = sc.nextInt();

        EvenOdd evenOdd = new EvenOdd(num);

        sc.close();
    }
}
