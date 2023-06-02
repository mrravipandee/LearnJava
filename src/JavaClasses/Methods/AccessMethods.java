package JavaClasses.Methods;

public class AccessMethods {

    static void hello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        MainMethod mainMethod = new MainMethod();

        mainMethod.mySelf();

        hello();

    }

}
