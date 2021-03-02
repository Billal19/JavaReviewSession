package JavaBasics;


public class Variables {

    // The Variables are containers to store the Data values.
    // The syntax of variable is : Type VariableName = value ;
    // All Java variables must be identified with a unique names , they are called identifiers ,the identifiers can be short names like (x,y...) but its recommended to to use descriptive names like (age, sum, income..) in order to create understandable and maintainable codes
    // There are Two Types of variables :
    // 1. Global variables : they are also known as reference variables , its any variable declared inside of a class and outside of a method
    // 2. Local variable : they are variables declared outside of a class and inside of a method

    String streetName ; // This is a global variable , its only declared not initialized since it has no value
    String firstName="John"; // This is  Declared and initialized global variable ( its declared and given the value inside a class)
    final int age = 28 ; // same variable with different DataType




    // note :
    // If we declare a variable inside a class without initializing it (giving it a value ), it means that we have an intention of initializing it in a method
    // Because if we declare it inside a class in one line , and in another line we will try to initialize it , it will not work , it will throw an error,
    // However if the variable is declared inside a method (local variable) in one line, and in another line we wanted to initialize it , it will perfectly work fine without throwing errors .

    public void LocalVariables(){ // we created this method to declare some local variables

        int TvSize=42 ; // This is a local variable because its declared inside a method
        firstName= "Steve";// The benefits of global variables is that they can be used anywhere outside of the class where they were initially declared
        System.out.println(firstName);// knowing that fistName was already existed with its value , since its not a final variable , it will overwrite the existing value
        streetName = "FashionStreet"; // After we declare a global variable , we can initialize it in any method without declaring it again , also we can change the value if we want to.( means if we assign a new value to an existing variable , it will overwrite the previous value )
                                      // There is no need of using the DataType again if the variable was Global , we only can use the name of the variable  and give it a value.
        final int shoeSize =8; // this is called a final variable , if you don't want others or yourself to overwrite the existing value , " the keyword final" will declare the variable as"final" or " constant" which means unchangeable , read only.
        //ShoeSize=9; in here i tried to change the value , but it threw an error since the existing variable is final
        System.out.println(shoeSize);

        int  grade = 7 , weight = 120, score = 1 ; // in here we declared multiple variable of the same DataType, all we have to do is using comma-separated list;
        System.out.println(grade+" ,"+weight+ ","+score);
        System.out.println(age);






    }

    public static void main(String[] args) {

        Variables object = new Variables(); // we created an object to call the method and execute the codes
        object.LocalVariables(); // the method has been called to print whatever statement we wanted to display in the screen


    }


}
