package Practice.Recap1;

import java.util.Scanner;

public class ScannerReview {

    // we will be creating an application for the user to purchase things

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        System.out.println("Welcome to our facility ! how can i assist today ?");
        String help = object.nextLine();
        System.out.println("i would like to order this entire meal");
        System.out.println("how many boxes would you like to order ?");
        int boxes = object.nextInt();
        System.out.println("i would like to order : "+boxes);
        System.out.println("aren't you one of our competitor ?");
        boolean answer = object.nextBoolean();
        System.out.println("Awesome ! hopefully you will like our selection ");
        System.out.println("Would you like to pay cash or credit ?");
        String payment = object.nextLine();
        System.out.println(" i will pay with my card  ");
        System.out.println(" How much is my total ?");
        int price = object.nextInt();
        System.out.println("this is your total amount: "+price);
        System.out.println("payment was successful , Thanks see you again soon  ");



        Scanner obj = new Scanner(System.in);
        System.out.println(" please enter your firstName , lastName , and your age ");

        String firstName = obj.nextLine();
        String lastName = obj.nextLine();
        int age = obj.nextInt();

        System.out.println("my first name is : " +firstName+ " my last name is : "+ lastName+  " I am "+age+" years old ");

    }
}
