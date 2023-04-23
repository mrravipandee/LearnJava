package BasicOfJava;

public class MathInJava {
    public static void main(String[] args) {

        System.out.println(Math.max(5, 6)); // Math.max(a, b) => find highest number paramiters pass only 2.

        System.out.println(Math.max(6, Math.min(4, 9)));

        System.out.println(Math.sqrt(64));

        System.out.println(Math.abs(-8.9)); //The Math.abs(x) method returns the absolute (positive) value of x.

        System.out.println(Math.random()); //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive).

        int randomNum = (int)(Math.random() * 1000);  // 0 to 1000 for print 3 digits if you need 2 digits then remove 1 zero.
        System.out.println(randomNum);




    }
}
