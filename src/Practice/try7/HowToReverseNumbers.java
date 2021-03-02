package Practice.try7;

import java.util.Scanner;

public class HowToReverseNumbers {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter the number you wish to reverse");
        int number = myScan.nextInt();
        System.out.println("i am willing to reverse the following number:"+number);


        //-1st approach is using algorithm :
//        int rev = 0; // this is variable is declared and initialized temporally
//
//        while (number!=0){
//            rev = rev*10 + number%10;
//            number = number/10;
//        }
//
//        // we will break down this concept :
//        // first round :
//        // rev = 0*10 + 65432%10 == the output here is 0 + 2
//        // number = 65432/10 = 6543
//        // second round:
//        // rev = 2 *10 + 6543%10 == the output here is 20 + 3 == 23
//        // number = 6543/10 = 654
//        // third round :
//        // rev = 23 *10 + 654%10 = 230 +4 == 234
//        // num = 654 /10 = 65
//        // fourth round
//        // rev = 234 * 10 + 65%10 = 2340 + 5 == 2345
//        // num = 65 /10 = 6
//        // fifth round
//        // rev = 2345 *10 + 6%10 ==> 23456
//        // now we managed to reverse the number
//
//        System.out.println("the reversed number is :" + rev);

        // 2nd approach using the stringBuffer class:

//        StringBuffer obj = new StringBuffer(String.valueOf(number));
//        StringBuffer rev1 = obj.reverse();
//        System.out.println("the reversed number is :"+rev1);

        //3rd approach using the stringBuilder class:

        StringBuilder obj = new StringBuilder();
        obj.append(number);
        StringBuilder rev2 = obj.reverse();
        System.out.println("the reversed number is :"+rev2);


    }


}
