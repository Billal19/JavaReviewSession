package Practice.try7;

public class Recursion {
    static int count =0;

    // recursion is a process in java by which a method can calls itself continually,in other words recursion is when a method calls inside of itself .
    // but when a method calls itself , it will repeat infinitely many times , and the computer may not handle this , so the recursive method needs to know when to stop,
    // that's why we will have to use the base case , to limit the number of times the code will be printed .
    // the purpose of recursion is to avoid creating many methods that use memory .
    // in the recursion method , there are 3 main things , the method needs to call itself , the method must have a base case , the method must change its state and move towards the base case .


    //1st approach on how to use the recursive method ;
    public static void main(String[] args) {
        myMethod(10);
        thisMethod();
        System.out.println( factorialMethod(5));
        System.out.println(myFact(7));
        myFact(7);

    }

    public static void myMethod (int n){
        if(n==0){
            System.out.println("this code will be printed one time because its the last code");
        }
        else{
            System.out.println("this line of code will be printed multiple times"+n);
            n--;
            myMethod(n);
        }
    }

    // Second approach on how to use recursive method; using the count variable

    public static void thisMethod(){
        count++;
        if (count<10){
            System.out.println("we will be printing out this line of code"+count);

            thisMethod();

        }



    }

    // How to find a factorial number in java using recursive methods :

    public static int factorialMethod(int n){

        if (n==1){
            System.out.println("factorial ("+1+") = 1");
            return 1;
        }else {
            System.out.println("factorial "+n+" = "+n+" * factorial ("+(n-1)+")");
            return n=n*factorialMethod(n-1);
        }

    }

    // finding factorial number without using recursive method :
    public static int myFact (int a ){
        int fact = 1;
        for(int i =1 ; i<=a; i++){
            fact= fact*i;
        }
        return fact ;

    }

}
