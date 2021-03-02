package Practice.RecursionReview;

public class Computer {


    public static void main(String[] args) {
        computerSeries(5);

    }

    public static void computerSeries (int a){
        if (a==10){
            System.out.println("we don't have a ne series yet ");
        }else{
            System.out.println("this is series number :"+a);
            a++;

            computerSeries(a);
        }

    }
}
