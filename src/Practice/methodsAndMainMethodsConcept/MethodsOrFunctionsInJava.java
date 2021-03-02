package Practice.methodsAndMainMethodsConcept;

public class MethodsOrFunctionsInJava {

    public static void main(String[]args){

        // all our methods are none static that's why we need to create an object
        MethodsOrFunctionsInJava object = new MethodsOrFunctionsInJava();
        object.test();
        object.addition();
        object.classType();
        object.division(800,2);


    }

    //1-methods with NO inputs and NO outputs ; (non parametrized method)
    public void test(){
        System.out.println("this method has no inputs and no outputs ");
    }

    //2-methods with No inputs but with some outputs ;(non parametrized method)
    public  int addition(){
        int a = 200;
        int b = 300;
        int c = a+b;
        System.out.println("this method has no input but it has some output of the addition:    "+c);
        return c;
    }

    public String classType(){
        String ClassChapter="Selenium";
        System.out.println("this method has no input but it has some output of a string data Type:  " +ClassChapter);
        return ClassChapter;

    }

    //3-methods with some inputs and some outputs : (parametrized method)
    public int division (int num1, int num2){
        int a = num1;
        int b = num2;
        int c = num1/num2;
        System.out.println("this method has some inputs and some outputs :  "+ c);
        return c;

    }

}
