package JavaClasses.Constructors;

public class MyCons {

    String name;
    int id;

    public MyCons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {

        MyCons myCons = new MyCons("Ravi Pandey", 23);

        System.out.println("Name :"+myCons.name+" Id :"+myCons.id);

    }
}
