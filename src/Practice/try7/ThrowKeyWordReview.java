package Practice.try7;

public class ThrowKeyWordReview {

    public static void main(String[] args) {

//        int a = 100;
//        int b = 500;
//        int division = b/a;
//
//        if (division==3){
//            System.out.println("this is the correct statement");
//        }else {
//            throw new  ArithmeticException ("the output of the division is : 5");
//        }
//
//
//
//        int numbers [] = null;
//        try {
//            System.out.println(numbers[2]);
//
//        }catch (Exception e){
//            throw new NullPointerException("this is a NullPointerException due to the no values stored in our array");
//        }
        age(17);




    }


    public static void age( int age){

        if (age>18){
            System.out.println("you are eligible to exercise your rights on the election day ");
        }else {
            throw new ArithmeticException("We are sorry for not granting your access , you are too young to participate in the election ");
        }

    }
}
