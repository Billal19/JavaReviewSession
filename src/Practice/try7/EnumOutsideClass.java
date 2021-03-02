package Practice.try7;


enum Temperature{
    HIGH , MEDIUM , LOW
}

public class EnumOutsideClass {
    public static void main(String[] args) {
        Temperature object = Temperature.HIGH;
        System.out.println(object);

        switch (object){
            case LOW:
                System.out.println("this is not the actual temperature");
                break;
            case MEDIUM:
                System.out.println("this is not the one");
                break;
            case HIGH:
                System.out.println("this is the one");
                break;
            default:
                System.out.println("we have not found a match");
        }


        for (Temperature obj : Temperature.values()){
            System.out.println(obj);
        }
    }
}
