package AssignmentTwo;

import java.util.Scanner;

public class FindLargeSmallNum2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Largest number\n2. Smallest number.");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:

                System.out.print("Enter 1st number: ");
                int lar1no = sc.nextInt();

                System.out.print("Enter 2nd number: ");
                int lar2no = sc.nextInt();

                int ansLarg = FindLargestNum(lar1no, lar2no);

                System.out.println("Largest number is: "+ansLarg);

                break;

            case 2:

                System.out.print("Enter 1st number: ");
                int small1no = sc.nextInt();

                System.out.print("Enter 2nd number: ");
                int small2no = sc.nextInt();

                int ansSmall = FindSmallNum(small1no, small2no);

                System.out.println("Smallest number is: "+ansSmall);

                break;

            default: System.out.println("Please select given option only.");

        }

        sc.close();
    }

    public static int FindLargestNum(int lar1no, int lar2no) {

        int max = lar1no;

        if (lar2no > max) {
            max = lar2no;
        } else {
            max = lar1no;
        }

        return max;
    }

    public static int FindSmallNum(int small1no, int small2no) {

        int small = small1no;

        if (small2no < small) {
            small = small2no;
        } else {
            small = small1no;
        }

        return small;

    }

}
