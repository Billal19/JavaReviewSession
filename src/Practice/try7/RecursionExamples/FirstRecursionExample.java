package Practice.try7.RecursionExamples;

public class FirstRecursionExample {

    static int NumberOfTimes=10;

    public static void main(String[] args) {
        myMethod();
    }



    public static void myMethod(){
        NumberOfTimes--;
        if (NumberOfTimes>=0){
            System.out.println("this line of code will be printed multiple time depending on the given condition"+NumberOfTimes);
            myMethod();
        }
    }
}
