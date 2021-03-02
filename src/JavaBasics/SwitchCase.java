package JavaBasics;

public class SwitchCase {

    public static void main(String[] args) {
        int day = 3;
         switch (day){
             case 1:
                 System.out.println("Today is Monday");
                 break;
             case 2:
                 System.out.println("Today is Tuesday");
                 break;
             case 3:
                 System.out.println("Today is Wednesday");
                 break;

             default:
                 System.out.println("Non of these days match");
         }

         String carName = "Dodge";
         switch (carName){
             case "Toyota":
                 System.out.println("he loves toyota");
                 break;
             case "Ford":
                 System.out.println("He owns a ford");
             case "Honda":
                 System.out.println("He recommended a nissan ");
                 break;
             default:
                 System.out.println("his favorite car is actually a Dodge");
         }

    }




}
