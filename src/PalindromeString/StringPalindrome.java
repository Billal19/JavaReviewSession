package PalindromeString;

public class StringPalindrome {


    public static void main(String[] args) {

        String lastName= "yahiaoui";
        int len = lastName.length(); // the length is 8
        String rev = ""; // we created this variable to store the reversed string in it.
        String origin_lName= lastName; // we stored the lastName variable in the origin_lName , so it will be compared against the rev variable.


        // 1) we will be Using for loop to reverse the string then use if---else statement to find out if the string is palindrome or not :
        for (int i = len-1; i>=0; i--){
            rev = rev + lastName.charAt(i); // we used the charAt() to get the characters of a string one by one
        }
        System.out.println(rev);

        if (origin_lName.equals(rev)){
            System.out.println("this a valid palindrome string ");
        }
        else {
            System.out.println("this is not a valid palindrome string");
        }

        //2) we can also use the stringBuffer to reverse a string :
        StringBuffer OBJ = new StringBuffer(lastName);
        System.out.println(OBJ.reverse());


    }
}
