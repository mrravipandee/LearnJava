package BasicOfJava;

public class TernaryOperator {
    public static void main(String[] args) {

//        There is also a shorthand if else, which is known as the ternary operator because it consists of three operands.
//        It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

//        Syntax:
//        variable = (condition) ? expressionTrue :  expressionFalse;

//        with if else
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

//        in ternary operator
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
