package RecursionAndFactorialNumbers;

public class RecursionExample {

    public static void main(String[] args) {
        tryMethod(10); // we called the method from the main method

    }

    public static void tryMethod( int n ){
        if (n==0){ // this is the base case
            System.out.println("this line of code will be printed one time");
        }
        else {
            System.out.println("this line of code will be printed multiple times depending on the given condition ");
            n--;
            tryMethod(n); // this method is being called inside itself
        }
    }
}
