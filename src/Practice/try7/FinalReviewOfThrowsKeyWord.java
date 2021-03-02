package Practice.try7;

public class FinalReviewOfThrowsKeyWord {

    public static void main(String[] args) {


        try {
            Division();
            System.out.println();

        }catch (Throwable e){
            System.out.println("an exception has been caught by the method");
        }

    }



    public static void Division(){
         int a = 9/0;
        System.out.println(a);
    }
}
