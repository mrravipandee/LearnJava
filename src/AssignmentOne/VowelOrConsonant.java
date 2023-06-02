package AssignmentOne;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'A') {
            System.out.println("Character is Vowel.");

        } else if (ch == 'e' || ch == 'E') {
            System.out.println("Character is Vowel.");
            
        } else if (ch == 'i' || ch == 'I') {
            System.out.println("Character is Vowel.");
            
        } else if (ch == 'o' || ch == 'O') {
            System.out.println("Character is Vowel.");
            
        } else if (ch == 'u' || ch == 'U') {
            System.out.println("Character is Vowel.");

        } else {
            System.out.println("Character is Consonant.");
        }

        sc.close();

    }

}
