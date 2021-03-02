package Practice.try7;

public class Super_Second_Class extends Super_First_Class {

    public Super_Second_Class(){

        super(); // this super keyWord has no parameters , so it will call the parent class constructor
        System.out.println("this the child class default constructor");
    }

    public Super_Second_Class(String name, int age){
       super("billal",90);

        System.out.println("my child class name is :"+name);
        System.out.println("my child class age is :"+age);
    }

    public static void main(String[] args) {
        Super_Second_Class obj = new Super_Second_Class();
        Super_Second_Class obj1 = new Super_Second_Class("steve", 29);
    }
}
