package Practice.try8;





class MyOuter{

    String name= "Bill";
    public void MyOuterMethod(){
        System.out.println("this is the outer class method");
    }



    class MyInner{

        String lastName = "James";
        public String myInnerMethod(){
            System.out.println("this is the inner class method "+name);
            return name;
        }

    }


}

public class InnerAndOuterConcept {


    public static void main(String[] args) {
        MyOuter obj1 = new MyOuter();
        System.out.println(obj1.name);
        obj1.MyOuterMethod();

        MyOuter.MyInner obj2 = obj1.new MyInner();
        System.out.println(obj2.lastName);
        obj2.myInnerMethod();
    }

}
