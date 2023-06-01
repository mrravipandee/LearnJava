package BasicOfJava;

import java.util.Scanner;

public class arrayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[20];
        String[] names = new String[20];

//        for (int i = 0; i <= 5; i++) {
//            numbers[i] = sc.nextInt();
//        }
//        for (int i = 0; i <= 5; i++) {
//            System.out.println(numbers[i]);
//        }

        for (int i = 0; i <= 5; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i <= 5; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }

}
