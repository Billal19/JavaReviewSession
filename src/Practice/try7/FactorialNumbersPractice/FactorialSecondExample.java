package Practice.try7.FactorialNumbersPractice;

public class FactorialSecondExample {

    // We will be using two logic to find the factorial number


    public static void main(String[] args) {
        //System.out.println(myMethod(5));
        System.out.println(thisMethod(6));
    }

    //1st example using recursion method :
    public static int myMethod(int i){
        if (i==1){
            System.out.println("factorial" +i+ "=1");
            return 1;
        }else{
            System.out.println("factorial ("+i+") = "+i+" * factorial ("+(i-1)+")");

            return i * myMethod(i-1);
        }
    }


    //2nd example without recursion:

    public static int thisMethod(int n){
        int fact = 1;
        if (n==0){
            return 1;
        }

        for (int b=1; b<=n ; b++){
            fact=fact*b;
        }
        return fact;
    }
}
