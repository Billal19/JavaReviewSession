package Practice.try8;

public class SingleToneTest {

    public static void main(String[] args) {

        SingleToneExam obj = SingleToneExam.getInstance();

        obj.name="Bill";
        obj.age= 29;

        System.out.println(obj.age);
        System.out.println(obj.name);
    }
}
