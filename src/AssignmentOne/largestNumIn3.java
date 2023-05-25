package AssignmentOne;

import java.util.Scanner;

public class largestNumIn3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Largest number is: "+num1);
            } else {
                System.out.println("Largest number is: "+num3);
            }
        } else if (num2 > num3) {
            System.out.println("Largest number is: "+num2);
        } else {
            System.out.println("Largest number is: "+num3);
        }

    }
}
