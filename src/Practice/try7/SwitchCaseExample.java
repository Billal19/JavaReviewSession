package Practice.try7;

public class SwitchCaseExample {

    public static void main(String[] args) {
        int age = 29;
        switch (age){
            case 29:
                System.out.println("his age is matched to 29");
                break;

            case 30:
                System.out.println("his age is 30");
                break;
            case 31:
                System.out.println("his age is 32");
                break;
            default:
                System.out.println("his actual age is 29 , none of the above cases matched");
        }


        String favoriteName ="Billal";
        switch (favoriteName){
            case "Bill":
                System.out.println("Bill is the favorite name");
                break;
            case "steve":
                System.out.println("steve is the favorite name");
                break;
            case "Bob":
                System.out.println("Bob is the favorite name");
                break;
            default:
                System.out.println("the actual favorite name is Billal");
        }





    }


}
