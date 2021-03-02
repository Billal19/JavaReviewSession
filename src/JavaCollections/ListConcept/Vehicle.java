package JavaCollections.ListConcept;

public class Vehicle {

    String vehicleType;
    String TruckBrand;
    int TruckYear;

    Vehicle(String vehicleType, String TruckBrand, int TruckYear){ // in this vehicle constructor we created some local variables

        this.vehicleType=vehicleType; // if the local variables have similar names as the global variables then we will use "this" keyword to initialize the variables
        this.TruckBrand= TruckBrand;
        this.TruckYear=TruckYear;
    }
}
