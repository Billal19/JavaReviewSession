package Practice.RecursionSecondReview;

public class SecondRecap {

    public static void myMethod(int n){

        if (n==10){
            System.out.println("this is the last line of code to be printed");
        }else {
            System.out.println("this line of code will be printed repeatedly based on the condition"+n);
            n++;
            myMethod(n);
        }

    }

    public static void main(String[] args) {
        myMethod(0);
    }
}
