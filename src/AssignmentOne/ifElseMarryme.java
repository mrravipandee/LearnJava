package AssignmentOne;

import java.util.Scanner;

public class ifElseMarryme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you have GF ?");
        System.out.print("1. Yes / 2. No : ");
        String ans = sc.nextLine();

        if(ans == "1") {
            System.out.println("Great \nHow much you love ? him...\n");
            System.out.println("Write it down below: \nHere: ");
            String abouthim = sc.nextLine();

            if (abouthim.length() >= 0) {
                System.out.println("Tell me anything special: ");
                String specialThing = sc.nextLine();
            } else {
                System.out.println("Thank you!!");
            }

        } else {
            System.out.println("Amazing your partner");
        }
    }
}
