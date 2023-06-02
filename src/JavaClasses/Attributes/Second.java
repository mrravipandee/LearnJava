package JavaClasses.Attributes;

import JavaClasses.Attributes.Objects;

public class Second {

    public static void main(String[] args) {
//      use another class attributes in the class.
        Objects obj = new Objects();
        Objects obj2 = new Objects();
        Objects obj3 = new Objects();

        System.out.println(obj.x);

//      modify attributes
        obj2.x = 50;
        System.out.println(obj.x);

//      modify final value
//      obj.rollNo = 20; -> throw the error
        System.out.println(obj.rollNo);

        System.out.println(obj.x);
        System.out.println(obj2.x);
    }
}
