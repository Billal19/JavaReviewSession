package PalindromeNumberConcept;

public class Example {

    public static void main(String[] args) {
        pNumber(123321);

    }


    public static void pNumber( int num){
        System.out.println("given number is :"+num);

        int sum=0;
        int rev=0;
        int t;

        t=num;


        while(num>0){
            rev= num%10;
            num=num/10;
            sum=(sum*10)+rev;

        }

        if (t==sum){
            System.out.println("this is a palindrome number");
        }
        else {
            System.out.println("its not a palindrome number");
        }
    }
}
