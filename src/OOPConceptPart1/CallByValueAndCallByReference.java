package OOPConceptPart1;

public class CallByValueAndCallByReference {

    int p;
    int q;

    public static void main(String[] args) {
        CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
        obj.testSum(10,20); // this is one way on how to give values the parameterized method , which is the direct way on passing values

        // Or we can use this way to pass some into the parameterized method ;
        // - We will create 2 variable and initialize them , then use the object name to call the method and pass the parameters into the method ( we will use the variable names instead of the values )
        int x = 10;
        int y = 20;
        obj.testSum(x,y); // In here we are the method by value , Or pass by value

        obj.p=50;
        obj.q=60;
        obj.swap(obj);

    }

    public int testSum(int a, int b){

        int c = a+b;
        return c ;

    }

    public void swap (CallByValueAndCallByReference t){

    }

}

