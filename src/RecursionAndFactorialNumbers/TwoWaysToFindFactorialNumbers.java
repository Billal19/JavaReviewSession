package RecursionAndFactorialNumbers;

public class TwoWaysToFindFactorialNumbers {

    // A factorial is a number multiplied by each of its proceeding number

    public static void main(String[] args) {
        System.out.println(myFactorial(5));
        System.out.println(newMethod(9));


    }

    //1. Find a factorial number without recursion (recursive method) : we will be using for loop:

    public static int myFactorial(int num){ // we created an int return type method
        int fact =1; // we created this variable to do the calculation for us
        if (num==0){ // this condition is optional, i just added it , with it or without the factorial of 0 will be always 1
            return 1;
        }
        for (int i=1; i<=num; i++){ // we will be using for loop to increment the given variable in it
            fact= fact*i; //

        }
        return fact; // the method will return  fact variable type

    }

    //2.Find a factorial Number using (recursion) or recursive method :
    public static int newMethod(int myNum){
        if (myNum==1){
            System.out.println("factorial ("+myNum+")=( 1 )");
            return 1;
        }
        else {
            System.out.println("factorial ("+myNum+") = "+myNum+" * factorial ("+(myNum-1)+") ");

        }


        return myNum*newMethod(myNum-1); // in here we called the method inside of itself since itself


    }

}
