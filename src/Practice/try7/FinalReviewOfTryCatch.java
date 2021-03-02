package Practice.try7;

import java.util.Scanner;

public class FinalReviewOfTryCatch {

    public static void main(String[] args) {

//        try {
//            int numbers [] = {10,20,30,40};
//            System.out.println(numbers[4]);
//
//        }catch (Exception e ){ // this is a non-generic exception
//            System.out.println("this is supposed to be an ArrayIndexOutOfBoundException"); // this a custom message
//            e.printStackTrace(); // this is used to print out the actual exception message
//        }
//
//        Scanner obj = new Scanner(System.in);
//        System.out.println("Please enter your age");
//        try {
//            int age = obj.nextInt();
//            System.out.println(" my age is :" +age);
//        }catch (Exception e ){
//            System.out.println("sorry this is not a valid integer value");
//            e.printStackTrace();
//        }

       try {
           String cars[] = {"ford","fiat","VW"};
           System.out.println(cars[4]);
       }catch (NullPointerException e){
           System.out.println("this will catch a specific exception");
           e.printStackTrace();
       }catch (ArrayIndexOutOfBoundsException b){
           b.printStackTrace();
           System.out.println("this is an out of bound exception");
       }finally {
           System.out.println("this block of code will always be printed regraldess of the results in a try catch");
       }







    }
}
