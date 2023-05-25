package AssignmentOne;

import java.util.Scanner;

public class swap2num3variable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, temp;
        num1 = 10;
        num2 = num1-5;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1);
        System.out.println(num2);
    }
}
