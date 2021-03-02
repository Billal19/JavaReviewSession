package OOPConceptPart1;

public class MethodOverloading {
    // What is method overloading : with method overloading , multiple methods can have the same name with different arguments or parameters

    // Additional notes ;
    // 1-we can not create a method inside a method
    // 2-we can create methods with same names and same number of parameters as long as the DataType is different .
    // 3-Duplicate methods ; means same name, same number of parameters , same DataType , this is not allowed .


    // This class shows what polymorphism overloading methods are all about :
    // As we know polymorphism in Java in concept by which we can perform a single action in different ways .
    // Method overloading is having the same method with different parameters or signatures.
    // Method overloading is compile-time Polymorphism , that's why its called Static binding.
    // Method overloading is implemented in a single class like the calculator example .
    // Method overloading DOES NOT need the concept of inheritance.
    // Method name should be the same , and the parameters are different .
    // Return type might be different
    // Static methods can be overloaded
    // This binding is called EARLY BINDING because its a compile-time , it happens first


    public static void main(String[] args) {

        MethodOverloading object = new MethodOverloading();
        object.multiplication();
        object.multiplication(40);
        object.multiplication(60,40);
        object.multiplication(12.38);
    }

    public void multiplication (){
        System.out.println("this a method without parameters ");
    }

    public void multiplication(int num1){
        int firstNumber = num1;
        System.out.println(firstNumber);
    }

    public void multiplication(double number1){
        double newNumber = number1;
        System.out.println(newNumber);
    }

    public void multiplication(int num1, int num2){
        int FirstNumber= num1;
        int SecondNumber= num2;
        int result = FirstNumber*SecondNumber;
        System.out.println(result);
    }
}
