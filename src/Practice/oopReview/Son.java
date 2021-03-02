package Practice.oopReview;

public class Son extends Father {

    // if we pass parameters in it , it will call the parameterized constructor , if not it will call the default constructor
    // the super statement should be always the first statement
    // the super statement can only be used in the subclass (child class)
    // we can not create multiple super keywords inside a constructor , we only can create one , if we wanted to use more super keywords then we will have to create more constructors .


    public Son(){
        super(6.1); // if i use the super() keyword in a non parameterized constructor , then the default constructor from superClass will not be called
        System.out.println("this is child class a default constructor");
    }

    public Son(String job){
        super(job); // in here i just wrote the variable name , the parent parameterized constructor will have same parameters as the child parameterized constructor

        System.out.println("the son will do the same job as his father which is :"+job);
    }

    public Son( String house, int money){
        super("Villa",50000); // in here i passed different parameters , so the parent parameterized constructor will have different parameters as the child parameterized constructor
//        System.out.println("the house is"+house);
//        System.out.println("the money is"+money);

        // if we only want to access the superclass parameterized constructor , then we will only use the super () keyword and give it the values we want from the object we created for this constructor or passing the values directly to super(),
        // and remove any print statement for this subclass parameterized constructor.
    }


    public static void main(String[] args) {
        Son object = new Son();// this object was created to call the subclass default constructor ,
        // however the parent class default constructor will be called as well since this class inherited the parent class (so the superclass default constructor will be called first then , the subclass default constructor second)
        Son object1 = new Son("self employed");// this object was created to call the one parameterized constructor from the subclass only ,
        // but if we wanted to access the one created in the parent class then we will have to use the super() keyword
        Son object2 = new Son("BigHouse",30000);// this object was created to call the two parameterized constructor from the subclass only ,
        // but if we wanted to access the one created in the parent class then we will have to use the super() keyword

        // Note :when using the super keyword in the parameterized constructor , we need to pass the parameters to it in order to initialize the superclass constructor ,
        // if we only use the variable names without initializing them , then the parameterized constructor of the superClass will have same parameters as the ones given to the parameterized constructor from the subclass.
        // if we pass new parameters to super() keyword then the superclass parameterized constructor will have different parameters then the subclass parameterized constructor

        // If we only wanted to call the parameterized constructor from the superclass , then there is no need to create another parameterized constructor in the subclass ,
        // we just have to use the default constructor we created in the subclass with the super() keyword by passing the same parameters as the on we created in the superClass parameterized constructor .
        // if we wanted to call all the parameterized constructors of the superClass , as well as the default one , then we will have to create more constructors in the subclass
    }
}
