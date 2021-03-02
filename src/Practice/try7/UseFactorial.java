package Practice.try7;

public class UseFactorial {

    public static void main(String[] args) {
        System.out.println(myMethod(10));

    }

    // using recursive method ;

    public static int myMethod(int n){

        if(n==1){
            System.out.println("factorial"+(n)+ "= 1");
            return 1;
        }else{
            System.out.println("factorial" +(n)+ "  =  " +(n)+" *  factorial"+(n-1));


        }

        return n * myMethod(n-1);

    }

    // Without recursive method :

    public static int newMethod(int n){
        int fact =1;

        for (int i=0;i<fact;i++){
            fact=fact*i;
        }
        return fact;
    }
}
