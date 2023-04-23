package BasicOfJava;

public class JavaArraysLoop {
    public static void main(String[] args) {
//        Loop Through an Array
//        You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.

//        The following example outputs all elements in the cars array:
        String[] cars = {"Volvo", "Tata", "Ford", "Audi"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

//        There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:
        for (String i : cars) {
            System.out.println(i);
        }


    }
}
