package Practice.try8;

public class ThrowNew {

    public static void main(String[] args) {
        //theMethod();
        //theSecondMethod();
        CheckAgeMethod(17);

    }


    public static void theMethod(){

        try {
            int numbers []= {10,20,30,40};
            System.out.println(numbers[5]);
        }catch (Exception e){
            throw new ArrayIndexOutOfBoundsException("We only have 3 indexes , the 5th one doesn't exist");

        }
    }


    public static void theSecondMethod(){

        int a = 200;
        int b = 300;
        int c = a+b;

        if (c==400){
            System.out.println("this is the right answer");
        }else{
            throw new ArithmeticException("the addition is 500");
        }
    }


    public static void CheckAgeMethod(int age){
        if (age>18){
            System.out.println("you are eligible to vote");
        }else
        {
            throw new ArithmeticException("you are not eligible to vote due to the age limit");
        }

    }


}
