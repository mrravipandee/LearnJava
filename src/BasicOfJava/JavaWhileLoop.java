package BasicOfJava;

public class JavaWhileLoop {
    public static void main(String[] args) {
//        Java While Loop => The while loop loops through a block of code as long as a specified condition is true:

//        while (condition) {
//            // code block to be executed
//        }

        int i = 0;
        while (i < 5) {
            System.out.println("\nWhile output: "+i);
            i++;
        }

//        The Do/While Loop => The do/while loop is a variant of the while loop. This loop will execute the code block
//        once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.

        do {
            System.out.println("\nDo-while output: "+i);
            i++;
        }
        while (i < 5);


    }
}
