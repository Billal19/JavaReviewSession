package OOPConceptPart2.singleton;

public class SingletonDemo {
    // A singleton class is a class that can have only one object (an instance of the class) at a time.
    // The purpose of singleton is to control object creation , also limiting the number of objects to only one.
    // Since there is only one Singleton instance , any instance fields of a singleton will occur only once per class, just like static fields

     int number ;
     String name;

    // Private constructor : prevents other classes from instantiating this class
    // It can only be instantiated within this class
    private SingletonDemo(){
        this.number=15;
        this.name="James";
    }

    // to be able to create an object for this class in another class , we will have to follow this steps :
    // * After declaring a private constructor that will prevent other class from instantiating this class we will have to:
    // 1-Create a public static object of this class inside this class
    // 2-Use the getInstance method(it has to be public and static and returnType as well ( returns the object )), the syntax of this method will be like this ==> public static ClassName getInstance(); making sure that it returns the object name
    // 3-After this first 2 steps , we will be able to create the object of this class in another class(TestClass) but the syntax will be different since we will use the getInstance();
    // 4- The syntax of the object will be like this : ClassName objectName = className.getInstance();
    // 5- now we will be able to call all the non-static variables and method from the this class (Singleton class)
    public static SingletonDemo instance= new SingletonDemo(); // in here we created a private static object for the Singleton class

    public static SingletonDemo getInstance(){ // in here we used the getInstance method , it has to be public and static and it has to return the object
        return instance;
    }








}
