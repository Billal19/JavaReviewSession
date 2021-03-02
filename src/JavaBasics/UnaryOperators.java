package JavaBasics;

public class UnaryOperators {

    // There are two types of unary operators:
    // Increment operator:++
    // PreIncrement: ++a
    // PostIncrement:a++

    // Decrement operator ; --
    // PreDecrement operator ; --a
    // PostDecrement operator; a--

    public static void main(String[] args) {
        int number = 10;
        System.out.println(number);
        ++number;
        System.out.println(number);
        number++;
        System.out.println(number);
        --number;
        System.out.println(number);
        number--;
        System.out.println(number);


        // We will be trying another examples here :

        //1.Post increment ;
        int a = 3;
        int b = a++; // This is called post increment
        System.out.println(a); // the value of (a) will be incremented by 1 , the result will be (4)
        System.out.println(b); // the value of (a) will be given to (b)  without incrementing it since its a post increment, the result will be (3)

        //2.Pre increment ;

        int c = 10;
        int d = ++c; // this is called pre increment
        System.out.println(c); // the value of (c) will be incremented by 1 , the result will be (11)
        System.out.println(d); // the incremented value of (c) will be given to (d) since its a pre increment , the result will be (11)

        //3.Post decrement ;

        int e = 15;
        int f = e--; // this is called post decrement
        System.out.println(e); // the value of (e) will be decremented by 1 , the result will be (14)
        System.out.println(f); // the value of (e) will be given to (f) without decrementing it since its post decrement , the result will be (15)

        //4.Pre decrement ;

        int g = 30;
        int h = --g; // this is called pre decrement
        System.out.println(g); // the value of (g) will be decremented by 1, the result will be (29)
        System.out.println(h); // the decremented value of (g) will be given to (h) since its a pre decrement , the result will be (29)




    }
}
