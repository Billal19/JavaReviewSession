package Practice.oopReview;

public  class SecondClass extends FirstClass {// when a regular class implements an abstract class we will have to either right the same abstract method created in the superclass,
    // or mouseover the error and click on implement the abstract method , once we implement this method we will be able to provide a body for this method inside the child class.



    public void bigDay(int shipmentFees , int handlingFees){ // this is called method overriding , same method with the same name , same number of parameters , same dataType . as the one that's been already declared in the super class (the abstract class) the only difference is that implementation
        int shipment = shipmentFees;
        int handling = handlingFees;
        int totalCost = shipment+handling;
        System.out.println("We've managed to get the final cost which is : "+ totalCost);
    }

    public void dayAndNight(){
        System.out.println("we are in a regular class where only regular methods are accepted (methods with bodies) ");
    }

    @Override // the override annotation is here because i implemented the method automatically , removing this annotation will not effect the execution of our program , it will only execute it after compiling instead of run--time.
    public void night() {
        System.out.println("this method has been implemented from the superclass , now we managed to provide a body for this restricted method ");

    }











}
