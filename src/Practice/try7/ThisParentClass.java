package Practice.try7;

public class ThisParentClass {

    public ThisParentClass(){
        System.out.println("this is a parent class default constructor");
    }

    public ThisParentClass(String name){
        System.out.println("this is a parent class one parameterized constructor with the name of : "+name);
    }

    public ThisParentClass(String lastName, int age){
        System.out.println("this is a parent class two parameterized constructor with the last name and age of : "+lastName+ "  " +age);
    }
}
