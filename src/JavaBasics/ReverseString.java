package JavaBasics;

public class ReverseString {

    public static void main(String[] args) {

        String Name="madam"; // the length of this string is : 13

        // 1). The easiest way to reverse a string is using the StringBuffer class to reverse it:
//        StringBuffer obj = new StringBuffer(Name);
//        System.out.println(obj.reverse());


        // 2). Using For Loop;
        int len = Name.length();
        String rev = "";

        for (int i = len-1; i>=0;i--){
            rev =rev + Name.charAt(i);

        }
        System.out.println(rev);


        // 3). program on how to check if the String is palindrome or not :

        String orig_name=Name; // this variable has been created to compare between the name and the reversed name to see if the String is palindrome or not;

        if (orig_name.equals(rev)){
            System.out.println("its a palindrome string");
        }
        else{
            System.out.println(" it's Not a palindrome String ");
        }
    }
}
