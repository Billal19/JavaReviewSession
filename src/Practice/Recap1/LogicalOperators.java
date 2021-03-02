package Practice.Recap1;

public class LogicalOperators {

    public static void main(String[] args) {

        int a = 100;
        int b = 300;
        int c = 700;

        if(a>b && b>c){
            System.out.println("the values are incorrect ");
        }else{
            System.out.println("c is the greatest number");
        }


        if (a>b || c>b){
            System.out.println("one of the statement is correct ");
        }else{
            System.out.println("both statement are incorrect");
        }
    }
}
