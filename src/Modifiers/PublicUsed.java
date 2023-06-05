package Modifiers;

public class PublicUsed {

//    public => The code is accessible for all classes.

    public int Sum() {
       int a = 10, b = 20;
       int c = a + b;
       return c;
    }

    public static void main(String[] args) {

        PublicUsed publicUsed = new PublicUsed();

        System.out.println(publicUsed.Sum());

    }
}
