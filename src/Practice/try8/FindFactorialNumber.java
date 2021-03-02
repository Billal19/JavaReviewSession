package Practice.try8;

public class FindFactorialNumber {

    public static void main(String[] args) {
        System.out.println(factorialMethod(7));

    }


    public static int factorialMethod(int n){
        if (n==1){
            System.out.println("factorial ("+n+")= 1");
            return 1;
        }else {
            System.out.println("Factorial ("+n+") = ("+n+") * Factorial ("+(n-1)+")" );

            return n * factorialMethod(n-1);
        }
    }
}
