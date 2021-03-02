package Practice.try7.FactorialNumbersPractice;

public class Review {

    public static void main(String[] args) {

        System.out.println(myMethod(5));

    }



    public static int myMethod(int n){
        if (n==1){
            System.out.println("factorial" +n+ " =1 ");
            return 1;
        }else {
            System.out.println("factorial ("+n+") = "+n+" * factorial ("+(n-1)+")");
        }
        return n * myMethod(n-1);
    }
}
