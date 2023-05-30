package AssignmentOne;

import java.util.Scanner;

public class simpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        float principle = sc.nextFloat();

        System.out.print("Rate of interest: ");
        float interest = sc.nextFloat();

        System.out.print("Time: ");
        float time = sc.nextFloat();

        float SI = (principle * interest * time) / 100;

        System.out.println("Simple interest is: "+SI);

        sc.close();
    }
}
