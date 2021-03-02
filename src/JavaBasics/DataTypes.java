package JavaBasics;

public class DataTypes {

    public static void main(String[] args) {

        // Data types are divided into two groups; Primitive & non Primitive
        // A/-Primitive DataTypes; A primitive data type specifies the size and type of variable values, and it has no additional methods,
        // we have 8 types of Primitive Data Types ; Int, short, long, byte, char , double , boolean, float
        // The primitive DataTypes are divided into two group ;
        // 1.Integer Types : stores whole numbers , positive or negative , without decimals , the valid types are ; int , short , long , byte
        // 2.Floating point types; represents numbers with fractional parts, it contains one or more decimals , there are two types ; float( stores 6 to 7 decimals) , double(sufficient for storing 15 decimals)

        // B/.Non Primitive DateTypes ; uch as String, Arrays and Classes they called are reference types because they refer to objects.

        // The main difference between primitive and non-primitive data types are:
        // 1.Primitive data types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
        // 2.Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
        // 3.A primitive type has always a value, while non-primitive types can be null.
        // 4.A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
        // 5.The size of a primitive type depends on the data type, while non-primitive types have all the same size.


        // Examples of Primitive DataTypes;

        // 1.int; the size is 4 bytes(stores whole numbers from 2147483648 to 2147483647)
        int number = 127;

        //2. byte; the size is 1 byte (stores whole numbers from -127 to 128)
        byte age = 28 ;

        // 3.short ; the size is 2 bytes (stores whole numbers from -32768 to 32767)
        short income = 25000;

        // 4.long; the size is 8 bytes (stores whole numbers from 9223372036854775808 to 9223372036854775807 )
        long distance = 3000;

        // 5. Char ; the size is 2 bytes (for char it only allows the storing of 1 character with single quote )
        char gender = 'm';

        // 6.boolean ; the size is 1 bit ( stores true or fals values )
        boolean Hiring = true;

        // 7.float ; the size is 4 bytes (stores numbers with fractional parts, sufficient for storing  6 to 7 decimals )
        float salary = 42000.50f;

        // 8.double; the size is 8 bytes ( stores numbers with fractional parts , sufficient for storing 15 decimals)
        double  average = 400300.1234d;

        // Example of Non-Primitive DataTypes ;

        String phoneNumber="1234567890"; // Any value that's inside a double quote is automatically a string


        System.out.println(age);
        System.out.println(average);
        System.out.println(phoneNumber);


    }








}
