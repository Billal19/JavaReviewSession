package Practice.oopReview;

import Practice.oopReview.Mercedes;

public class TestClass {
    public static void main(String[] args) {
        Mercedes obj = new Mercedes();
        obj.brakes();
        obj.color();
        obj.windows();
        //obj.MaintenanceCost=300; in here i tried to assign a new value to MaintenanceCost variable but i could'nt because its by default final.
        obj.leaseAgreement();
        obj.carInsurance();

        System.out.println( "there will be a monthly maintenance fee which has been reduced to :"+obj.MaintenanceCost);
    }
}
