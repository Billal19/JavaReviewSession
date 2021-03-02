package Practice.try8;

public class ThrowNewKeyWord {

    public static void main(String[] args) {
        AgeMethod(17);


//        try {
//            int levels [] = { 1,2,3};
//            System.out.println(levels[7]);
//        }catch (Exception e){
//            throw new ArrayIndexOutOfBoundsException ("The element you are trying to access is out of bound ");
//        }

//
//        int a =200;
//        int b = 300;
//        int addition = a+b;
//
//        if (addition==200){
//            System.out.println("this is correct ");
//
//        }else {
//            throw new ArithmeticException("the result of the addition is incorrect ");
//        }

    }

    public static void AgeMethod(int age){

        if (age>=18){
            System.out.println("congratualtion you are qualified to participate in the election ");
        }
        else {
            throw new ArithmeticException("We are sorry to deny your application due our age policies");
        }

    }
}
