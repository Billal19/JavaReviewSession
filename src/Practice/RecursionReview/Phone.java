package Practice.RecursionReview;

public class Phone {

    static int count = 0;

    public static void main(String[] args) {
        phoneEdition();

    }

    public static void phoneEdition(){
        count++;
        if (count<=10){
            System.out.println(count);
            phoneEdition();
        }
    }
}
