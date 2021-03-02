package Practice.try7;

public class Encap2 {

    public static void main(String[] args) {
        Encap1 myObject = new Encap1();

        myObject.setFirstName("Billal");
        myObject.setAge(29);
        myObject.setCarModel("BMW");

        System.out.println(myObject.getFirstName());
        System.out.println(myObject.getAge());
        System.out.println(myObject.getCarModel());
    }
}
