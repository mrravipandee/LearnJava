package JavaClasses.Constructors;

class CopyCon {

    String name;
    int roll;

    CopyCon(String ravi, int _23) {
        this.name = ravi;
        this.roll = _23;
    }

    CopyCon(CopyCon obj) {
        this.name = obj.name;
        this.roll = obj.roll;
    }

}

public class Copy {

    public static void main(String[] args) {

        CopyCon copyCon = new CopyCon("Ravi", 23);

        CopyCon copyCon1 = new CopyCon(copyCon);

        System.out.println("Name is: "+copyCon1.name+", roll no. is: "+copyCon1.roll);


    }

}


