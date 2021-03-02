package Practice.try7;

import java.util.Scanner;

public class Try_Catch_Scanner {

    public static void main(String[] args) {

        int levels [] = {10, 20, 30 , 40 };

        try {
            System.out.println(levels[5]);

        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("the index you entered is out of bound ");
        }

        System.out.println("**********************************");

        Scanner myScan = new Scanner(System.in);
        System.out.println(" please enter your age");

        try {
            int age = myScan.nextInt();
            System.out.println("my name is :"+age);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("please provide a valid integer value");
        }
        finally {
            System.out.println("i used the scanner to perform the try_catch statements ");
        }


        System.out.println("*********************************");

        String names [] = new String[3];
        names[0]="bill";
        names[1]="phil";
        names[2]="rick";

        try {
            System.out.println(names[5]);
        }catch (NullPointerException e ){
            e.printStackTrace();
            System.out.println("nothing");

        }catch (ArrayIndexOutOfBoundsException b){
           // b.printStackTrace();
            System.out.println("we caught this exception");
        }

    }
}
