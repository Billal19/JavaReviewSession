package Practice.try8;

public class StringExamples {

    public static void main(String[] args) {

        //1-length:
        String Greeting = " hello World how are you doing ";
        String Greeting1 = "HELLO_WORLD_HOW _RE_YOU_DOING";
        System.out.println(Greeting.length());
        //2-toUpperCase/toLowerCase;
        System.out.println(Greeting.toUpperCase());
        System.out.println(Greeting.toLowerCase());
        //3-IndexOf method():
        System.out.println(Greeting.indexOf("h"));
        System.out.println(Greeting.indexOf("are"));
        System.out.println(Greeting.indexOf("babe"));
        //4-IndexOf used in different ways:
        System.out.println(Greeting.indexOf("l",5));
        System.out.println(Greeting.indexOf("o",Greeting.indexOf("o")+1));
        //5-chartAt used to to find a character by referring to the index number:
        System.out.println(Greeting.charAt(4));
        //6-concatenation:
        System.out.println(Greeting+  "  " + Greeting1);
        System.out.println(Greeting.concat(Greeting1));
        //7-Comparison:
        System.out.println(Greeting.equals(Greeting1));// true or false;
        System.out.println(Greeting.equalsIgnoreCase(Greeting1));
        //8-trim:
        System.out.println(Greeting.trim());
        //9-Substring:
        System.out.println(Greeting.substring(0,6));
        //10-Replace :
        System.out.println(Greeting.replace(" ",""));
        //11-Split:

        String text [] = Greeting1.split("_");
        for (int i=0;i<text.length;i++){
            System.out.println(text[i]);
        }

        //12-Escape characters :

        //- \': single quote:
        System.out.println("hello World how \' are you doing");
        //- \'': double quote:
        System.out.println("hello World how \" are you doing");
        //- \\: one back slashes:
        System.out.println("hello World how \\ are you doing");
        //- \n; new lin e
        System.out.println("hello World how \n are you doing");
        //- \r; carriage return
        System.out.println("hello World how \r are you doing");
        //- \t: tab
        System.out.println("hello World how \t are you doing");
        //- \b; back space
        System.out.println("hello World how\b are you doing");





    }
}
