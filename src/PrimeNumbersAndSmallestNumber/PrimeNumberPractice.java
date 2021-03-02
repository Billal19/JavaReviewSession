package PrimeNumbersAndSmallestNumber;

public class PrimeNumberPractice {


    // this method used to find out if the given number is prime or not
    public static  boolean checkPrimeMethod(int num){
        if (num<=1){
            return false;
        }

        for (int i = 2; i<num; i++){
            if (num % 2 ==0){
                return false;
            }
        }
        return true;
    }

    // this method is used to find the numbers from 1 to any other given number:
    public static void findPrimeNumbers(int numbers){
        for (int i =2 ; i<=numbers;i++){
            if (checkPrimeMethod(i)){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(" is the number 4 prime number : "+checkPrimeMethod(4));

        findPrimeNumbers(20);
    }




}
