package Practice.Recap1;

public class TryCatch {

    public static void main(String[] args) {

        String cars [] = new String[3];
        cars[0]="ford";
        cars[1]="bmw";
        cars[2]="audi";



        try {
            System.out.println(cars[9]);

        }catch (StackOverflowError abc){
            System.out.println("we found a problem");
        }

        finally {
            System.out.println(" finally is going to be printed regardless of what happened above  ");
        }



    }
}
