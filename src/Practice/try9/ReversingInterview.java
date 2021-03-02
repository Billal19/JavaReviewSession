package Practice.try9;

import java.util.Scanner;

public class ReversingInterview {


    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("please enter the namer you wish to reverse");
        String name = obj.nextLine();
        System.out.println("i would like to reverse this number" + name);

        String Origin_name = name;

        //USing String buffer:

        StringBuffer obj1 = new StringBuffer(String.valueOf(name));
        StringBuffer rev = obj1.reverse();
        System.out.println(" the reversed name is : " +rev);


        if (rev.equals(Origin_name)){
            System.out.println("this is the palindrom name");
        }else{
            System.out.println("this is not a palindrom name");
        }



    }
}
