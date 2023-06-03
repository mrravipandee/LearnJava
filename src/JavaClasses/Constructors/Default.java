package JavaClasses.Constructors;

public class Default {

    int no;
    String name;

//    Default() {
//        no = 0;
//        name = null;
//    }

    void show() {
        System.out.println(no+" "+name);
    }

    public static void main(String[] args) {

        Default def = new Default();
        def.show();

    }
}
