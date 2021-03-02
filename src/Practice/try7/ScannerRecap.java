package Practice.try7;

import java.util.Scanner;

public class ScannerRecap {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please follow the instruction and provide the requirements, Name , Age , Ethnicity , Location , Desired Salary , Citizenship");
        System.out.println("Enter your name:");
        String name = myObj.nextLine();
        System.out.println("my name is :"+name);

        System.out.println("Enter your age:");
        int age = myObj.nextInt();
        System.out.println("my age is :"+age);

        System.out.println("Enter your Ethnicity:");
        String Myethnicity = myObj.nextLine();
        System.out.println(" my ethnicity is :"+Myethnicity);

        System.out.println("please enter your location:");
        String location = myObj.nextLine();
        System.out.println("i am located in :"+location);

        System.out.println("please enter your desired Salary:");
        int salary = myObj.nextInt();
        System.out.println("my desired salary is :"+salary);

        System.out.println("what citizenship you are holding ?");
        String Mycitizenship = myObj.nextLine();
        System.out.println(" My citizenship is :"+Mycitizenship);





        // Check if he is eligible to vote :

        if (age>18){
            System.out.println(" your are qualified to participate in the election and exercise your rights ");
        }
        else {
            System.out.println("We are sorry , we can not process your application because you are an underage");
        }
    }
}
