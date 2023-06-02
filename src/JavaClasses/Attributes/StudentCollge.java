package JavaClasses.Attributes;

public class StudentCollge {

    String nameStud1 = "Ravi";
    String nameStud2 = "Veer";
    String nameStud3 = "Abdul";
    String nameStud4 = "Prajwal";

    public static void main(String[] args) {

//      create an object
        collgeStudent clg = new collgeStudent();
        StudentCollge stud = new StudentCollge();

        System.out.println(clg.nameClg1+" Student is "+stud.nameStud1);
        System.out.println(clg.nameClg2+" Student is "+stud.nameStud2);
        System.out.println(clg.nameClg3+" Student is "+stud.nameStud3);
        System.out.println(clg.nameClg4+" Student is "+stud.nameStud4);

    }
}
