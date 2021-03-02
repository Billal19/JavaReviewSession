package Practice.oopReview;

public abstract class FirstClass  {



    public void bigDay(int shipmentFees , int handlingFees){
        int shipment = shipmentFees;
        int handling = handlingFees;
        int totalCost = shipment+handling;
        System.out.println("the total expenses is: "+ totalCost);
    }


    public void day(){
        System.out.println("this is a regular class created in the abstract class");
    }

    public abstract void night(); // this is an abstract method , the body is not allowed , the body of this abstract method will be provided by another class ( it will be inherited from another class)







}
