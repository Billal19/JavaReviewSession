package JavaBasics;

public class ArithmeticOperator {

    // The Arithmetic Operators are used to perform common mathematical operations ;
    // + (addition): adds two values together
    // - (subtraction) : subtracts one value from another
    // * (multiplication) : multiplies two value
    // / (division) : divides one value from another
    // % (modulus) : returns the division remainder

    public static void main(String[] args) {
        int number1 = 300;
        int number2 = 100;

        int digit1 = 3;
        int digit2 = 0;


        int addition = number1+number2;
        System.out.println("the addition result is :"+addition);

        int subtraction = number1-number2;
        System.out.println("the subtraction result is :"+subtraction);

        int multiplication = number1*number2;
        System.out.println("the multiplication result is :"+ multiplication);

        int division = number1/number2;
        System.out.println("the division result is :"+division);

        int modulus = number1%number2;
        System.out.println("the remainder of this division is :"+modulus);

        int modulus1= digit1%digit2;
        System.out.println("the remainder result is :" + modulus);
    }
}
