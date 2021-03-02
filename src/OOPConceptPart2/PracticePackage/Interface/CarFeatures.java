package OOPConceptPart2.PracticePackage.Interface;

public class CarFeatures implements Jaguar,Tesla { // we used the key word implements to access the interface , the child class can implement multiple interfaces by using comma

    // if a class implements an interface , then its mandatory for that class to override all of the interface methods. (in an implementation of an interface or the subclass , we should override all the methods of an interface, otherwise it will be an error)

    @Override // Using the @override annotation is not mandatory but the difference it will make , is that if we had the annotation , the methods will be executed at run-time, without annotation , the execution will be after compiling.
    public void distanceStart() {
        System.out.println("the distance car feature was copied from jaguar");
    }

    @Override
    public void backUpCamera() {
        System.out.println("the new backup camera feature was copied from jaguar");

    }

    @Override
    public void automaticDoor() {
        System.out.println("the automatic door feature was inspired by jaguar company ");

    }

    public void selfPark(){ // this method is not an overridden method , it already exists in this class
        System.out.println("the self park feature is an upcoming feature to be implemented in jaguar");

    }

    @Override
    public void batteryLife() {
        System.out.println("Tesla's battery's life sucks ");
    }
}
