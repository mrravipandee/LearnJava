package AssignmentOne;

import java.util.Scanner;

public class PalindromeStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch;
        String revStr = "";

        System.out.print("Enter a String: ");
        String str = sc.nextLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            revStr = ch + revStr;

        }

        if (revStr.equals(str)) {
            System.out.println("String is Palindrome.");
        } else {
            System.out.println("String is not Palindrome.");
        }

        sc.close();
    }

}
