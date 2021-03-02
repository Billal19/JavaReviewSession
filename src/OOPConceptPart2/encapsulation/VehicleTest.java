package OOPConceptPart2.encapsulation;


public class VehicleTest {
    public static void main(String[] args) {

        Vehicles cars = new Vehicles();
        cars.setVehicleName("Tesla");
        cars.setVehicleYear(2018);
        cars.setVehicleModel(3);
        cars.setVehicleCondition("used");

        System.out.println("this car's name is :"+cars.getVehicleName());
        System.out.println("this vehicle's year is :"+cars.getVehicleYear());
        System.out.println("the model is :"+cars.getVehicleModel());
        System.out.println("the condition is :"+cars.getVehicleCondition());



    }

}
