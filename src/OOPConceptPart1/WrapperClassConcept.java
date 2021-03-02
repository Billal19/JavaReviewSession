package OOPConceptPart1;

public class WrapperClassConcept {

    // Wrapper Classes in Java; all the primitive DataTypes have corresponding wrapper Classes , they all start with an upper case ; Integer, Byte, Long, Short, Char, Double, Float, Boolean.
    //

    public static void main(String[] args) {
        String x = "100";
        System.out.println(x+20); // the output here will be 10020, its not going to do the addition because "100" is between the double quote which makes it a String.

        // Data Conversion ; String to Int;
        int i = Integer.parseInt(x); // Integer here is a wrapper class that we used to convert the String to integer
        System.out.println(i);
        System.out.println(i+20); // in here the output will be an addition because we converted the string dataType into an integer using the Integer class wrapper.


        // Data Conversion ; String to Double ;
        String a=" 12.33";
        double b = Double.parseDouble(a);
        System.out.println(b+10);

        // Data Conversion ; String to boolean ;
        String c ="true";
        boolean d = Boolean.parseBoolean(c);
        System.out.println(d);

        // Data Conversion ; int to String;
        int j = 200;
        System.out.println(j+20);
        String s = String.valueOf(j); // this is the method we should use to convert integer to a String
        System.out.println(s+20); // using the string value to determine if the integer value was converted to a string , if the output will not be an addition , then the conversion was successful.


        //

        String u = "100A";
        int z = Integer.parseInt(u);
        System.out.println(z); // since our string doesn't only contain numbers , it has letters as well, after completing the conversion from the string to integer,
                               // then we will try to print out the conversion result , the system will throw an exception " NumberFormatException"
                               // Because the String value we tried to convert is not a fair integer value





    }
}
