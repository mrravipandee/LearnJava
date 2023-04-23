package BasicOfJava;

public class JavaArray {
    public static void main(String[] args) {
//        Java Arrays => Arrays are used to store multiple values in a single variable,
//        instead of declaring separate variables for each value.

//        To declare an array, define the variable type with square brackets:
//        String[] cars;

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

//        Change an Array Element
        cars[0] = "Opel";
        System.out.println(cars[0]);

        System.out.println(cars.length); //count array length.

        int[] myNum = {10, 20, 30, 40};
    }
}
