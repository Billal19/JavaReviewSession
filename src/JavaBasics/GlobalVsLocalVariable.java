package JavaBasics;

public class GlobalVsLocalVariable {

    String name ="John"; // this is a global variable , in order to access it and print out its value , we will have to create an object in the main method.
    int age = 28;


    public static void main(String[] args) {
        String lastName ="Doe"; // this is a local variable inside a main method , it will easily be accessed by using the using the print statement to print out its value , NO need to create an object.
        System.out.println(lastName);
        //newMethod();
        GlobalVsLocalVariable obj = new GlobalVsLocalVariable();// object was created to call non static variable and non static method
        System.out.println(obj.name); // this is a statement to print out the value of one of the none static global variables.
        System.out.println(obj.age);
        obj.newMethod(); // in here we used the object reference variable name to call the non static method to perform certain action for us .
        newStaticMethod(); // in here we directly called the static  method by writing its name followed by the parentheses () and semi column ;


    }

    public void newMethod(){
        String lastName ="Yah"; // this a local variable inside a main another method by the name of (newMethod), its not a static method , we will need to create an object inside a main method to call it.
        int income = 50000;
        System.out.println(lastName); // the object was created for this method , and it was called inside the main method, we will have to use to print statement in this method to print out the values we wanted to print .
        System.out.println(income);
    }

    public static void newStaticMethod(){
        String fistName="Billy";
        String age ="29";
        System.out.println(fistName+","+age); // in here we are printing the values of the variables after the method has was called directly inside the main method without using the object since its a static method.

    }
}
