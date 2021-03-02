package Practice.try7.FactorialNumbersPractice;

public class FactorialFirstExample {

    public static void main(String[] args) {
        System.out.println(factorialMethod(5));

    }

    public static int factorialMethod(int n){
        if (n==1){
            System.out.println("factorial" +(n)+ "=1");
            return 1;

        }else {
            System.out.println("factorial ("+n+") = "+n+" * factorial ("+(n-1)+")");

            return n * factorialMethod(n-1);
        }
    }
}
