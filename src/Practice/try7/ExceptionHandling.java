package Practice.try7;

import java.util.Scanner;

public class ExceptionHandling {


    public static void main(String[] args) {

        int obj [] = new int[3];
        obj[0]= 10;
        obj[1]= 11;
        obj[2]= 12;

        try {
            System.out.println(obj[4]);
        }catch (Exception e){ // this is a generic exception
            System.out.println("this supposed to be an ArrayIndexOutOfBoundException");
        }



        String names [] = null;
        try {
            System.out.println(names[1]);

        } catch (NullPointerException A){ // this is a non generic exception
            System.out.println("we caught an exception");
        }
        catch (ArrayIndexOutOfBoundsException B){
            System.out.println("this is an array index out of bound exception");
        }

        Scanner myObj = new Scanner(System.in);
        System.out.println("whats the status of the news");
        try {
            boolean news = myObj.nextBoolean();
            System.out.println(" the news is : "+news);
        }catch (Exception e ){
            e.printStackTrace();
            System.out.println("this is not a valid boolean value ");
        }



        double size [] = { 7.5, 7.7 , 446,76};

        try {
            System.out.println(size[4]);
        } catch (Throwable C){

            System.out.println("this is an exception not an error");
        }



    }
}
