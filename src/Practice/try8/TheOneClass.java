package Practice.try8;

public class TheOneClass {

    public TheOneClass(){
        System.out.println("this is the parent class default constructor");
    }

    public TheOneClass(int age){
        System.out.println("this is the parent class with one parameter constructor : " + age);
    }

    public TheOneClass( String name, String NickName){
        System.out.println("this is the parent class with two parameters constructor : " +  name  + " and the nick name is : " + NickName);
    }
}
