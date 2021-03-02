package OOPConceptPart1;

public class Car {

    // A Class is like an object constructor, or a "blueprint" for creating objects.
    // everything in java is associated with classes and objects , along with its attributes and methods
    // Real life example ; a car is an object , the car has attributes such as weight and color, also it has methods such as drive and brake


    // Class variables (Global variables)
    int model;
    int wheel;

    public static void main(String[] args) {

        Car a = new Car(); // New Car (); -- is the object of Car class.    / a,b,c; object reference variable name / the keyword "new" is used to create an object
        Car b = new Car();
        Car c = new Car();

        a.model=2020;
        a.wheel=4;

        b.model=2019;
        b.wheel=4;

        c.model=2018;
        c.wheel=4;

        System.out.println(a.model);
        System.out.println(a.wheel);

        System.out.println(b.model);
        System.out.println(b.wheel);

        System.out.println(c.model);
        System.out.println(c.wheel);

    }
}
