package Practice.Recap1;

public class OverloadingMainMethod {

    public static void main(String[] args) {
        System.out.println("this is the main method");
        main("Big win ");
        main(20,23.76);
    }

    public static void main (String args){
        System.out.println("this is the 1st overloaded main method with one parameter===>: "+args);
    }

    public static void main (int age , double price){
        System.out.println("this is the 2nd overloaded main method with two parameters===>: "+age+" "+price );
    }
}
