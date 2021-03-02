package Practice.try7;


enum Level{
    LOW, MEDIUM,HIGH
}

public class RecapForEnums {



    public static void main(String[] args) {
        Level obj = Level.HIGH;
        System.out.println(obj);

        switch (obj){
            case HIGH:
                System.out.println("this is the high level");
                break;
            case MEDIUM:
                System.out.println("this is the medium level");
                break;
            case LOW:
                System.out.println("this is the low level");
                break;
            default:
                System.out.println("no match found");
        }

        for (Level obj1: Level.values()){
            System.out.println(obj1);
        }

    }
}
