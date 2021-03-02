package Practice.try7;

public class ThisKeyWordInConstructor {

     String firstName ;
     int age;


    public ThisKeyWordInConstructor(String Name, int age1){
        firstName = Name;
        age = age1;

        System.out.println("the first name is : "+ Name);
        System.out.println("the age is : "+ age1 );

    }

    public static void main(String[] args) {
        ThisKeyWordInConstructor obj = new ThisKeyWordInConstructor("Billal", 29);


        System.out.println(obj.firstName);
        System.out.println(obj.age);



    }


}
