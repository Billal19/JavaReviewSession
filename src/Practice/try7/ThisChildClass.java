package Practice.try7;

public class ThisChildClass extends ThisParentClass{


    public ThisChildClass(){
        super();
        System.out.println("this is a child class default constructor");
    }

    public ThisChildClass(String Name){

        super("Steve");
        System.out.println("this is a child class one parametrized constructor with the name of : "+Name);
    }

    public  ThisChildClass(String LastName , int Age){
        super("yah",30);
        System.out.println("this is a child class two parametrized constructor with the LastName and age of : "+LastName+" "+Age);
    }


    public static void main(String[] args) {
        ThisChildClass obj1 = new ThisChildClass();
        ThisChildClass obj2 = new ThisChildClass("Billal");
        ThisChildClass obj3 = new ThisChildClass("Bil",29);

    }
}
