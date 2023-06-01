package AssignmentOne;

import java.util.Scanner;

public class bestfriends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[20];

        System.out.println("\u001B[31mName enter only 5.");

        System.out.println("\u001B[35mEnter names's:");

        while (true) {

            String nameIn = sc.nextLine();

            if (nameIn.equals("bas")) {
                break;
            }

            for (int i = 0; i <= 5; i++) {
                names[i] = nameIn;
            }
        }

        for (int i = 0; i <= 5; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }

}
