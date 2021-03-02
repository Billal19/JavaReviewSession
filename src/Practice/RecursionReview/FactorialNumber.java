package Practice.RecursionReview;

public class FactorialNumber {

    // we will find the 7! = 7*6*5*4*3*2*1

    public static void main(String[] args) {

        System.out.println(sevenFactorial(7));

    }

    public static int sevenFactorial(int n ){
        if (n==1){ // base case
            System.out.println("factorial"+ n +"=1");
            return 1;
        }else {
            System.out.println("factorial ("+n+") = "+n+" * factorial("+(n-1)+")");


            return n * sevenFactorial(n-1);


        }


    }
}
