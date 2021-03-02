package ExceptionsInJava;

public class ThrowsKeyWordPractice {

    // Naveen automation video 29 java

    // there is a difference between throws keyword and throw new keyword in java

    // Throws key word should be used in the method , next to the method

    public static void main(String[] args)  {

        ThrowsKeyWordPractice object = new ThrowsKeyWordPractice();
        object.sum();

    }

    public void sum() {
        try {
            division();
        }catch (Throwable e){
            System.out.println("there is an exception");
        }

    }
    public void division() throws ArithmeticException{
        int i= 9/0;


    }
}
