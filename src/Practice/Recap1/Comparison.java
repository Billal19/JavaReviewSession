package Practice.Recap1;

public class Comparison {

    public static void main(String[] args) {

        int a = 30;
        int b = 70;

        if(a<b){
            System.out.println("yes the value b is greater then a");
        }else{
            System.out.println("the values must be equal");
        }


        // right a logic to find the highest number among these variables :
        int c =30;
        int d =56;
        int e =13;

        if(c>d && c>e){
            System.out.println("c is the highest number");
        }
        else if(d>e && d>c){
            System.out.println("d is the highest number");
        }else{
            System.out.println("The value E is the highest number");
        }

    }
}
