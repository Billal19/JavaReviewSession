package ExceptionsInJava;


public class ExceptionHandling {

    // A-We have 3 ways to handle exceptions in java :
    // 1- Try -- catch block
    // 2- Throws keyword
    // 3- throw new key word

    int a = 10;

    public static void main(String[] args)  {

        // Uncaught exception :
        //int i = 9/0;
        //System.out.println(i); // this is not showing error , but it will throw an exception after we execute it because in java we can not divide any number by 0, so this will be an ArithmeticException

        // caught exception ; means that we will get to know that there is an error(an exception will be thrown) before the execution  ,
        //Thread.sleep(2000); // in here if we mouseover the word with the red underline , we will see few suggestions on how to handle this errors before the execution .

//        ExceptionHandling object = new ExceptionHandling();
//        object=null;
//        System.out.println(object.a); // this is going to be an exception called "NullPointerException" because we created an object at first , then we referred it to null , this is called reference cancellation

        // there are 3 ways on how to handle exceptions :
        // 1. try ---catch block :

        try {
            int i = 9/0; // this will be an exception
            System.out.println(i);
        }catch (ArithmeticException e){// in the catch statement we handled the exception
            e.printStackTrace(); // the printStackTrace method is used to still print out the exception that's going to be thrown so the user will know where the exception comes from .
            System.out.println(e.getMessage());



            System.out.println("ArithmeticException has been thrown , because we can not divide numbers by 0 ");
        }






    }


}
