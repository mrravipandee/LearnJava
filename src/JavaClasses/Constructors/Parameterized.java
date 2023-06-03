package JavaClasses.Constructors;

public class Parameterized {

    int a, b;
    public Parameterized(int x, int y) {
        a = x;
        b = y;
    }

    public Parameterized(int x) {
        a = x;
    }

    void show() {
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {

        Parameterized parameterized = new Parameterized(100, 200);
        parameterized.show();

    }
}
