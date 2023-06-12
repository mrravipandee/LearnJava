package JavaClasses.Attributes;

public class collgeStudent {

    String nameClg1 = "SITRC";
    String nameClg2 = "SP";
    String nameClg3 = "SU";
    String nameClg4 = "SIPU";

    public static void main(String[] args) {
//      Create an objects
        StudentCollge stud = new StudentCollge();
        collgeStudent clg = new collgeStudent();

        System.out.println(clg.nameClg1+" Student is "+stud.nameStud1);
        System.out.println(clg.nameClg2+" Student is "+stud.nameStud2);
        System.out.println(clg.nameClg3+" Student is "+stud.nameStud3);
        System.out.println(clg.nameClg4+" Student is "+stud.nameStud4);
    }

    public static void name() {
        System.out.println("Hello");
    }

}
