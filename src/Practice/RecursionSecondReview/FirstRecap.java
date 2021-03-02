package Practice.RecursionSecondReview;

public class FirstRecap {

    static int number = 0;

    public static void myMethod(){
        number++;
        if (number<10){
            System.out.println("we are counting up :"+number);

            myMethod();
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}
