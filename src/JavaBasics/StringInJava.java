package JavaBasics;

public class StringInJava {

    int abc = 20;


    public static void main(String[] args) {

        // 1)-the length of a string : to find how many characters a string text holds , we will have to use the length() method.
        String alphabet1 = "abcdefgh";
        System.out.println(alphabet1.length());

        String alphabet = "ABCDEFGH"; // if we leave a space between this letters , the white space will be counted as well
        System.out.println("we stored "+alphabet.length()+" "+"in this this string variable");

        // 2)-The toLowerCase() and toUpperCase() methods in a string ; they are used to convert the string value to a either lower case or upper case
        String greeting = " Good Morning People";
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());


        // 3)-Finding characters and their positions : we will be using the indexOf() method
        //   The indexOf() method returns the index or the position of first occurrence of a specified text , letter , character in a string (including whitespace)
        //   Knowing that Java counts positions from 0 , 0 is the first element

        String newGreeting = " good morning america , the show is about to start ";
        System.out.println(newGreeting.indexOf("a")); // this method will print out the position of the first occurrence or appearance of the letter "a"
        System.out.println(newGreeting.indexOf("morning")); // same thing , this method will print the position of the first letter of this word "morning"
        System.out.println(newGreeting.indexOf("babe"));// the value babe is not available to get its index , so the system will return (-1) as an output

        // As we know that that indexOf() method will return the position of the first appearance or occurrence of a specified letter , text ,character in a string (including whitespace)
        // but if our string value has multiple same characters or text or letters , and we wanted to look for the position of the second or the third ... occurrence of a specified letter , then we will have
        // to use this different indexOf( char, fromIndex) method.
        System.out.println(newGreeting.indexOf("a",15)); // in this example i've instructed the index() method to start counting from the 15th index , in this case the previous appearance of the letter 'a' will not be counted.
        System.out.println(newGreeting.indexOf("a",newGreeting.indexOf("a")+1)); // if we write the  code like this , the system will be instructed to return the position of the very next occurrence of the letter 'a'.







        // 4)-Finding a character in a string by referring to the index number :
        // to find a character by referring to index number , we will have to use the charAt() method :
        String weather ="Its so sunny outside";
        System.out.println(weather.charAt(4)); // this will return the letter "S" as its the one positioned in the 4th index or position

        // 5)-String concatenation ; we use the + operator to concatenate between two strings , or to combine them , also we can use the concat() method;
        String firstName= "john";
        String lastName="Doe";
        System.out.println(firstName+" "+lastName); // we used to + operator to combine or concatenate two strings , and we used "" quote to create a space between them
        System.out.println(firstName.concat(lastName));

        // 6)-String comparison: // this method will return a boolean type (true or false);
        System.out.println(alphabet.equals(alphabet1)); // both alphabet variables have same values , the only difference is the upper and lower case , that's why when we compare them , it will return false
        // but there is a method that we can use when we compare two strings to ignore the capital or lower case differences , after using this method , it will return true .
        System.out.println(alphabet.equalsIgnoreCase(alphabet1)); // now it will return true , because we ignored the case differences

        // 7)-how to get the subString : substring means we only wanted to get or fetch a small string from the entire string value , its like we just wanted to get a specified phrase , sentence , or text , or word...from the entire string value .
        System.out.println(greeting.substring(0,9));// we will be using the substring() and refer to the beginning of the index and the ending of the index of the specified sentence we wanted to get

        // 8)-trim () method: the trim method is used trim our string value , meaning we use trim method to remove the unnecessary space that takes place in the beginning and end of the string value (the space after we open the double quote and the space before we close it)
        String javaCode = "   Hello world   ";
        System.out.println(javaCode.trim()); // by using the trim method we managed to remove the space before Hello , and the space after world . if we wanted to remove the space between hello world , we will have to use replace() method.

