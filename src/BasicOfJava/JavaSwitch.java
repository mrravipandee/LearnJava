package BasicOfJava;

public class JavaSwitch {
    public static void main(String[] args) {
//        Java Switch Statements
//        Instead of writing many if..else statements, you can use the switch statement.
//        The switch statement selects one of many code blocks to be executed:

//        Syntax :
//        switch(expression) {
//            case x:
//                // code block
//                break;
//            case y:
//                // code block
//                break;
//            default:
//                // code block
//        }

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

//        The break Keyword => This will stop the execution of more code and case testing inside the block.
//        break;

//        The default Keyword => The default keyword specifies some code to run if there is no case match:
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

    }
}
