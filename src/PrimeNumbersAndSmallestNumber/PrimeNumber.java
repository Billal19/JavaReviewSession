package PrimeNumbersAndSmallestNumber;

public class PrimeNumber {

    // This topic needs more attention as its not well understood

    // What is Prime Number: A prime number is a number that is only divisible by 1 or itself. in other words , a prime number is a number whose multiples are the number itself and 1.
    // the number (2) is the lowest prime number ( 0 and 1 are NOT prime numbers )
    // Also negative numbers are not prime numbers

    // 1- This is the simple logic to check if the number given is prime or not :
    public static boolean isPrimeNumber(int number){ // we will have to create a boolean return type method

        if(number<=1){
            return false; // it returns false because we know that the lowest prime number is 2 , and (1 & 0) are not prime numbers
        }

        for(int i=2; i<number;i++){
            if(number % i ==0){
                return false;
            }
        }
        return true;
    }

    // 2- I need to write a logic or a program to find how many primes number from 1 to 20;

    public static void findPrimeNumbers(int num){
        for(int i=2; i <=num;i++){
            if(isPrimeNumber(i))
                System.out.println(i+"");

        }
    }

    public static void main(String[] args) {

        System.out.println("is 2 a prime number :"+isPrimeNumber(2));
        System.out.println("is 16 a prime number :"+isPrimeNumber(16));
        System.out.println("is 10 a prime number :"+isPrimeNumber(10));
        System.out.println("is 3 a prime number :"+isPrimeNumber(3));
        System.out.println("is 17 a prime number :"+isPrimeNumber(17));
        System.out.println("is 0 a prime number :"+isPrimeNumber(0));
        System.out.println("is 1 a prime number :"+isPrimeNumber(1));
        System.out.println("is -2 a prime number :"+isPrimeNumber(-2));

        findPrimeNumbers(100);





    }
}
