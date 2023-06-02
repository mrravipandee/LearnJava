package JavaClasses.Methods;

public class MainMethod {

    static void mySelf() {
        String name = "Ravi Bhai";
        System.out.println("My name is "+name);
    }

    public void age() {
        System.out.println("I am 19");
    }

    public static void main(String[] args) {
        mySelf();
//      age();  you cant public method call without creating objects.
        MainMethod mainMethod = new MainMethod();
        mainMethod.age();

        mainMethod.mySelf(); // they can access but throw warning.
    }
}
