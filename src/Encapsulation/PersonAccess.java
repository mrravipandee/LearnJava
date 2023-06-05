package Encapsulation;

public class PersonAccess {

    public static void main(String[] args) {

        Person person = new Person();


//        person.name = "Ravi";
//        System.out.println(person.name); they throw error for name is private.


//        person.setName("Ravi");

        System.out.println(person.getName());

        person.setRollNo(23);

        System.out.println(person.getRollNo());

    }

}
