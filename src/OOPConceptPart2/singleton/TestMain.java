package OOPConceptPart2.singleton;

public class TestMain {

    public static void main(String[] args) {

        SingletonDemo obj = SingletonDemo.getInstance();
        obj.name="bill";
        obj.number=2839837;

        System.out.println(obj.name);
        System.out.println(obj.number);







    }
}
