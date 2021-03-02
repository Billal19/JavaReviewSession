package RecursionAndFactorialNumbers;

public class FindFactorialOfNumber {

    // A factorial number is a number multiplied by each of its preceding numbers
    // Example : 5! = 5*4*3*2*1 =120

    public static void main(String[] args) {
        System.out.println(factorial(5));


    }

    public static int factorial(int n){

        if (n==1){
            System.out.println("factorial("+ n +")=1");
            return 1;


        }else {
            System.out.println("factorial ("+n+") = "+n+" * factorial("+(n-1)+")");

            return  n * factorial(n-1);
        }

    }
}
