package Practice.try8;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter the name you wish to reverse");
        String name = myScan.nextLine();

        String Origin_name= name;

        StringBuffer TheName = new StringBuffer(name);
        StringBuffer revName = TheName.reverse();
        System.out.println("the reversed name is:" + revName);


        if (Origin_name.equals(name)) {

            System.out.println("the name is palindrome");
        }else{
            System.out.println("the name is not palindrome");
        }


    }
}
