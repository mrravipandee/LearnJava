package JavaMethods;

public class scopeOfJava {

//    In Java, variables are only accessible inside the region they are created. This is called scope.
//    Method Scope
//    Variables declared directly inside a method are available anywhere
//      in the method following the line of code in which they were declared:

    public static void main(String[] args) {
//        code here CANNOT use x

        int x = 100;

//        code here can use x
        System.out.println(x);
        {
            // this is block

            System.out.println(x); // here can also used a x because x
        }
    }
}
