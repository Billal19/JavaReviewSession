package Practice.Recap1;

public class ThrowStatementPractice {

    public static void main(String[] args) {
        checkAge(17);


        // To use the throw key word that creates a custom error , we can use it on try catch statement , as well as the if---else statement


        try{
            String [] cars = {"mustang", " camry", " honda"};
            System.out.println(cars[1]);
        } catch (Exception e){
            throw new ArrayIndexOutOfBoundsException ("there is no 4th element");

        }


        int a =200;
        int b =300;
        int addition = a+b;

        if(addition==400){
            System.out.println(" yes this is the actual result of the addition : 500");
            throw new ArithmeticException("the addition is not done properly , the result should be 500");
        }
        else {
            throw new ArithmeticException("the addition is not done properly , the result should be 500");
        }

    }


    public static void checkAge(int age){


        if (age <18){
            throw new ArithmeticException("sorry you are too young to access club , the required age is 18 and over");

        }else {
            System.out.println(" access granted , you are old enough to access the club ");
        }
    }

}
