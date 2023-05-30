package AssignmentOne;

import java.util.Scanner;

public class countFeetInch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select to:\n1. Feet \t 2. Inch");
        int option = sc.nextInt();

        switch (option) {

            case 1:
                System.out.println("* * * * * Feet Count * * * * *");
                System.out.print("Enter Feet: ");
                int fFeet = sc.nextInt();
                System.out.print("Enter Inch: ");
                int fInch = sc.nextInt();

                for (int i=1; i<=fInch; i++) {
                    if (fInch >= 12) {
                        fFeet = fFeet + 1;
                        fInch = fInch - 12;
                    }
                }

                System.out.println("Feet is: "+fFeet);
                System.out.println("Inch is: "+fInch);

                break;

            case 2:
                System.out.println("* * * * * Inch Count * * * * *");
                System.out.print("Enter Inch: ");
                int iInch = sc.nextInt();
                int iFeet = 0;

                for (int i = 1; i <= iInch; i++) {
                    if (iInch >= 12) {
                        iInch = iInch - 12;
                        iFeet = iFeet + 1;
                    }
                }

                System.out.println("Feet is: "+iFeet);
                System.out.println("Inch is: "+iInch);

                break;

        }

        sc.close();
    }
}
