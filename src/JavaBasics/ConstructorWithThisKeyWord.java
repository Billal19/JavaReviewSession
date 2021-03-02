package JavaBasics;

public class ConstructorWithThisKeyWord {

    // what is the definition of "This" keyword; this keyword refers to current object in a method or a constructor.
    // The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).


    // Class variables (global variables): in this example we are going to create a parameterized constructor and pass into it same variable names as the global ones.
    // if we wanted to initialize the global variables inside the constructor , since the name of the variables is the same , we will have to use "this" keyword
    // important note :Constrictors are also used to initialize the class variables (global variables ) by using the keyword "this", if the variable names inside the constructor are the same as the global variables
    // we will have to created a parameterized constructor(constructor with local variable in it) and use the keyword "this" to initialize the global variables .

    String name ;
    int age ;

    public ConstructorWithThisKeyWord(String name, int age){
        this.name= name; // this.class(Global)Variable = local variable
        this.age=age;
//        name = name1; // if the local variable names are not the same as the global variable names , then we can initialize the global variables like this.
//        age = age1;
//        name = name; // if we try to initialize the global variables without using "this" keyword , the global variables will not be initialized , java will not consider this. only the local variables will be initialized
//        age = age;

        System.out.println("my name is :"+name);
        System.out.println("my age is "+age);
    }

    public static void main(String[] args) {
        ConstructorWithThisKeyWord object = new ConstructorWithThisKeyWord("Billal",29);


        // i used this print statement here just to see if the global were initialized , its just a an additional note for me ,
        // otherwise i don't need this statement , because all my outputs will be printed from from the print statements i used inside the constructor

        System.out.println(object.name); // in this statement , i tried to print out the values of my global variables to see if they were actually initialized from the constructor .( its just a test for me)
        System.out.println(object.age);

    }
}
