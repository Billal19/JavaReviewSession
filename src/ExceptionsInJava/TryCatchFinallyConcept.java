package ExceptionsInJava;

import java.util.Scanner;

public class TryCatchFinallyConcept {

    public static void main(String[] args) {

        try {

            int [] object ={ 10,43,87,12};
            System.out.println(object[4]); // the 4th  index is out of bound , so java will throw an exception " ArrayIndexOutOfBound " .
            // we used the Try.....catch statement in here to try the first block of code , if any error occurs ,
            // then the catch statement will allow us to define the block of code to be executed

        } catch (Exception e){ // In the catch statement we can write (Exception) with any reference we want , this is called generic exception, also we can use Throwable , look at the last note in the program to understand throwable
            System.out.println("An exception occurred ! "); // this is the block of code to be executed if an error occurred in the "try" statement

        }
        finally {
            System.out.println("The try......catch is completed"); // the finally statement lets us execute our code after the try---catch statements regardless of the results
        }

        System.out.println("------------------------------");


        Scanner scanObj = new Scanner(System.in);
        System.out.println("what is your favorite number?");

        try {
            int a = scanObj.nextInt();
            System.out.println(a);

        }catch (Exception A){
            System.out.println("Sorry,Please enter a valid integer value !");
        }
        finally {
            System.out.println("so far so good ");
        }

        System.out.println("-------------------------------");

        // We are trying another type of exception here (Specific exception):

        try {

            String [] shoes = null; // we created an empty array
            System.out.println(shoes[2]); // we are trying to print out values of the 2nd index , this will throw an exception because our array is empty

        }catch (NullPointerException e){ // in here instead of catching any exception or(generic exception), the catch statement will catch a specific exception .
            System.out.println("Your Array Is Null , Please Pass Values Into It "); // this block of code will be printed if the catch statement actually caught the specific statement we put in it , otherwise it will throw a different exception

        }catch (ArrayIndexOutOfBoundsException e){ // we can use as many catch statements as we want, for example if we change our array and pass 2 elements into it
            // and then we will try to access the 4th element , then an outOfBoundException will be thrown , automatically the previous exception(NullPointerException) will be skipped
            System.out.println("Something else went wrong ");
            // Note: in the catch block we also can use the Throw new keyword to print a custom error (its optional) , instead using print statement alone
        }

        finally {
            System.out.println("The try-------catch------finally Statements are very well understood from the above example ");
        }

        // Important note : in the catch statement , we might catch not only exceptions , but we also can catch error , lets say that we don't have a specific exception to catch ,
        // so in this case , we will have to use the generic exception which is like this for example : catch ( Exception e ) , but we wanted to catch an error instead of an Exception ,
        // we will just have to write error , for example ; catch ( Error e) ==> this will not catch exceptions , it will  catch only errors.
        // but if we wanted to catch either ( Error or Exception or both ) we will have to write the super class Throwable like this : catch (Throwable e)
        // -Throwable class is the superclass of all errors and exceptions in the java language , it handles both of them, the parent class of the throwable class is the object Class




    }
}
