package Practice.Recap1;

public class ImmutableString {

     String firstName = "billal";

    public static void main(String[] args) {

        ImmutableString object = new ImmutableString();

        object.firstName="homie";

        //String firstName = new String("John");

        System.out.println(object.firstName);


    }
}
