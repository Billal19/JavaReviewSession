package Practice.try8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatchReminder {

    public static void main(String[] args) {


//        try {
//            String cars[] = {"Gold","Jetta", "Passat"};
//
//            System.out.println(cars[5]);
//
//
//        }catch (Exception e){ // this  is a generic exception
//            System.out.println("an exception has been caught ");
//            e.printStackTrace();
//        }



//
//        Scanner ScanObj = new Scanner(System.in);
//
//        try {
//            System.out.println("please enter the your age");
//            int myAge = ScanObj.nextInt();
//            System.out.println("my age is : " +myAge);
//        }catch (InputMismatchException e){
//            System.out.println("please provide the proper integer value ");
//
//
//        }


        String cars [] = {"Gold","Jetta", "Passat"};

        try {
            System.out.println(cars[4]);

        }catch (NullPointerException e){
            System.out.println("Exception has been caught");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException b){
            System.out.println("this is the other exception that has been caught after updating our array");
            b.printStackTrace();
        }
    }
}
