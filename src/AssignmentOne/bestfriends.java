package AssignmentOne;

import java.util.Scanner;

public class bestfriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];

        System.out.println("\u001B[31mName enter only 5.");

        System.out.println("\u001B[35mEnter names:");

        int count = 0;
        while (count < 5) {
            String nameIn = sc.nextLine();

            if (nameIn.equals("bas")) {
                break;
            }

            names[count] = nameIn;
            count++;
        }

        System.out.println("\u001B[35mEntered names:");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }
}



