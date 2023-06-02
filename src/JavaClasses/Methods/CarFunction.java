package JavaClasses.Methods;

//import static JavaClasses.Methods.Car.Model;

public class CarFunction extends Car {

    public static void main(String[] args) {
        Car car = new Car();

        // public method access with Object of class.
        car.Color();
        car.Speed();
        car.Price();

        // static method access with -> method call
        // other call static methods call 2 ways.
        //  i> extends class, ii> import they methods.

        Model(); // call from extends class
        Year();  // import static JavaClasses.Methods.Car.Year;


    }
}
