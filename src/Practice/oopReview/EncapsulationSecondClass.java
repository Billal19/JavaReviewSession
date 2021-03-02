package Practice.oopReview;

import Practice.oopReview.Encapsulation;

public class EncapsulationSecondClass {


    public static void main(String[] args) {

        Encapsulation obj1 = new Encapsulation(); // i created this object to access the attributes of the main class , but i could'nt because they are final , they only be accessed within the same class where were initially created .

        obj1.setFirstName("John");
        obj1.setEmployeeIncome(30000);
        obj1.setEmployeeInitial('J');

        System.out.println(obj1.getFirstName());
        System.out.println(obj1.getEmployeeIncome());
        System.out.println(obj1.getEmployeeInitial());




    }
}
