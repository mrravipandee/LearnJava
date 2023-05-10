package AssignmentOne;

import java.util.Scanner;

public class PalindromeString {
    static void checkPalindrome(String str) {
        boolean res = true;
        int length = str.length();
        for(int i=0; i<= length/2; i++) {
            if(str.charAt(i) != str.charAt(length-i-1)) {
                res = false;
                break;
            }
        }

        System.out.println(str + " is palindrome = "+res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Statement: ");
        String str = sc.nextLine();
        //function call
        checkPalindrome(str);

    }
}
