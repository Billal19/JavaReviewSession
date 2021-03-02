package JavaBasics;

public class ComparisonOperators {

    public static void main(String[] args) {

        // Comparison operators are used to compare two values, they are also known as equality and relational operators : down below is the list of the operators
        // == Equality
        // != Not Equal
        // > Greater than
        // >= Greater than or equal
        // < Less than
        // <= Less than or equal

        int a = 40;
        int b = 40;

        if (a==b){
            System.out.println("a and b are equal");

        }else{
            System.out.println("a and b are not equal");
        }

        // Write a logic to find out the highest number among the given variables ;

        int a1 = 100;
        int b1 = 200;
        int c1 = 300;

        // in here in order find out the highest number , we will need to Nested if-else

        if(a1>b1 && a1>c1){ // false & false = false
            System.out.println( "a1 is the greatest");
        }
        else if (b1>a1 && b1>c1){
            System.out.println("b1 is the greatest ");
        }else{
            System.out.println("c1 is the greatest");
        }


    }
}
