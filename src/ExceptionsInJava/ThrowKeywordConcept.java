package ExceptionsInJava;

import org.w3c.dom.ls.LSOutput;

public class ThrowKeywordConcept {

    //Throw key word , is used to create a custom error , the throw statement is used with exception type ,as java has many exception types such as ; ArithmeticException, FileNotFoundException.....etc
    //Throw key word ,  can be used with the try---catch block , or with the if----else statement

    public static void main(String[] args) {

        ThrowKeywordConcept hi = new ThrowKeywordConcept();
        ThrowMethod();
        checkAge(20);
        checkAge(17);

        try {
            String [] array1 = {"1,3,5,90"};
            System.out.println(array1[4]);

        }catch (Exception e){
            throw new ArrayIndexOutOfBoundsException("THE 4TH ELEMENT IS OUT OF BOUND ");
            //e.printStackTrace(); // this printStackTrace is used to still print out the red exceptions even after we handled it, but in this case we can not use it(it became an unreachable statement) since we had the throw new keyword in place
        }

    }

    public static void ThrowMethod (){

        int a = 400;
        int b = 200;
        int division = a/b;

        if (division==2){
            System.out.println("correct");
        }else{
            throw new ArithmeticException("this is incorrect try again later ");
        }


        System.out.println("********************************");

    }



    public static void checkAge(int age){ // we pass parameters to this method , so it will be easier for us the and run other tests when we call this method from the main method

        if (age<18){
            throw new ArithmeticException("Access denied ===> due to the age limit ");

        }else{
            System.out.println("Access granted , you are old enough");
        }


        System.out.println("*********************************");
    }










}
