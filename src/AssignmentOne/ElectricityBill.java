package AssignmentOne;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the unit: ");
        int billUnit = sc.nextInt();
        double payBill = 0;

        if (billUnit < 100) {
            payBill = billUnit * 8;

        } else if (billUnit < 300) {
            payBill = 100 * 7 + (billUnit - 100) * 2;

        } else if ( billUnit > 300) {
            payBill = 00 * 6.5 + 200 * 2 + (billUnit - 300) * 3;

        }

        System.out.println("The electricity bill for " +billUnit+ " is : " + payBill);

        sc.close();
    }
}
