package Practice.Recap1;

public class Unary {

    public static void main(String[] args) {

        int value = 100;
        value++;
        System.out.println(value);
        ++value;
        System.out.println(value);
        value--;
        System.out.println(value);
        --value;
        System.out.println(value);


        System.out.println("--------------------------");

        // we will be trying another example here :

        // post increment;
        int a= 10;
        int b= a++;
        System.out.println(a);//11
        System.out.println(b);//10

        // pre increment:
        int c = 12;
        int d = ++c;
        System.out.println(c);//13
        System.out.println(d);//13

        // post decrement;
        int e=20;
        int f=e--;
        System.out.println(e);//19
        System.out.println(f);//20

        // pre decrement;
        int g = 54;
        int h = --g;
        System.out.println(g);// 53
        System.out.println(h);// 53



    }
}
