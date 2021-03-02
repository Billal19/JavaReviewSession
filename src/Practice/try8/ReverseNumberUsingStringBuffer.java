package Practice.try8;

import java.util.Scanner;

public class ReverseNumberUsingStringBuffer {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("please enter the number:");
        int Number = myObj.nextInt();

        int origin_num = Number;

        //1-Using StringBuffer:
        StringBuffer obj = new StringBuffer(String.valueOf(Number));
        StringBuffer rev = obj.reverse();
        System.out.println(rev);


        //2-Using StringBuilder:

        StringBuilder obj1 = new StringBuilder();
        obj1.append(Number);
        StringBuilder rev1 = obj1.reverse();
        System.out.println(rev1);





    }
}
