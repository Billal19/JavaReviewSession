package Practice.Recap1;

public class PrimeNumbersReview {

    // what is prime Numbers in java : prime numbers in java are the numbers that can be divided by themselves or 1, in other words , prime numbers are the numbers whose multiple are the number itself and the number one .
    // the lowest prime number is 2. the number 0 and 1 are not prime numbers


    public static boolean checkTheNumber( int number){
        if(number <=1){
            return false;
        }
        for(int i = 2 ; i<number ; i++){
            if(number%2==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println("is the number 0 a prime number :"+checkTheNumber(0));
        System.out.println("is the number 1 a prime number :"+checkTheNumber(1));
        System.out.println("is the number 2 a prime number :"+checkTheNumber(2));
        System.out.println("is the number 3 a prime number :"+checkTheNumber(3));
        System.out.println("is the number 4 a prime number :"+checkTheNumber(4));
        System.out.println("is the number 17 a prime number :"+checkTheNumber(17));
        System.out.println("is the number 16 a prime number :"+checkTheNumber(16));

    }
}
