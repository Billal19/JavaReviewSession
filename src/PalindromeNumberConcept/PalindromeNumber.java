package PalindromeNumberConcept;

public class PalindromeNumber {

    // Palindrome number is when the reverse of the number = the same number : reading the number from the left to the right is the same as reading it from the right to the left
    // In other words a palindrome number is when a number remains the same when its digits are reversed
    // examples : 151 is a palindrome number , 7887 is a palindrome number , 653356 is a palindrome number

    public static void main(String[] args) {

        isThisPalindromeNumber(657);

    }

    public static void isThisPalindromeNumber(int num){

        System.out.println("Given number is :"+num);
        int r = 0;
        int sum = 0;
        int n ;
        n=num;

        while (num!=0){
           r= r*10 + num%10;
           num = num/10;
        }
        if (n==r){
            System.out.println("Palindrome number");

        }else{
            System.out.println("Not palindrome number");
        }


    }



}
