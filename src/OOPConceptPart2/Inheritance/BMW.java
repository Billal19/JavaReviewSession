package OOPConceptPart2.Inheritance;

public class BMW extends Car{ // BMW is A subclass , we used the key word extends to inherit some properties from the parent class (Car)

    // BMW now can access all the car's properties. also we added 02 methods in the BMW class, so in total now it can access 5 methods.
    // When same method is present in a parent class as well as the child class with the same name and number of arguments , its called method overriding.

    @Override
    public void start(){ // this method has the same name , number of arguments as the start method we created in the parent class ( this is the overridden method)
        System.out.println("BMW has new starting feature");
    }

    public void theftSafety (){
        System.out.println("BMW has theftSafety System");
    }

}
