package BasicOfJava;

public class castingData {

    public static void main(String[] args) {
//        Widening Casting (automatically) - converting a smaller type to a larger type size.
//        byte -> short -> char -> int -> long -> float -> double
        int noInt = 20;
        double noDouble = noInt;

        System.out.println(noInt); // 20
        System.out.println(noDouble); // 20.0


//        Narrowing Casting (manually) - converting a larger type to a smaller size type.
//        double -> float -> long -> int -> char -> short -> byte

        int intNo = (int) noDouble; // this line convert double value into int form.
        System.out.println(intNo);

    }
}
