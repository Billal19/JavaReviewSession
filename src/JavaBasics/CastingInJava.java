package JavaBasics;

public class CastingInJava {

    // what is casting in java: Casting is when we convert a DataType to another DataType , in other words casting is when assign a value of a primitive DataType to another DataType with different size
    // there are two 2 types of casting in java :
    // 1.Implicit casting ( Widening casting ): implicit casting happens automatically, is when we convert a smaller DataType to a larger DataType without losing any Data.
    //  byte => short => char => int => long => float => double : its basically when we convert a dataType from the one with a smaller size to the one with the larger size .
    // 2. Explicit casting (Narrowing casting ) : the explicit casting does not happen automatically , it must be done manually by the programmers , when converting a larger dataType to a smaller DataType
    // double => float => long => int => char => short => byte : narrowing or Explicit casting is done by placing the dataType between the parentheses before the value.

    public static void main(String[] args) {

        // Example of Implicit casting (Widening Casting) :
        float abc = 1928653; // in here i stored an integer value inside a float DataType without losing any data ,
        // simply because the range of a float is wider then an integer , the conversion happens automatically
        System.out.println(abc);

        double num = 2.4235674f; // in here i stored an float value inside a double DataType without losing any data ,
        // simply because the range of a double is wider then an float , the conversion happens automatically
        System.out.println(num);

        short num1 = -128; // in here i stored an byte value inside a short DataType without losing any data ,
        // simply because the range of a short is wider then a byte , the conversion happens automatically
        System.out.println(num1);


        // Example of Explicit Casting (Narrowing casting) ;
        //float variable1 = 1.987654328765438; // if we only leave the variable like this without putting the dataType between the parentheses   , it will be an error because this a narrowing casting it should be done manually.

        float variable1 = (float) 1.987654328765438; // when we print this out we will lose some data, the output will be 1.9876543
        System.out.println(variable1);

        long variable2 = (long) 2.7654638f; // we will be losing the some data , the output will be 2
        System.out.println(variable2);

        int variable3 = (int) 4455.87;// we will be losing the some data, the output will be 4455
        System.out.println(variable3);


        //Take a look a this example of math :
        // we know that every arithmetic operator should be applied between values of the same dataType .
        double addition = 4.5 + 9; // in this example it looks like we have a double value as well as an integer value , but we did not see any error ,
        // the reason of not seeing an error here is because the implicit casting will take place , and convert the the number 9 which is an integer value to a double value
        // the implicit casting will happen automatically and the number 9 will be casted to 9.0
        // the calculation will be done like this : 4.5+9.0 and the output will be 13.5
        System.out.println(addition);




    }


}
