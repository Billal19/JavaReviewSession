package RecursionAndFactorialNumbers;

public class RecursionConcept {

    // Recursion : is a process in which a method calls itself continuously.
    // Recursion is when a method calls inside of itself , but when we call a method inside of itself , it will repeat infinitely many times and the computer may not be able to handle that , so the recursion method needs to know when to stop , that's why we use the base case
    // the purpose of using recursion is to avoid creating different method that uses the memory
    // THE 3 important things in recursion are;
    //- must call itself
    //- must has a base case (this means having at lease one code in our statement to be printed , otherwise we wont see any output)
    //- must change its state and move towards the base case




    static int count = 0; // we declared this variable to control the printed lines of code




    public static void myMethod (){
        count++; // we had to incremented the variable , so the number of times our code will be printed is controlled and limited

        if (count<=10){ // this is the base which the most important in a recursion

            System.out.println("we need to print out this line of code multiple times"+count);

            myMethod(); // the method called itself

        }



    }

    public static void main(String[] args) {
        myMethod(); // we called the method from the main method

    }

}
