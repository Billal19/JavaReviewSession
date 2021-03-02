package OOPConceptPart1;

public class StaticAndNonStaticConcept {

    String name ="Tom"; // Non static global variable
    static int age = 25; // Static global variable

    public static void main(String[] args) {

        // 1-How to call Static methods ; there are two way
        // A-Direct call ; by writing the method's name in the main method followed by parentheses () and semi column ; example down below ;
        receiveMail();
        // B-Call by ClassName; by writing the class name.the method's name followed by the parentheses () and semi column ; example down below ;
        StaticAndNonStaticConcept.receiveMail();

        // 2-How to call static variables ; there are also two way on how to call static variables ;
        System.out.println(age);// A- by using the print statement with the static variable name inside the parentheses.
        System.out.println(StaticAndNonStaticConcept.age);// B- by using the print statement with the className.static variable name inside the parentheses.

        // 3- How to call Non static method ; Non Static method can only be called by creating an object
        StaticAndNonStaticConcept object = new StaticAndNonStaticConcept();
        object.sendMail(); // Non static method being called by using the object reference variable name .
        // 4- How to call Non static variable;
        System.out.println(object.name);// Non static object being called by using the print statement with the object reference variable name.variableName inside the parentheses.


        // Can we access the static methods by using the object reference? yes we can but its not a good practice , most likely we will get a warning sign
        object.receiveMail(); // if we were working on Eclipse , a warning will be given in this case (The static method should be accessed in a static way which means that the method should be called directly or by using the className )



    }

    public void sendMail(){ // Non static method
        System.out.println("send mail method ");
    }

    public static void receiveMail(){ // Static method
        System.out.println("receive the mail");
    }
}
