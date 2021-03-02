package Practice.try8;

import java.util.Scanner;

public class UsingAlgorithmToReverseNumbers {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter the number you wish to reverse");
        int num = obj.nextInt();
        System.out.println("I would like to reverse this number "+num);

        int origin_num = num;



        //1234554321

        int rev = 0;
        while (num!=0){
            rev= rev*10 + num%10; //
            num=num/10;


        }

        System.out.println("the reversed number is:" +rev);


        if (origin_num==rev){
            System.out.println("this is a palindrome number");
        }else{
            System.out.println("this is not a palindrome number");
        }


    }
}
