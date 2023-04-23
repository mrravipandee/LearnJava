package BasicOfJava;

public class IfCondition {

    public static void main(String[] args) {

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

//        We can also test variables:
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.printf("%d is greater than %d",x ,y); //we can use also printf() function they come from c lang.
        }

        int time = 20;
        if (time < 22) {
            System.out.println("\nGood day.");
        } else {
            System.out.println("\nGood evening.");
        }

        int myTime = 19;
        if (myTime < 10) {
            System.out.println("Good morning.");
        } else if (myTime < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}
