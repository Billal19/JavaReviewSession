package Practice.Recap1;

public class Wrappers {

    public static void main(String[] args) {
        String value1 = "200";
        System.out.println(value1+20); // the output will be 20020, the addition will not be performed because the value1 is not an integer value , its a string value since its between the double quotes

        // we can convert the values by using the wrapper classes ;
        //1. convert from A string to an integer:
        int a = Integer.parseInt(value1); // this is the method we use to convert from a string to an integer.
        System.out.println(a+20); // the output will be the result of an addition



        // 2. convert from a string to a double:
        String value2 ="34.87";
        System.out.println(value2+40); // the output will be 34.8740 , the addition can not be performed because the value2 is not a double value , its a string value since its between the double quotes.
        double b = Double.parseDouble(value2); // this is the method we use to convert from a string to a double.
        System.out.println(b+40);// the output will be the result of an addition

        // 3. convert from an integer to a String :
        int value3= 400;
        System.out.println(value3+200); // the output will be the result of an addition.
        String c = String.valueOf(value3);
        System.out.println(c+200);// after we converted our value from an integer value to a string value , the output will not be an addition result

        //4. convert from a String to an integer :
        String value4= "500f";
        System.out.println(value4+20); // the output will be 500f20, the addition will not be performed because the value4 is not an integer value , its a string value since its between the double quotes
        int d = Integer.parseInt(value4); // after running this program thew output will be an exception thrown ( NumberFormatException) the reason is because we are trying to convert a non valid integer value from a string to an integer.
        // in other words the value4 contains letter that can not be used as an integer value



    }
}
