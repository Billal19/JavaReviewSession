package Practice.Recap1;

public class PrimeOrEvenAndOdd {


    // Definition of the prime number : a prime number is a number whose multiples are the number itself and 1, in other words the prime number is a number that can only be divided by itself and 1 .

    public static boolean primes(int number){
        if (number <=1){
            return false;
        }

        for (int i=2 ; i<number;i++){
            if (number%i ==0){
                return false;
            }

        }
        return true;

    }



    public static void main(String[] args) {

        System.out.println(" (0) is a prime number : " + primes(0));
        System.out.println(" (1) is a prime number : " + primes(1));
        System.out.println(" (2) is a prime number : " + primes(2)); // this is going to return "true" because 2 is the lowest prime number



    }
}
