package OOPConceptPart2.encapsulation;

public class Vehicles {

    private String vehicleName ;
    private int vehicleYear ;
    private int vehicleModel;
    private String vehicleCondition;

    public String getVehicleName(){
        return vehicleName;
    }
    public void setVehicleName(String vehicleName){
        this.vehicleName= vehicleName;
    }



    public int getVehicleYear(){
        return vehicleYear;
    }

    public void setVehicleYear(int vehicleYear){
        this.vehicleYear= vehicleYear;
    }


    public int getVehicleModel(){
        return vehicleModel;
    }

    public void setVehicleModel(int vehicleModel){
        this.vehicleModel=vehicleModel;
    }


    public String getVehicleCondition(){
        return vehicleCondition;
    }
    public void setVehicleCondition(String vehicleCondition){
        this.vehicleCondition= vehicleCondition;
    }




}
