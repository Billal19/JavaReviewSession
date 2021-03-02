package JavaBasics;

public class ConditionalOperators {

    // Conditional operators also know as logical operators ; they are used to determine the logic between variables or values
    // && ; this operator means "and", it returns true if both statements are true
    // || ; this operator means "or" , it returns true if  one of the statement is true
    // ! ; this operator means Not , it reverse the result , returns false if the result is true

    public static void main(String[] args) {

        int value1 = 100;
        int value2 = 200;

        if (value1==200 && value2==200){ // in here we used the and operator (&&)
            System.out.println("Both values are incorrect");
        }else{
            System.out.println("the value1==100, the value2==200");
        }

        if (value1==300 || value2==200){ // in here we stated one wrong variable and one correct variable and used the OR operator (||).
            System.out.println(" one of the statement is matched ");
        }else{
            System.out.println("none of the statements matched");
        }


    }

}
