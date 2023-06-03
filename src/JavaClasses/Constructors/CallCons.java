package JavaClasses.Constructors;

public class CallCons {

    public CallCons() {
        System.out.println("Hello");
    }

    static void MethodCall() {
        System.out.println("Class Method");
    }

    public static void main(String[] args) {
//      Constructor is automatically called when class object created. never return any type.
        CallCons callCons = new CallCons();

        MethodCall();
    }
}
