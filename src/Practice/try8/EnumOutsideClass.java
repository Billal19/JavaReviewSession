package Practice.try8;

enum taste{
    BAD, GOOD, DELICIOUS
}

public class EnumOutsideClass {

    public static void main(String[] args) {

        taste obj = taste.BAD;
        switch (obj){
            case BAD:
                System.out.println("this is it");
                break;
            case GOOD:
                System.out.println("this is it for the second");
                break;
            case DELICIOUS:
                System.out.println("this is it for the third");
                break;

            default:
                System.out.println("this is the default one");


        }

        for (taste obj1: taste.values()){
            System.out.println(obj1);
        }

    }



}
