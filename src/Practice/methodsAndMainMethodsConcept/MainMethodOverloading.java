package Practice.methodsAndMainMethodsConcept;

public class MainMethodOverloading {

    // Previously we learned that method overloading occurs when we have multiple methods with the same name and different parameters
    // 1- The main method can be overloaded , we just have to pass different parameters ( same name and different parameters)
    // 2- After executing this program of the main method overloading , the JVM will search for the original main method to be executed.
    //  - The JVM will look for the main method which is public static with its specific signature ( String[]args).
    // 3- after executing this program , jvm will call only the first method which is the main method .
    // 4- In order for us to call the other overloaded main methods , we will have to call them from the original main method

    public static void main(String [] args) { // this is the main method which is the starting execution point of the program , it is required at every java program ,
        // the main method always comes with the string array parameter inside the parentheses ( String [] args)
        System.out.println("this is the main method  1");
        main("Success");
        main(10);
        main(10,30);

    }

    public static void main(String args){ // we overloaded the main method here with different parameters , instead of the string array which is the original signature of the main method  , we passed a regular string parameter.
        System.out.println("this is the overloaded main method 2      :"+args);
    }

    public static void main(int a ) { // main method overloaded with same name and different parameters ( one integer parameter)
        System.out.println("this is the overloaded main method 3      :"+a);
    }

    public static void main(int a, int b){ // main method overloaded with same name and different parameters ( two integer parameter parameters)
        System.out.println("this is the overloaded main method 4      :"+a+"  ,  "+b);
    }
}
