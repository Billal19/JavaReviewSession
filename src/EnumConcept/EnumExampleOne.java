package EnumConcept;


enum Levels {
    LOW,MEDIUM,HIGH
}

public class EnumExampleOne {


    public static void main(String[] args) {
        Levels obj = Levels.LOW;


        switch (obj){
            case LOW:
                System.out.println("this is the low level");
                break;
            case MEDIUM:
                System.out.println("this is the medium level");
                break;
            case HIGH:
                System.out.println("this is the high level");
                break;
            default:
                System.out.println("all the levels are covered");
        }

        for (Levels myLevel: Levels.values()){
            System.out.println(myLevel);
        }



    }
}
