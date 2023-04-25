package JavaMethods;

public class methodOverloading {

//    With method overloading, multiple methods can have the same name with different parameters:
//    eg.
//    int myMethod(int x)
//    float myMethod(float x)
//    double myMethod(double x, double y)


//    both method are simple 'addNumInt() & addNumDouble()'
    static int addNumInt(int a, int b) {
        return a + b;
    }

    static double addNumDouble(int a, int b) {
        return a + b;
    }

//    Method overloading => Instead of defining two methods that should do the same thing, it is better to overload one.
    static int numAdd(int a, int b){
        return a + b;
    }

    static double numAdd(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

//      simple method called
        int intAns = addNumInt(10, 20);
        System.out.println(intAns);
        double doubleAns = addNumDouble(10, 20);
        System.out.println(doubleAns);

//      overloading method called.
        int addAnsInt = numAdd(10, 20);
        System.out.println(addAnsInt);
        double addAnsDouble = numAdd(20.0, 2);
        System.out.println(addAnsDouble);
    }
}
