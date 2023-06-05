package Encapsulation;

public class Person {

    private String name = "Ravi"; // private = restricted access

    private int rollNo;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int Roll) {
        this.rollNo = Roll;
    }

}
