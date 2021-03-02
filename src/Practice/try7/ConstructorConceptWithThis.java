package Practice.try7;

public class ConstructorConceptWithThis {
    String name;
    String location;
    String JobTitle;
    int age;
    int salary;


    public ConstructorConceptWithThis(){ // this is a default constructor with no parameters
        System.out.println("this is the default constructor");

    }

    public ConstructorConceptWithThis(String name , int age){
        this.name= name;
        this.age=age;
        System.out.println("my name is:   "+name +"   and my age is :   "+age);


    }

    public ConstructorConceptWithThis(String location , int salary, String JobTitle){
        this.location=location;
        this.salary=salary;
        this.JobTitle=JobTitle;
        System.out.println("i am located at:   "+location+"my salary is:   "+salary+"  my JobTitle is:   "+JobTitle);

    }

    public static void main(String[] args) {

        ConstructorConceptWithThis obj1 = new ConstructorConceptWithThis();
        ConstructorConceptWithThis obj2 = new ConstructorConceptWithThis("Billal",29);
        ConstructorConceptWithThis obj3 = new ConstructorConceptWithThis("Brooklyn",100000, "QA");

        System.out.println(obj2.name);

    }
}
