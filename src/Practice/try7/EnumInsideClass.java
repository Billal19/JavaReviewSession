package Practice.try7;

public class EnumInsideClass {

    enum rank{
        FIRST, SECOND, THIRD
    }

    public static void main(String[] args) {
        rank EnumConstants = rank.FIRST;
        System.out.println(EnumConstants);


        switch (EnumConstants){
            case FIRST:
                System.out.println("this is the actual rank");
                break;
            case SECOND:
                System.out.println("this is not the actual rank");
                break;
            case THIRD:
                System.out.println("this is a wrong rank");
                break;
            default:
                System.out.println("we have not found a match");
        }


        for (rank myObj : rank.values()){
            System.out.println(myObj);
        }
    }
}
