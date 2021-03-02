package JavaBasics;

public class JavaIntro {

    // Every line of code that runs in java must be inside of a class , in our example the class name is JavaIntro
    // A class should always start with an upper case letter
    // As we all know that java is case sensitive language , so " JavaIntro " and " javaintro " has different meaning
    // The name of the java file must match the class name , when we save the file , it should be saved using the class name and add ".java" to the end of the file name

   public static void main(String [] args ){
       // this is the main method, whatever is written between the main method's curly braces is called the body of the main method
       // the main method is required in every java program in order for us to execute our java codes. the main method in java called A starting execution point of the program
       // we can change the main method's name only from the JDK configuration option, 99% of the time, the main method name never gets changed
       // the curly braces {} mark the beginning and the end of a block of code
       // Each statement code must end with the semicolon ;

       System.out.println(" Print Our First Executed Java Program "); // this is called a print statement , it will print out the line of text to the screen


       // Note ; Comments can be used to explain Java codes , and make it more readable , it can also be used to prevent execution when testing alternative code.
       // Single - line comments start will two forward slashes (//). any text written after the forward slashes (//) will be ignored by Java . it will not be executed.
       // Multi - line comments start with /* and end with */ , Any text that was written between /* and */ will be ignored by java



   }
}
