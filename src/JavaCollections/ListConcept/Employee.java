package JavaCollections.ListConcept;

public class Employee {

    String name;
    int age;
    String Dept;

    public Employee(String name, int age,String Dept){ // we created a constructor here and the variables we pass in this constructor are called local variables

        // since the global variables have the same name as the local variables , in order for us to initialize them , we will have to use the keyWord "this";
        this.name= name; // this key words always refers to the global variable
        this.age= age;
        this.Dept= Dept;

    }
}
