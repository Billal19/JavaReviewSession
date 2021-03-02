package OOPConceptPart2.Inheritance;

public class StaticMethodOverriding { // the super class

    // the static method can never be overridden .

    public static void carNavigation(){ // this method will be the overridden method in the child class , but if we make this method static , we will be getting an error in the child class , because we can not override a static method.
        // we can eliminate the error from the child class method if we add the static keyword to the method and remove the @override annotation, but that way the method will not be an overridden method .
        System.out.println("this car doesn't have navigation system");
    }

    public void carStart (){
        System.out.println("this car starts with the push button ");
    }

    public void carSensor (){
        System.out.println("this car has a very sensitive sensor");
    }
}
