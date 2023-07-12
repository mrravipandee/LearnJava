package AssignmentTwo;

import java.util.Scanner;

public class CalculateAverageOfNNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0, sum = 0;
        double avg = 0;

        while(true) {
            System.out.print("Enter the number: ");
            String input = sc.nextLine();
            // to count how many number are enter.
            count = count + 1;

            if (input.equals("x")) {
                break;
            }

            int num = Integer.parseInt(input);
            sum += num;
            avg = (double) sum / count;
        }

        System.out.println("Average number is: "+avg);

    }
}
