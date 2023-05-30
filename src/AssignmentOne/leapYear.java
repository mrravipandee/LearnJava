package AssignmentOne;

import java.util.Scanner;

public class leapYear {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        String countYleng = Integer.toString(year);
        if (countYleng.length() == 4) {

            if (year % 2000 == 0) {
                System.out.println(year+" is leap year");
            } else if (year % 400 == 0) {
                System.out.println(year+" is leap year");
            } else if (year % 4 == 0) {
                System.out.println(year+" is leap year");
            } else {
                System.out.println(year+" is not leap year");
            }

        } else {
            System.out.println("Please select 4 digit.");
        }

        sc.close();
    }
}
