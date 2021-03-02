package Practice.try7.RecursionExamples;

public class SecondRecursionExample {

    public static void main(String[] args) {
        thisMethod(0);

    }


    public static void thisMethod(int n){
        if (n==10){
            System.out.println("this is the last line of code to be printed");
        }
        else {
            System.out.println("this line will be printed multiple times"+n);
            n++;
            thisMethod(n);
        }
    }
}
