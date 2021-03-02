package JavaBasics;


public class ConstructorConcept {

    public ConstructorConcept(){ // if this constructor will be commented down , we will not get an error from its object , as long as there are no other constructors and their objects
        System.out.println("This is a Default constructor because we did not pass any parameters ");

    }

    public ConstructorConcept(int i){ // if the constructor will be commented down , we will get an error from its object
        System.out.println("This is a single parameter constructor:"+i);
    }

    public ConstructorConcept(int a, String b){ // if the constructor will be commented down , we will get an error from its object as well.
        System.out.println("This is a two parameters constructor");
        System.out.println("the value of a is :"+a);
        System.out.println("the value of b is :"+b);
    }
    // if we comment down all the constructors we will only get errors from the objects we created for the parameterized constructors ,
    // we will not get an error from the object we created for for the default constructor because , there is always a hidden constructor created by java.
    // also that object we created for the default constructor can be use to call the non static methods as well as the non static variables

    public static void main(String[] args) {

        // in here we will  be creating objects for our constructors , the minute we create the object , the constructor will be called automatically , there is no need to use object reference variable name to call the constructor.
        ConstructorConcept object = new ConstructorConcept(); // this object will be able to call only the default constructor since we did not pass any values to it.
        ConstructorConcept object1 = new ConstructorConcept(200);// this object will call only the single parameter constructor since we only passed one value to it
        ConstructorConcept object2 = new ConstructorConcept(1,"Billal"); // this object will call only the constructor with 2 parameters, since we only passed 2 parameters here




    }
}
