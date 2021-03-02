package Practice.try7.RecursionExamples;

import java.util.Scanner;

public class ReverseNumberAndCheckIfIsPalindrome {


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("insert the number you wish to reverse");
        int number = obj.nextInt();
        System.out.println("the number is the following: "+number);

        int Origin_number = number;

        int rev = 0 ;
        while (number!=0){
            rev = rev*10 + number%10;
            number = number/10;

        }
        System.out.println("this reversed number is :"+rev);
        if (Origin_number==rev){
            System.out.println("this is a palindrom number");
        }else {
            System.out.println("this is not a palindrome number");
        }





    }
}
