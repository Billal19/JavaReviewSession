package Practice.try8;

public class MyConstructorWithThisKeyWord {

     String name ;
     int age ;

    public MyConstructorWithThisKeyWord(String name,  int age){

        name = name;
        age = age;
        System.out.println("My name is : " +name);
        System.out.println("My age is : "+age);
    }








    public static void main(String[] args) {

        MyConstructorWithThisKeyWord obj = new MyConstructorWithThisKeyWord("Bill",29);
        System.out.println(obj.name);



    }
}
