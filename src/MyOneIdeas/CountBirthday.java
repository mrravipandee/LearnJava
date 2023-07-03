package MyOneIdeas;

import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;

public class CountBirthday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the current year
        int thisYear = LocalDate.now().getYear();

        System.out.println("Enter your Birth Date.");

        System.out.print("DD: ");
        int dd = sc.nextInt();

        System.out.print("MM: ");
        int mm = sc.nextInt();

        System.out.print("YYYY: ");
        int yyyy = sc.nextInt();

        // Validation for a valid date
        boolean isValid = true;

        if (dd <= 0 || dd > 31) {
            System.out.println("Invalid day.");
            isValid = false;
        }

        if (mm <= 0 || mm > 12) {
            System.out.println("Invalid month.");
            isValid = false;
        }

        if (yyyy > thisYear) {
            System.out.println("Invalid year.");
            isValid = false;
        }

        if (isValid) {
            // Add your logic to count the age based on the provided birth here.
            LocalDate currentDate = LocalDate.now();

            // Create a LocalDate object with the provided birth
            LocalDate birthDate = LocalDate.of(yyyy, mm, dd);

            // Calculate the age
            Period age = Period.between(birthDate, currentDate);

            // Display the age
            System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");

        } else {
            System.out.println("Error: Please enter a valid date.");
        }

        sc.close();
    }
}
