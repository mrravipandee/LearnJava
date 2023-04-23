package BasicOfJava;

public class StringJava {
    public static void main(String[] args) {

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length()); // in this line .length() are count our text.

        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());

        System.out.println(txt.indexOf("ABC"));

        System.out.println(txt.replace("ABC", "XYZ"));

    }
}
