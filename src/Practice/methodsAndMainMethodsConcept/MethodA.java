package Practice.methodsAndMainMethodsConcept;

public class MethodA {


    // in here we created two classes inside the same package , each class has its own main method
    // knowing that main methods public and static , so if we wanted to call the main method of the other class inside this class , we can easily do it .
    // to call the main method of the other class inside this class , we just have to write the other class name like this :className.main(args).
    // Now both main methods will be executed from this class

    // important note :
    // if the other class is being called inside this class , and this class is being called inside the other class ,
    // after executing the program in either one of this class , it will print out multiple outputs and  we will get a stackOverflowError exception ===>( Exception in thread "main" java.lang.StackOverflowError )
    // to avoid this exception from occurring , we will have to comment down one of this main method being called inside another class , or to not call it at all .
    public static void main(String[] args) {
        System.out.println("A---- method ---- main method ");
        MethodB.main(args); // the other main method from the other class has been called
    }
}
