package JavaMethods;

public class ParametersAndArguments {

    static void fName(String fName) {
        System.out.println(fName + " Pandey");
    }

    static void studentId(String name, int rollNo) {
        System.out.println("I am "+name+" my roll no. is: "+rollNo);
    }

    static int squareNo(int x) {
        int y = x * x;
        System.out.println(y);
        return y;
    }

    static int addNum(int a, int b) {
        return a + b;
    }

    static int addNum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        fName("Ravi");
        fName("Suraj");
        fName("Ramesh");

        studentId("Ravi Pandey", 23);

        System.out.println(squareNo(5));

        int ans1 = addNum(10, 12);
        System.out.println(ans1);
//      method overloading
        int ans2 = addNum(10, 20, 11);
        System.out.println(ans2);
    }


}
