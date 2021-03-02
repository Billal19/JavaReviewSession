package Practice.try8;

public class EnumInsideClass {


    enum colors {
        RED,BLUE,WHITE
    }


    public static void main(String[] args) {
        colors enumObj = colors.BLUE;
        switch (enumObj){
            case BLUE:
                System.out.println("this is the blue color");
                break;
            case RED:
                System.out.println("this is the red color");
                break;
            case WHITE:
                System.out.println("this is the white color");
                break;
            default:
                System.out.println("this is the default color ");
        }

        System.out.println("--------");

        for (colors cObj: colors.values()){
            System.out.println(cObj);
        }





    }
}
