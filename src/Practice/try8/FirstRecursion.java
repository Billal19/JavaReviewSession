package Practice.try8;

public class FirstRecursion {



    static int MyCount =0;



    public static void myMethod(){
        MyCount++;
        if (MyCount<=10){
            System.out.println("this is the last line of code to be printed based on the given condition"+MyCount);

            myMethod();
        }


    }

    public static void main(String[] args) {
        myMethod();

    }
}
