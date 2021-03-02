package RecursionAndFactorialNumbers;

public class RecursionOtherExample {

    public static void main(String[] args) {
        countBackwards(15);
    }

    public static void countBackwards(int n){

        if(n==0){ // this is base case which is the good place to start recursion
            System.out.println("this is the last line of code to be printed one time when the variable reaches 0"); // this line of code will be printed only one time
        }
        else{
            System.out.println(" the output in here is :"+ n); // this line of code will be printed multiple times depending on the given condition

            n--; // we decremented the variable since in the base case we mentioned that n==0, and in the method we initialized the variable to 15, that's why we had to decrement it to reach that 0 , because we started from 15
            countBackwards(n);

        }

    }
}
