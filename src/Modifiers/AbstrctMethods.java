package Modifiers;

public class AbstrctMethods {

    abstract class Learn {
        public String College = "Sandip Polytechnic";
        public String Course = "Diploma in IT";
        public abstract void Self();
    }

    public class Students extends Learn {

        public int age = 19;
        public String name = "Ravi";

        public void Self() {
            System.out.println("Know the self.");
        }

    }

    public static void main(String[] args) {

//        Students stud = new Students();


    }

}
