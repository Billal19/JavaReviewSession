package Practice.try8;

public class Primes {

    public static boolean findPrimes(int Num){
        if (Num<=1){
            return false;
        }

        for (int i =2; i<Num;i++){
            if (Num%i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("is the number 17 a prime Number ? " + findPrimes(17));
        findAllPrimes(20);
    }


    public static void findAllPrimes(int digit){
        for (int a=2;a<digit;a++){
            if (findPrimes(a)){
                System.out.println(a);
            }
        }
    }
}
