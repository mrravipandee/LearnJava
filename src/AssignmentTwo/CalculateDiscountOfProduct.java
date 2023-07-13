package AssignmentTwo;

import java.util.Scanner;

public class CalculateDiscountOfProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the MRP Price: ");
        int mrp = sc.nextInt();

        System.out.print("Enter the percentage of discount: ");
        int dis = sc.nextInt();
        float disPer = 0;
        if (dis < 100) {
            disPer = (float) (mrp * dis) / 100;
            System.out.println(disPer);
        }

        float disPrice = (float) (mrp * 0. +(disPer));
        float pay = (float) (mrp - disPrice);

        System.out.println("Discount amount is: "+disPrice);
        System.out.println("Pay: "+pay);

    }
}
