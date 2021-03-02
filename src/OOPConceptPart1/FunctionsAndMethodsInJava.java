package OOPConceptPart1;

public class FunctionsAndMethodsInJava {

    // A/- The definition of a Method : A method is a block of code which only runs when it is called, we can pass data known as parameters into a method .
    // Methods are used to perform certain actions, methods are also known as functions ,
    // Why we use methods : we use methods to reuse the code , meaning we define the code once and use it many times.

    // B/- How to create a method in java: A method must be declared within a class , its defined by a method name followed by the parentheses() and semi column ;
    // Java provides some predefined methods such as " System.out.println(); ", but we always can create our own methods to perform certain actions.

    // C- Method Types ; in java there are two types of methods ; return type and non return type methods
    // C-1; Return type methods ; this contains 2 types;
        // - Non parametrized return type method
        // - Parametrized return type method
        // The syntax of Return type method is : AccessModifier ReturnDataType MethodName (); {the block of code }
    // C-2; Non Return type method ; this also contains 2 types;
        // - Non parametrized non return type method
        // - Parametrized non return type method
        // The syntax of NonReturn type method is : AccessModifier void MethodName (); {the block of code }




    public static void main(String[] args) {

        // As we all know that in order to call methods in java we only have to write the method's name that we wanted to call inside the main method followed by two parentheses () and a semicolon;
        // But the methods have to be static in order to be called directly from the main method by using the method's name followed by semi column ;
        // If the methods are not static , then we will have to create objects inside the main methods , and use those objects to call the non static methods.
        // After creating an object , a copy of none static methods will be given to the object


        FunctionsAndMethodsInJava objectName = new FunctionsAndMethodsInJava(); // the object has been created to call the non static methods
        objectName.myAddition();
        objectName.doDivision(50,20);
        objectName.doMultiplication();
        objectName.doSubtraction(100,20);

    }

    public void myMethod (){
        System.out.println("test method");
    }


    //A1- Example of Non parameterized Return Type method(Non Static) ; in this method the return type will be an integer.

    public int myAddition(){ // no input but there are some outputs
        System.out.println("newTest Method");
        int a1 = 10;
        int b2 = 20;
        int c2 = a1+b2;

        System.out.println("The addition of these two variables is :"+c2);

        return c2 ;
    }

    //A2- Example of parameterized Return Type method (Non static ); in this method the return type will be an integer

    public int doDivision (int firstNum, int SecondNum){
        int number1= firstNum;
        int number2= SecondNum;
        int Division = number1/number2; // or we can write it like this also: int Division = firstNum/secondNumber

        System.out.println("The division result is :"+Division);
        return Division;
    }

    // B1 Example of Non parameterized Non return type methods ; in this methods there is no return type because void does not return a value

    public void doMultiplication(){
        int num1=20;
        int num2=40;
        int multiplication = num1*num2;

        System.out.println("the multiplication result is :"+multiplication);
    }

    //B2 Example of parameterized Non return type methods; in this methods there is no return type because void does not return a value

    public void doSubtraction (int Num1, int Num2){
        int number1= Num1;
        int number2= Num2;
        int subtraction= number1-number2;

        System.out.println("the subtraction result is :"+subtraction);
    }









}
