package Practice.oopReview;

import Practice.oopReview.CarDocuments;
import Practice.oopReview.CarsOptions;

public class Mercedes implements CarsOptions, CarDocuments { // this class extended the CarOption interface , after extending it we will get an error because we must implement all the methods of an interface ,
    // either by doing the mouseover the error and click on implement the methods which will provide us with the @override annotation as well , or we can just write the methods manually with the bodies
    @Override
    public void windows() {
        System.out.println("the Mercedes has a tinted window ");

    }

    @Override
    public void brakes() {
        System.out.println("the mercedes has ABS brake system");

    }

    @Override
    public void color() {

        System.out.println("the mercedes come with the dark grey color");

    }

    @Override
    public void leaseAgreement() {
        System.out.println("The agreement should be signed upon the pick up ");

    }

    @Override
    public void carInsurance() {
        System.out.println("The full coverage insurance is recommended for a brand new car ");

    }
}
