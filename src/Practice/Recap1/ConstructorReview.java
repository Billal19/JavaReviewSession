package Practice.Recap1;

public class ConstructorReview {

    public ConstructorReview(){ // this is a default constructor (no parameters )
        // this is the body of the constructor
        System.out.println("this is a default constructor without parameters, its going to be called when we create an object");
    }

    public ConstructorReview(String carName, int carYear){
        System.out.println(" this is a parameterized constructor with two parameters :"+carName +" and "+carYear);
    }

    public ConstructorReview(String dealerReview, int carPrice, int gasTank){
        System.out.println(" this is a parameterized constructor with two parameters :"+dealerReview +" , "+carPrice+" and "+ gasTank);
    }


    public static void main(String[] args) {
        ConstructorReview obj = new ConstructorReview();// no parameters here , so the default constructor will be called
        ConstructorReview obj1 = new ConstructorReview("Mercedes",2020); // we passed two parameters , so the second constructor with two parameters will be called
        ConstructorReview obj2 = new ConstructorReview("5 stars", 30000,5); // we passed 3 parameters , so the 3rd constructor with 3 parameters will be called
    }
}
