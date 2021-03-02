package Practice.Recap1;

public class StringReview {


    public static void main(String[] args) {

        String first = " hgsteghdki ";
        System.out.println(first.length()); // the length method is used to get the length of a string , or how many character a string hold
        // note: the white space is counted as a character


        System.out.println(first.toUpperCase()); // the upper case method is used to convert the string variable value to uppercase letters .
        System.out.println(first.toLowerCase()); // the Lower case method is used to convert the string variable value to lowercase letters .


        // Finding a character and its position in a string :
        // The indexOf() method return the index or the position of the first occurrence or appearance of a specified letter , character , text in a string including including the white space
        // example :

        String phrase = " how is your studying progress ";
        System.out.println(phrase.length()); // this method will print out how many characters a string value holds including the white space
        System.out.println(phrase.toUpperCase());// this method will convert the string value to uppercase characters
        System.out.println(phrase.toLowerCase()); // this method will convert the string value to lowercase characters
        System.out.println(phrase.indexOf("u")); // this method will print out the index or the position of the first occurrence of a specified letter , text , character.
        System.out.println(phrase.indexOf("your"));// in here we managed to print out the index or the position of first occurrence of the word"your"


        // String concatenation :
        String firstName= "John";
        String lastName = "Doe";
        System.out.println(firstName+""+lastName); // we used to + operator to combine two strings together. we separated them with the double quote
        System.out.println(firstName.concat(lastName)); // we also can use the concat() to combine to strings together.


        // Special characters :

        // String sentence =" hello" "everyone "; in this string variable , i tried to insert another double quote inside the string value but just misunderstood this string and threw and error ,
        // to avoid this problems , we will have to use the backslash(\) escape character that turns special characters into String characters.

        String sentence1 = "Hello \' everyone \' is fine, hope that you all doing well "; // this \' used to insert a single quote inside a string value
        String sentence2 = "Hello \" everyone \" is fine, hope that you all doing well "; // this \" used to insert a double quote inside a string value
        String sentence3 = "Hello \\ everyone \\ is fine, hope that you all doing well "; // this \\ used to insert a single back slash inside a string value
        System.out.println(sentence1);
        System.out.println(sentence2);
        System.out.println(sentence3);

        String sentence4 = "Hello everyone is fine ,\n hope that you all doing well "; // the \n is used to separate the sentence by going to the next line
        System.out.println(sentence4);

        String sentence5 = "Hello everyone is fine ,\r hope that you all doing well "; // the \r is used to print out only whats after this back slash escape character , its called carriage return
        System.out.println(sentence5);

        String sentence6 = "Hello everyone is fine ,\t hope that you all doing well "; // the \t is used to take a step forward and make a space after this \t escape character , its called  tab
        System.out.println(sentence6);

        String sentence7 = "Hello everyone is fine ,\b hope that you all doing well "; //the \b is used to take one step back and delete the character just before this back slash escape character , its called back space
        System.out.println(sentence7);




    }
}
