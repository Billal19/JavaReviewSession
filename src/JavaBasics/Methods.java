package JavaBasics;

public class Methods {

    public static void main(String[] args) {
        firstMethod();
        secondMethod(18);
        thirdMethod();
        forthMethod("bill",29);

    }

    public static String firstMethod (){ // non parameterized return type method
        String firstName= " return type";
        System.out.println("this is a non parameterized :"+firstName );
        return firstName;
    }

    public  static int secondMethod(int age){ // parameterized return type method
        int age1 = age;
        System.out.println(" this is a parameterized return type method :"+age);
        return age;

    }

    public static void thirdMethod(){ // non parameterized non return type
        System.out.println(" the is a non parameterized non return type method");
    }

    public static void forthMethod(String name, int age){ // parameterized non return type
        String name1= name;
        int age1= age;
        System.out.println(" this is a parameterized non return type method :"+name1+  " " +age1);
    }
}
