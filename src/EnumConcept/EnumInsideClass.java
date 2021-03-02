package EnumConcept;

public class EnumInsideClass {

    enum Level { // in this class i created an enum inside the class
        // when we create an enum inside the class , its not gonna create another class with the symbol E inside the package ,
        // however if the enum is created outside the class , there will be a new class created inside the package with the E symbol
        FIRST , SECOND , THIRD
    }

    public static void main(String[] args) {
        Level myEnum1 = Level.FIRST;
        System.out.println(myEnum1);


        // we will be using switch case in enum
        switch (myEnum1){
            case FIRST:
                System.out.println("this is the corresponding constant of an enum");
                break;
            case SECOND:
                System.out.println("this is the second constant of an enum");
                break;
            case THIRD:
                System.out.println("this is the third constant of an enum ");
                break;
            default:
                System.out.println("unfortunately none of these constants corresponding to the enum constants  ");
        }


        for (Level constants : Level.values()){ // this method is used to print out all the constants of enums
            System.out.println(constants);
        }

    }
}