        // 9)-replace() method: is used to remove the space between between to words , also used to remove a specific character and replace with a new a character
        System.out.println(javaCode.replace(" ","")); // i referred to the space that i wanted to remove by opening and closing the double with a space between then , and i referred to the replacement by opening and closing the double quote without a space
        String date = "05-10-2020" ; // i wanted to replace the the dash with the forward slash , we will be using the replace() method
        System.out.println(date.replace("-","/"));

        // 10) split() method; the split() method is used to split the string value based on the specified splitting character , and it will return a string Array.
        String test = "Hello_World_Test_Selenium";
        String testArray []=test.split("_"); // the split() method has to be stored in an array
        for (int i = 0; i<testArray.length;i++){ // we used for loop to print out all the values of the array
            System.out.println(testArray[i]);
        }
        // 11) important and tricky interview question :
        String x ="Hello";
        String y ="World";
        int a = 100;
        int b = 200;
        System.out.println(x+y);// the output here will be HelloWorld
        System.out.println(a+b);// the output here will be 300
        System.out.println((x+y+a+b));// the output here will be Hello World100200 , the execution goes from the left to the right ( x will be added to y , the result of x+y will be added to a , then the result of x+y+a will be added to b ) that's why the addition will not take place.
        System.out.println(a+b+x+y);// the output here will be 300HelloWorld , the both integer values will be added together , their result will be added to x , then the result of this 3 will be added to y
        System.out.println(x+y+(a+b)); // the output here will be HelloWorld300, the addition will take place since we put both variables between the parentheses



        // 12)-Special characters : as we all know that a string is written between a double quote "", if we try to insert another double quote in a string value ,
        // java will misunderstand this string and  generate an error , for example ;
        // String message = " we are all doing "great" in this situation "; // right after i inserted another double quote in this string , java threw an error.
        // to avoid this problems we will have to use the backslash(\) escape characters that turns special characters into a string characters
        // The list of the the backslash escape characters are :
        // - (\') ====> will give us a Single quote.
        // - (\") ====> will give us a Double quote.
        // - (\\) ====> will give us a backslash.
        // - (\n) ====> its called NEW LINE , it will print the the value of a string in two lines
        // - (\r) ====> its called carriage return (the \r is used to print out only whats written after this back slash escape character , its called carriage return)
        // - (\t) ====> its called tab (the \t is used to take a step forward and make a space after this \t escape character , its called  tab)
        // - (\b) ====> its called back space the \b is used to take one step back and delete the character just before this back slash escape character ,

        String textMessage = " java concept is very long , more time needed \"1 month \" maybe will be enough";
        System.out.println(textMessage); // the output here will be entire string value with a double quote inserted
        String essay = " we use this for single quote \'Billal\' , this for double quote \"okay\" , this for single backslash \\ ";
        System.out.println(essay);// the output here will be entire string value with a single quote inserted
        String essay2 ="Hello\nWorld"; // we used \n to print out the output in two lines
        System.out.println(essay2); // the output here will be the entire string value printed in two lines
        String essay3 ="hello\rworld"; // the carriage return escape character used to print out only whats after this character
        System.out.println(essay3); // the output here is whats written after the character \r
        String essay4 = "hello\tworld";// the tab escape character is used to take one step forward and make a space
        System.out.println(essay4); // the output here will be the entire string value with a space between the two since this character takes one step forward and make a space
        String essay5 ="Hello\bworld"; // the back space escape character is used to take one step back and delete the character right before this escape character
        System.out.println(essay5); // the output here will be the entire string value with one letter missing before the back escape character




        // 1)-the length of a string
        // 2)-The toLowerCase() and toUpperCase() methods in a string
        // 3)-Finding characters and their positions
        // As we know that that indexOf() method will return the position of the first appearance or occurrence of a specified letter , text ,character in a string (including whitespace)
        // but if our string value has multiple same characters or text or letters
        // 4)-Finding a character in a string by referring to the index number
        // 5)-String concatenation
        // 7)-how to get the subString
        // 8)-trim () method
        // 9)-replace() method:
        // 10) split() method;
        // 11) important and tricky interview question :
        // 12)-Special characters











    }
}
