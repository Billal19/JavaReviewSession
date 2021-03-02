package Practice.try7;



class ThisIsOuterClass{
    String firstName= "Billal";
    public void outer_method(){
        System.out.println("this is the outer class method");
    }



    class ThisIsInnerClass{
        int age = 29;
        public String Inner_method(){
            System.out.println("this is the inner class method which can access the outer attributes");
            return firstName;
        }

    }

}

public class ReviewInnerClass {

    public static void main(String[] args) {

        ThisIsOuterClass obj1 = new ThisIsOuterClass();
        obj1.outer_method();
        System.out.println(obj1.firstName);


        ThisIsOuterClass.ThisIsInnerClass obj2 = obj1.new ThisIsInnerClass();
        obj2.Inner_method();
        System.out.println(obj2.age);

    }
}
