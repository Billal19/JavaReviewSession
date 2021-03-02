package Practice.try7;

public class FinalReviewOfThrowNewKeyWord {

    public static void main(String[] args) {
        // throw new keyword is used to create a custom error , the throw statement works together with the exception types in java , as java has many exception types.
        // throw new Keyword coult be used in a try catch block as well as an if---else statement


        //1st example used in a try catch statement :
//        try {
//            int ages [] = {20,30,40,50};
//            System.out.println(ages[4]);
//        }catch (Exception e){
//            throw new ArrayIndexOutOfBoundsException("this is an out of bound exception ");
//            //e.printStackTrace(); // if we use the throw new keyword in a catch block , we will not be able to use the printStakeTrace as it becomes an unreachable statement
//        }


        checkAge(14);


    }

    // second example used in an if---else statement :
    public static void myMethod(){

        int a = 200;
        int b = 400;
        int division = b/a;

        if (division==300){
            System.out.println("this is the correct answer");
        }else {
            throw new ArithmeticException("do the calculations again to get a better answer");

        }
    }

    public static void checkAge(int age){
        if (age>=18){
            System.out.println("you are eligible to vote");
        }else {
            throw new ArithmeticException("you are not eligible to vote due to your age");
        }
    }
}
