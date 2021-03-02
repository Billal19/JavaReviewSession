package PalindromeString;

import java.util.Scanner;

public class PalindromeStringUsingScanner {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println(" enter the fist_name :");
        String firstName = myScan.nextLine();
        System.out.println("we would like to convert this first_name: " +firstName);

        // we will be using for loop to reverse the string value :
        int len = firstName.length();
        String rev = "";
        for (int i = len-1; i>=0; i--){
            rev= rev + firstName.charAt(i);
        }
        System.out.println("the reversed first_name will be :"+rev);


        // to check if the string is palindrome or not , we will have to create a variable where we store the firstName value given by the user and compare it to the reversed one :
        String origin_firstName = firstName;// the variable has been created
        if (origin_firstName.equals(rev)){
            System.out.println("this is a palindrome String");

        }else{
            System.out.println("this is not a palindrome String");
        }


    }
}
