package PalindromeNumberConcept;

import java.util.Scanner;

public class PalindromeNumberUsingScanner {

    // Palindrome number is when the reverse of the number = the same number : reading the number from the left to the right is the same as reading it from the right to the left
    // In other words a palindrome number is when a number remains the same when its digits are reversed
    // examples : 151 is a palindrome number , 7887 is a palindrome number , 653356 is a palindrome number

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int num = myScan.nextInt();
        System.out.println("We will be checking this number :" + num + " if its Palindrome or not");

        int orig_num = num;// we created this variable to store the num given in it and  compare the value of rev (reversedNumber) to the origin_num


        int rev = 0;
        while (num!=0){
            rev= rev*10 + num%10;
            num= num/10;
        }

        if (orig_num==rev){
            System.out.println("the number is palindrome");
        }

        else{
            System.out.println("the number is not palindrome");
        }



        System.out.println(rev);
    }
}
