package Practice.Recap1;

import java.util.Scanner;

public class TryCatchPractice {


    public static void main(String[] args) {


        // 1st example about the arrayList will be tried on an array concept
        try {
            String [] obj = {"hi","hello","good morning"};
            System.out.println(obj[5]);
        } catch (Exception e){ // this is called a generic Exception , any exception can be caught over here
            e.printStackTrace(); // the printStackTrace() IS USED TO STILL PRINT OUT THE EXCEPTION , SO THE USER STILL CAN SEE WHERE ERROR COMES FROM
            System.out.println(e.getMessage());
            System.out.println("Sorry you are trying to access an out of bound element");
        }
        finally {
            System.out.println(" the finally statement will be executed after the try and catch statement regardless of the results");
        }

        // 2nd example will be tried on a scanner concept :

        Scanner scanObject = new Scanner(System.in);
        System.out.println("how old are you ?");
        try{
            int firstName = scanObject.nextInt();
            System.out.println("i am " + firstName + " years old");
        }catch (Exception e){
            System.out.println("please enter a valid name , what you have entered is not a valid number , its a String value");
        }
        finally {
            System.out.println("this block of code will be executed regardless of the results ");
        }

        System.out.println("----------------------------");

        // we will be trying another type of exception here :
        try{
            String [] shoes = {"big","small"};
            System.out.println(shoes[2]);

        }catch (NullPointerException b){ // in here we specified the type of the exception we wanted to catch , if the error occurred in the try statement and it matched the catch statement ,
            // then it will print out whatever we have in print statement, but if the error doesn't match whatever we specified as an exception in the catch statement , then it will skip it and generate the matching statement
            System.out.println("the exception has been caught ");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("this is the matching exception , please be aware that your element is out of bound ");// we can use as many catch statements as we want,
            // if there is an error in the try statement , and that error did not match with the specified first catch statement , it will skip and go to the next catch statement to check if it matches
            // if none of the catch statement matches the error of try block , then java will generate an exception for this error .
        }
        finally {
            System.out.println("this block of code will be executed regardless of the try and catch results ");
            // The finally statement allows us to execute the block of code regardless of the results
        }

        // Important note : in the catch statement , we might catch not only exceptions , but we also can catch error , lets say that we don't have as specific exception to catch ,
        // so in this case , we will have to use the generic exception which is like this for example : catch ( Exception e ) , but we wanted to catch an error instead of an Exception ,
        // we will just have to write error , for example ; catch ( Error e) ==> this will not catch exceptions , it will  catch only errors.
        // but if we wanted to catch either ( Error or Exception or both ) we will have to write the super class Throwable like this : catch (Throwable e)
        // -Throwable class is the superclass of all errors and exceptions in the java language , it handles both of them, the parent class of the throwable class is the object Class








    }




}
