package OOPConceptPart2.Inheritance;

public class AClass { // this the parent class ( super class)

    public AClass(){ // default constructor
        System.out.println("this is the parent class constructor");
    }

    public AClass(int i){
        System.out.println("this is a parent class constructor with the value of i"+i);
    }
    public AClass(int age, String name){
        System.out.println("my age is:"+age+" " + "my name is: "+name);
    }


}
