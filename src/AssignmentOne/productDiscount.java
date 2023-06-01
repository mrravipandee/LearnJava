package AssignmentOne;

import java.util.Scanner;

public class productDiscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select the option :\n1. Discount Find\n2. Discount percentages.");
        int choose = sc.nextInt();

        switch (choose) {

            case 1:
                System.out.println("Enter product MRP: ");
                int c1Mrp = sc.nextInt();
                System.out.println("Discount percent: ");
                int c1Discount = sc.nextInt();

                int c1DP = (c1Discount * c1Mrp) / 100;

                System.out.println("Your final product amount is Rs."+(c1Mrp-c1DP));

                break;

            case 2:
                System.out.println("Enter product MRP: ");
                int c2Mrp = sc.nextInt();
                System.out.println("Discount price: ");
                int c2Discount = sc.nextInt();

//                int c1Mrp = (c1DP * 100) / (100 - c1Discount);

//                System.out.println("Your final product amount is Rs."+(c1Mrp-c1DP));

                break;


        }

        sc.close();
    }
}
