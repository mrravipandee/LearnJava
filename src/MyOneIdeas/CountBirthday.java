package MyOneIdeas;

import java.util.Scanner;
import java.time.*;

public class CountBirthday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for current year select live
        Year nowYear = Year.now();
        String liveYear = nowYear.toString();
        int thisYear = Integer.parseInt(liveYear);

        System.out.println("Enter your Birth Date.");

        System.out.print("DD: ");
        int dd = sc.nextInt();

        System.out.print("MM: ");
        int mm = sc.nextInt();

        System.out.print("YYYY: ");
        int yyyy = sc.nextInt();

        if(dd <= 31) {
            if(mm <= 12) {
                if(yyyy <= thisYear) {
                    System.out.println("Data Enter");
                } else {
                    System.out.println("Invalid year");
                }
            } else {
                System.out.println("Invalid month");
            }
        } else {
            System.out.println("Invalid date");
        }

        sc.close();
    }

}
