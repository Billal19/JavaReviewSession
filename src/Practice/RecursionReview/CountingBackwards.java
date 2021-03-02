package Practice.RecursionReview;

public class CountingBackwards {

    public static void main(String[] args) {
        counting(15);


    }

    public static void counting(int b){
        if (b==0){
            System.out.println("this is the last line of code");
        }else {
            System.out.println("the number is :"+b);
            b--;
            counting(b);
        }

    }
}
