package AssignmentTwo;

import java.util.Scanner;

public class SumofN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while(true){
            // when you need exit to press "x"
            System.out.print("Enter the number: ");
            String input = sc.nextLine();

            if (input.equals("x")) {
                break;
            }

            int num = Integer.parseInt(input);
            sum += num;
        }

        System.out.println("Ans is: "+sum);

        sc.close();
    }
}
