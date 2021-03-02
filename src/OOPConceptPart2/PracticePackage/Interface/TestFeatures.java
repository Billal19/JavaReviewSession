package OOPConceptPart2.PracticePackage.Interface;

public class TestFeatures {
    public static void main(String[] args) {


        CarFeatures object = new CarFeatures(); // we created an object of of the class or subclass
        System.out.println(Jaguar.speedMph); // interface variables are by default static , we just have to call them with the class name because the main method is created in an another class, there is no need of creating object to call a static variable
        //Jaguar.speedMph=200; in here a tried to sign a new value to this variable , but it threw an error because all the variable that declared inside an interface, are final

        // Dynamic polymorphism : same methods are being overridden in two different classes with the same names , same parameters , just different implementation
        object.automaticDoor();
        System.out.println("***************");
        object.backUpCamera();
        System.out.println("***************");
        object.distanceStart();
        System.out.println("***************");
        object.selfPark(); // this method is a regular method that only exist in the subclass not in the interface
        System.out.println("***************");
        object.batteryLife();


        //Dynamic polymorphism : child class object can be referred by an interface reference variable name
        Jaguar carObject = new CarFeatures(); // we only can access the overridden methods from the interface
        carObject.automaticDoor();
        carObject.backUpCamera();
        carObject.distanceStart();


    }

}
