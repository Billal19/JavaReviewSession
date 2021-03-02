package OOPConceptPart2.PracticePackage.Interface;

public interface Jaguar { // this is an interface , we will only be designing this class , interface does'nt have main method , cant be used for creating objects , doesn't contain a constructor.

    int speedMph = 200; // interface attributes or variables are by default public , static and final ( there is no need to use the class object to call the interface variables), this variables values are constant (not changeable )

    public void distanceStart(); // In interface we only can use one specifier "public" , static is not allowed it will throw an error we only can declare methods , they don't have body in interface( the body will be provided by an implement class) , all the interface methods are by default 100% abstract and public

    public void backUpCamera();

    public void automaticDoor();
}
