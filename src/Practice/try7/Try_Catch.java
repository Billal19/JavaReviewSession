package Practice.try7;

public class Try_Catch {


    public static void main(String[] args) {

        String names [] = new String[3];
        names[0]="John";
        names[1]="Steve";
        names[2]="Mike";

        try {
            System.out.println(names[4]);// this will definitely throw an array index out of bound exception
        }catch (Exception e){
            //e.printStackTrace(); // this will print out the exception message
            System.out.println("an error occurred, this might be fixed ");
        }
        finally {
            System.out.println("this is will be printed regardless of the result");
        }



    }
}
