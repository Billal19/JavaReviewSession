package OOPConceptPart2.Inheritance;

public class BClass extends AClass { // this is a child class (subclass)

    public BClass(){
        super(); // the super keyword is used to call the (superclass) parent class constructors ,
        // if we pass parameters in it , it will call the parameterized constructor , if not it will call the default constructor
        // the super statement should be always the first statement
        // the super statement can only be used in the subclass (child class)
        // we can not create multiple super keywords inside a constructor , we only can create one , if we wanted to use more super keywords then we will have to create more constructors .
        // if the child class inherits from the parent class , the parent class default constructor will be called automatically
        System.out.println("this is the child class constructor");
    }

    public BClass(int age , String name){
        super(29,"Billal"); // if we wanted our superclass parameterized constructor to have same value as the ones we created for subclass constructor,
        // then we don't have to initialize the value inside super(), we only have to write the variable name exactly as the ones in the parameterized constructor
        System.out.println("i am:"+age);
        System.out.println("My name is:"+name);
        // if we only want to access the superclass parameterized constructor , then we will only use the super () keyword and give it the values we want from the object we created for this constructor , and remove any print statement for this subclass parameterized constructor.
    }

    public static void main(String[] args) {
        BClass objB = new BClass();
        // this object was created to call the BClass constructor only ,
        // however the BClass(child class) extends or inherits  the properties of the AClass (parent class) this in this case this object will call the parent class default constructor as well.

        BClass obj = new BClass(20,"Billy");
        // this object was created to call only the parameterized constructor of the subclass(child class), its not going to call the parameterized constructor from the superclass(parent class)
        // to call the parameterized constructor from the parent class we will have to use the super() keyword inside this child class parameterized constructor , this way both constructors will be called ( subclass and superclass)



    }
}
