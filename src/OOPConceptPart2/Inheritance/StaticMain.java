package OOPConceptPart2.Inheritance;

public class StaticMain {

    public static void main(String[] args) {
        StaticChildOverriding  obj = new StaticChildOverriding(); // i've created the object to call the child class methods as well as the ones inherited from the parent class
        obj.backUpCamera(); // this is a child method
        obj.carSensor(); // this was inherited from the superclass
        obj.carStart(); // this method also was inherited from the superclass
        StaticChildOverriding.carNavigation();// the carNavigation method was supposed to be an overridden method , but as you can see in here i did not call with the object name ,
        // but i called it with Child class name , because i made this method static , so there is not need to create an object for a static method , also this method is no longer an overridden method
        // because static method can be overridden,
    }
}
