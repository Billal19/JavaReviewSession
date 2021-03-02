package Practice.try7;

public class RecursionReminder {

    static int count = 0;


    public static void main(String[] args) {
        myMethod();
        countUp(1);

    }


    public static void myMethod(){

        count++;
        if (count<=10){
            System.out.println("this is the block of code that we will print multiple time"+count);

            myMethod();
        }

    }





    public static void countUp(int n){
        if (n==10){
            System.out.println("this is the last line of code that's going to be printed ");
        }else {
            System.out.println("the number is :"+n);
            n++;

            countUp(n);
        }
    }
}
