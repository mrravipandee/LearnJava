package AssignmentOne;

import java.util.Scanner;

public class sumX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while(true){

            String input = sc.nextLine();
            if(input.equals("x")){
                break;
            }

            int number = Integer.parseInt(input);
            sum+=number;
        }

        System.out.println("Sum of numbers: "+ sum);
    }
}
