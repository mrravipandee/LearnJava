package BasicOfJava;

public class Operators {
    public static void main(String[] args) {

//        Arithmetic Operators => Arithmetic operators are used to perform common mathematical operations.
        int a = 10;
        int b = 20;
        int c = a + b; //in the line + symbol is arithmetic operator. or equal is assignment.

//        Java Assignment Operators
//        int x = 10;

//        Java Comparison Operators
        System.out.println(a > b);
        System.out.println(a < b);

//        Java Logical Operators
        int x = 5;
        System.out.println(x > 3 && x < 10); // returns true because 5 is greater than 3 AND 5 is less than 10

        System.out.println(x > 3 || x < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)

        System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
    }
}
