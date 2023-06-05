package AssignmentTwo;

import java.util.Scanner;

public interface FindLargeSmallNum3 {

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

                System.out.print("Enter 3rd number: ");
                int lar3no = sc.nextInt();

                int ansLarg = FindLargestNum(lar1no, lar2no, lar3no);

                System.out.println("Largest number is: "+ansLarg);

                break;

            case 2:

                System.out.print("Enter 1st number: ");
                int small1no = sc.nextInt();

                System.out.print("Enter 2nd number: ");
                int small2no = sc.nextInt();

                System.out.print("Enter 3rd number: ");
                int small3no = sc.nextInt();

                int ansSmall = FindSmallNum3(small1no, small2no, small3no);

                System.out.println("Smallest number is: "+ansSmall);

                break;

            default: System.out.println("Please select given option only.");

        }

        sc.close();

    }

    public static int FindLargestNum(int n1, int n2, int n3) {

        int max = n1;

        if (n2 > max) {
            max = n2;

        }
        if (n3 > max) {
            max = n3;

        }

        return max;
    }

    public static int FindSmallNum3(int n1, int n2, int n3) {

         int small = n1;

         if (n2 < small) {
             small = n2;

         }
         if (n3 < small) {
             small = n3;

         }

         return small;
    }
}
