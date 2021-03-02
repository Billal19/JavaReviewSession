package Practice.try7;

public class FindPrimeNumbers {

    public static boolean checkForPrimes(int num){
        if (num<2){
            return false;
        }

        for (int i=2 ;i<num;i++){
            if (num%2==0){
                return false;
            }
        }
        return true;
    }


    public static void findThePrimes(int number){
        for (int i=2; i<number;i++){
            if (checkForPrimes(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("is the number 10 primes: " +checkForPrimes(17));
        System.out.println("is the number 11 primes: " +checkForPrimes(11));

        findThePrimes(20);

    }
}
