package Practice.try7;

import java.util.Scanner;

public class ReverseAnInteger {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = myScan.nextInt();
        System.out.println("we wanted to reverse this number"+num);

//        int orig_num = num;
//
//        int rev =0;
//        while (num!=0){
//            rev= rev*10 + num%10;
//            num= num/10;
//
//        }
//        System.out.println("the reversed number is :"+rev);
//
//
//        if (orig_num == rev){
//            System.out.println("the number is palindrome");
//        }
//        else{
//            System.out.println("the number is not palindrome");
//        }



        // we will be using stringBuffer:
//        StringBuffer myObj = new StringBuffer(String.valueOf(num));
//        StringBuffer rev1 = myObj.reverse();
//        System.out.println(rev1);
//


        // we will be using StringBuilder;
        StringBuilder OBJ = new StringBuilder();
        OBJ.append(num);
        StringBuilder rev2 = OBJ.reverse();
        System.out.println(rev2);
    }


}
