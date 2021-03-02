package JavaBasics;


import java.util.Scanner;

public class ScannerConcept {

    // What is Scanner: scanner is class used to get user input , in other words scanner is a calls used for obtaining the input of the primitive dataTypes including String .
    // To use the scanner class we need to create the object of the class and use any of the available methods found in the java scanner class documentation .


    public static void main(String[] args) {

        Scanner scanObject = new Scanner(System.in); // in here we created a scanner object , the (System.in ) is the consul window where we are going to input the data
        System.out.println("Enter your name , Age , Desired Salary :");

        String name = scanObject.nextLine();
        int age = scanObject.nextInt();
        int Salary = scanObject.nextInt();

        System.out.println("My name is :"+name +","+"I am :"+age+" years old   "    +   "My Desired salary is :"+Salary);

        System.out.println("*******************************************");

        // we will be Writing a java program to allow the user to input his/her name , citizenship , age (we will have to use the scanner concept)
        // Then we will be writing a program that will show if the person is eligible to vote or not (we will have to use the if---else statement)
        // knowing that Citizens must be eighteen years and older to vote

        //1.user will be able to input the firstName, citizenship, and Age

        Scanner vote = new Scanner(System.in);
        System.out.println("Enter your Fist name :");
        String FistName=vote.nextLine();
        System.out.println("My name is :"+FistName);
        System.out.println("what is your current citizenship ?");
        String citizenship= vote.nextLine();
        System.out.println("My current citizenship is :"+citizenship);
        System.out.println("How old are you ?");
        int Age = vote.nextInt();
        System.out.println("My age is :"+Age);

        //2.Verify if the user is eligible to vote :
        if(Age>18){
            System.out.println(" Congratulation , you are eligible to vote ");
        }else{
            System.out.println("Sorry , You are not eligible to vote ");
        }



    }

}
