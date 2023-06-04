package JavaClasses.Constructors;

public class Private {

    int i;

    private Private() {
        i = 5;
        System.out.println("Hello Ravi");
    }

    public static void main(String[] args) {

        Private obj = new Private();
        System.out.println("Value of :"+obj.i);

    }
}
