package Practice.try8;

public class TheSecondClass extends TheOneClass {

    public TheSecondClass(){

        super();
        System.out.println("this is the child class default constructor");
    }

    public TheSecondClass(int TheAge){
        super(39);
        System.out.println("this is the child class one parameter constructor : " + TheAge);
    }

    public TheSecondClass(String TheName, String TheNickName){
        super("Mike","micky");
        System.out.println("this is the child class two parameters constructor :" +TheName + " and the nick name is:" +TheNickName);
    }

    public static void main(String[] args) {
        TheSecondClass obj = new TheSecondClass();
        TheSecondClass obj1 = new TheSecondClass(20);
        TheSecondClass obj2 = new TheSecondClass("Steve","steeeevy");

    }
}
