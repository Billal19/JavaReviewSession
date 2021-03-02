package InnerClass;

class Outer{// This is the outer class
    String firstName = "Billal"; // this variable belongs to the outer class
    public void myMethod(){ // this method belongs to the outer class
        System.out.println("I am trying to access this method from the inner class ");
    }

    class Inner{ // this is a class inside a class known as an Inner class , to access the inner class we will have to create an object of the outer class , then create an object of the inner class
        // To access an inner class we will have to create an object of the outer class then create an object of the inner class
        // Unlike a regular class an inner class could be private or protected ,If we don't want outside object to access this InnerClass we can declare it private
        // If we try to access an inner class from whole outside class , an error will occur
        // An Inner class can be static as well which means , it can be accessed without creating an object
        // The advantage of the inner class is that it can access the outer class methods and attributes, by creating a return type method in the inner class , that's gonna return one of the outer classes attributes
        String lastName = "Yah"; // this variable belongs to the inner class
        public String theInnerMethod(){ // this method belongs to the inner class , i made it return type , and its going to return the variable of the outer class
            System.out.println("this is a method created in the inner class");
            return firstName;
        }
    }

}

public class InnerClassConcept { // this is our main class

    public static void main(String[] args) {
        Outer obj1 = new Outer(); // this is the outer class object
        System.out.println(obj1.firstName);
        obj1.myMethod();
        // the syntax of the inner class object should be like this: OuterClass.InnerClass objectName = OuterClassObjectName.new InnerClass();
        Outer.Inner obj2 = obj1.new Inner();
        obj2.theInnerMethod();
        System.out.println(obj2.lastName);
        System.out.println(obj2.theInnerMethod());






    }
}
