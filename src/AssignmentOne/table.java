package AssignmentOne;

import java.util.Scanner;

public class table {

    static void Table(int num) {

        for (int i = 1; i<=10; i++) {
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Table(3);

    }
}
