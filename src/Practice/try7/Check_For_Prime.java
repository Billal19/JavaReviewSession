package Practice.try7;

public class Check_For_Prime {


    public static boolean checkThisNumber(int number){
        if (number <=1){
            return false;
        }

        for (int i =2;i<number;i++){
            if (number % i ==0){
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("is the number 7 a prime number : " +checkThisNumber(7)); //it should be true
        System.out.println("is the number 2 a prime number : " +checkThisNumber(2)); //it should be true
        System.out.println("is the number 1 a prime number : " +checkThisNumber(1)); //it should be false
        System.out.println("is the number 0 a prime number : " +checkThisNumber(0)); //it should be false
        System.out.println("is the number -3 a prime number : " +checkThisNumber(-3)); // it should be false

    }
}
