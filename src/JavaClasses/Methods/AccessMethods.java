package JavaClasses.Methods;

public class AccessMethods extends MainMethod {

    static void hello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        MainMethod mainMethod = new MainMethod();

        mySelf();

        hello();


    }

}
