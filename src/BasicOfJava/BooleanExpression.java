package BasicOfJava;

public class BooleanExpression {

    public static void main(String[] args) {
//        A Boolean expression returns a boolean value: true or false. This is useful to build logic, and find answers.

        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9

        System.out.println(x == y); // check both value are equal or not.

//      Let's think of a "real life example" where we need to find out if a person is old enough to vote.
        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

    }
}
