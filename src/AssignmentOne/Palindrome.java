package AssignmentOne;

public class Palindrome {

    public Palindrome(int num) {
        int rem, sum = 0, temp;

        temp = num;

        while(num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num /10;
        }

        boolean ans;
        if (temp == sum) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome(151);
    }
}
