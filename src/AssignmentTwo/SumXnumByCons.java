package AssignmentTwo;

import java.util.Scanner;

public class SumXnumByCons {

    public SumXnumByCons() {

        //Object of scanner.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");

        int sum = 0;

        while (true) {

            String str = sc.nextLine().toLowerCase();
            if (str.equals("x")) {
                break;
            }

            int num = Integer.parseInt(str);
            sum += num;
        }

        System.out.println("Sum is: "+sum);

    }

    public static void main(String[] args) {

        SumXnumByCons sumXnumByCons = new SumXnumByCons();

    }
}
