package Practice.Recap1;

public class ThisKeyWordReview {

    // this are called global variables (class variables ) :


    String firstName ;
    int age;

    public ThisKeyWordReview(String fistName, int age){ // we passed some local variables to this constructor with the same name as the global ones
        // since the local and global variables have the same name , in order to initialize the global variables , we will have to use the keyword "this"
        this.firstName=fistName;
        this.age=age;
//        firstName=firstName; // if the local and global variables names are the same , the global variables will not be initialized without using the keyword "this", java will not consider this without the keyword "this"
//        age = age;

//        firstName=Name; // also we can initialize the global without using the keyword "this" if we have the local variables with different names
//        age=age1;


        System.out.println("i am :" +firstName+ " i am:"+age+" years old ");//

    }

    public static void main(String[] args) {
        ThisKeyWordReview object = new ThisKeyWordReview("BILLAL", 29); // we have initialized the the local variable created inside the parameterized constructor.

        System.out.println(object.firstName);// i just checked if the global variables have initialized since they have the same name as the local variable (they were not initialized before we used the keyword "this").the output for String value will be "null", but we managed to get the output after we used the keyword"this"
        System.out.println(object.age);// same thing here i just checked if the global variables are initialized , they were not initialized before we used the keyword"this" , the output for integer values will 0, but we managed to get the output after we used the keyword"this"
    }
}
