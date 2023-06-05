package Modifiers;

public class Methods_test {

    final static int a = 10; //they value cant change within a program. Static -> Attributes and methods belongs to the class, rather than an object.
    final int b = 20;

    public static void main(String[] args) {

//        a = 20; they will throw error. when you can change they value.

        Methods_test methods_test = new Methods_test();

        System.out.println(methods_test.b); // without static methods or variable you can call in a static methods, but make a object of class.

        System.out.println(a);
    }

}
