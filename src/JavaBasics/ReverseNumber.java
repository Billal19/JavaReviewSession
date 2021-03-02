package JavaBasics;

import java.util.Scanner;

public class ReverseNumber {

    // in this class we learn how to reverse a number in java :

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("enter the number you wanted to reverse:");
        int num = myScan.nextInt(); // for example will be using 67542
        System.out.println("i would like to reverse the following number : " +num);



        // 1). first approach of reversing a number will be algorithm :
//        int rev = 0; // we declared this variable and initialized temporarily to 0
//
//        while (num!=0){ // we will be using while loop .
//            rev = rev*10 + num%10; // these two concepts are very important to reverse the number
//            num=num/10;

            // we will break down this math problem here :
            // 1)first round:
            // rev = 0*10 + 67542%10 ===> 0 + 2 ===> the output will be 2 so now rev=2
            // num = 67542/10 ===> this will exclude 2 , so the output here will be 6754 , so the number now is 6754
            // 2)second round:
            // rev = 2*10 + 6754%10 ====> 20 + 4 ===> the output will be 24 so now rev=24
            // num = 6754/10 ===> this will exclude 4, so the output will be 675, so the number now is 675
            // 3)Third round:
            // rev = 24*10 + 675%10 ===> 240 + 5 ===> the output will be 245 so now rev = 245
            // num = 675/10 ===> this will exclude 5 , so the output will be 67 , the number now is 67
            // 4)Fourth round :
            // rev = 245*10 + 67%10 ===> 2450 + 7 ===> the output will be 2457 so now rev is 2457
            // num = 67/10 ===> this will exclude 7 , so the output will be 6 , the number now is 6
            // 5)Fifth round :
            // rev = 2457*10 + 6%10 ===> 24570 + 6 ===> the output will be 24576
            // now we managed to reverse the number using algorithm so the output now is 24576

//        }
//        System.out.println("Reverse Number is :"+rev);


        // 2).Reverse a number using StingBuffer Class:
//        StringBuffer mySbObj = new StringBuffer(String.valueOf(num)); // we created an object of the StringBuffer class , we also used the valueOf() method to reverse an int to a string.
//        StringBuffer rev = mySbObj.reverse(); // we created a variable of a StringBuffer type where we can store the reverse method
//        System.out.println("Reverse Number is :"+rev);

        // 3).Reverse a number using a StringBuilder class;
        StringBuilder myObj = new StringBuilder(); // we created an object of a StringBuilder class
        myObj.append(num); // we will be using the append method
        StringBuilder rev =myObj.reverse(); // we created a variable to store the reverse method
        System.out.println("Reverse Number is :"+rev);
    }
}
