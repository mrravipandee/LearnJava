package AssignmentOne;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch;
        String nStr = "";

        System.out.print("Enter your String: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nStr = ch + nStr;
        }

        System.out.println("Revered word: "+nStr);

        sc.close();
    }
}
