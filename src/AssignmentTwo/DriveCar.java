package AssignmentTwo;

public class DriveCar {

    public static void main(String[] args) {

        CarDetails carDetails = new CarDetails();

        carDetails.setCarName("That 4 By 4");
        carDetails.setCarColor("Black");
        System.out.println(carDetails.getCarName());
        System.out.println(carDetails.getCarColor());

        carDetails.setCarName("Honda City");
        carDetails.setCarColor("White");
        System.out.println(carDetails.getCarName());
        System.out.println(carDetails.getCarColor());




    }

}
