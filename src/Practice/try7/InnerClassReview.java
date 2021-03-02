package Practice.try7;



class Outer{

    String firstName = "Billal";
    public void OuterClassMethod(){
        System.out.println("this method belongs to the outer class");
    }



    class Inner{

        String lasName = "Yah";
        public String InnerClassMethod(){
            System.out.println("this is the inner class method");
            return firstName;
        }

    }

}

public class InnerClassReview {

    public static void main(String[] args) {
        Outer obj1 = new Outer();
        System.out.println(obj1.firstName);
        obj1.OuterClassMethod();


        Outer.Inner obj2 = obj1.new Inner();
        System.out.println(obj2.lasName);
        System.out.println(obj2.InnerClassMethod());
    }
}
