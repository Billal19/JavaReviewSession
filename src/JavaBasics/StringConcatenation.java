package JavaBasics;

public class StringConcatenation {

    public static void main(String[] args) {

        String teacherName = "John Doe";
        String teacherAddress = "Brooklyn, NY";
        int age = 28;
        int weight =150 ;

        System.out.println( teacherName+teacherAddress+age+weight); // This is called concatenation but the print out will be not organized , it will be squeezed all together.
        System.out.println(teacherName +"  " + teacherAddress +" " + age + " " + weight); // This is an organized concatenation , all we did is adding  double quotes and a plus sign(+) which is called A concatenation operator in this case .
        System.out.println("the teacher's name is :" +teacherName + " " + "The teacher's address is :" + teacherAddress + " " + "the teacher's address is :"+ age +" "+"the teacher's weight is :"+weight); // this is concatenation beatification , we added few sentences to beatify our code

        System.out.println("**************************");


        System.out.println(age+weight+teacherAddress+teacherName);// The execution is done from the left to the right side ,
        // so in this case the age will be added with weight , then the addition of the age with the weight will be added with the teacherAddress , and the addition of these three will be added with the teacherName.
        // The output should be 178Brooklyn, NYJohn Doe.

        System.out.println(teacherAddress+teacherName+age+weight); // As we know The execution is done from the left to the right side ,
        //So in this case the teacherAddress will be added with the teacherName , then the addition of these two will be added with the age , and the addition of these three will be added with the weight.
        // The output should be Brooklyn, NYJohn Doe28150, a lot people mistaken this , they think that it will print out Brooklyn, NYJohn Doe178 which is incorrect .
        // Because if we concatenate a string with an integer , the first integer that we add to the string will be a new string , that's why if we start with a string variable followed by the integer variables , it will not do the math for those variables , it will display them separately.
        // However is the concatenation start with the integer variables  followed by the string variables , it will do the math and display the addition of the first integer variables + the string variable

        System.out.println(teacherAddress+teacherName+(age+weight));// in this case the output will be Brooklyn, NYJohn Doe178

        System.out.print("try this "); // print is used to print on the console without a new line , meaning that the next statement will be printed in the same line as this line

        System.out.println("one more time "); // println is used to print on the console with a new line , meaning that if there is a next statement , it will be printed in a different line .


    }
}
