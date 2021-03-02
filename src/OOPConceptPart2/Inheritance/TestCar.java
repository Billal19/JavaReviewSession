package OOPConceptPart2.Inheritance;

public class TestCar {

    public static void main(String[] args) {



        // Accessing all these methods is called  ====> or run time polymorphism
        BMW object = new BMW(); // we created an object to access BMW's methods
        object.start();// as we know BMW has its own "start" method , also it inherited a method from the parent class with the same name and number of arguments .
        // when we call this same name method , the priority goes to the child class first , it will be called an executed first .
        // because if the method already exists in the child class , so there is no need to inherit another method. ( this is the overridden method)

        object.stop(); // this method is being inherited from the parent class , this method is not available in the child class
        object.start();
        object.theftSafety();
        object.engine(); // this method was created in the vehicle class , the vehicle class is being extended by the car class , and the car class which was the super class , has been extended by the BMW class , that's why we are able to access the vehicle class methods

        System.out.println("********************************");

        Car carObject = new Car();// we created an object for a parent class, by using the object of the parent class , we only gonna be able to access the parent class methods and if the parent class has extended another class like in this example it extended the vehicle class, so it will have access to the methods of the vehicle class too.
        carObject.start();
        carObject.stop();
        carObject.refuel();
        carObject.engine();

        System.out.println("*********************************");

        //Top Casting;
        Car newCarObject=new BMW(); // Child class object can be referred by parent class reference variable --Dynamic polymorphism ===> or run time polymorphism
        newCarObject.refuel(); // we only can access the parent class here , and the overridden method from the child class
        newCarObject.stop();
        newCarObject.start();

        //Down Casting ;
        BMW b1 = (BMW)new Car(); //the output will be ClassCastException because down cast is not allowed



    }
}
