package InnerClasses;

public class NestedClass {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

        System.out.println(outerClass.x + innerClass.y);
    }

}

class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 20;
    }
}

