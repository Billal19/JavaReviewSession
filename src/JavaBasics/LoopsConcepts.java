package JavaBasics;

public class LoopsConcepts {

    public static void main(String [] args){
        //looping in programming language is a feature which facilitates the execution of a set of code instructions/functions,repeatedly while some condition evaluates to true.
        //Loops can execute a block of code as long as a specified condition is reached.
        //Loops are handy because they save time, reduce errors, and they make code more readable.

        // 1.While loop;

        // The while loop loops through a block of code as long as a specified condition is true
        // The while loop is a control flow statement that allows the code to be executed repeatedly based on the given condition
        // The syntax is : while ( NumberOfContestants < 5) {
        //                       system.out.println(" the results are : " + numberOfContestants);
        //                       numberOfContestants=numberOfContestants+1;
        // The disadvantage of While loop is that it will generate infinite loops if we don't add the number of contestants ( incremental or decremental )
        // we always have to increase the variable used in the condition by 1 otherwise the loop will never end, we can write it like this : i++; or i=i+1; both ways are correct .

        int i = 0;// this is called initializations (variable)
        while (i<=10){ // this is called condition
            System.out.println("the results are :"+i);
            i=i+1; // (incremental / decremental), it could be written like i++; or i=i+1;
        }

        // 2.Do while loop : Do while loop is a variant of while loop , this loop will execute the block of code once before checking if the condition is true ,
        // then it will repeat the loop as long as the condition is true , in the do while loop the loop always be executed at least once , even if the condition if false,
        // because the block of code is executed before the condition is tested

        int K =0;
        do{
            System.out.println(K);
            K++;
        }while (K<5);


        System.out.println("********************************");

        // 3.for loop:

        // If we know exactly how many times we want to loop through a block of code, we will be using the for loop instead of a while loop
        // The syntax of for loop is ; For(initialization; Termination or condition; increment/decrement){ // statement or the block of code to be executed }
        //                            statement1(initialization) ; is executed one time before the execution of the block of code
        //                            statement2(condition); defines the condition for executing the block of code
        //                            statement3(increment/decrement); is executed every time after a block of code is executed


        for(int j=1; j<=10;j++){ // Initialization ; condition ; increment
            System.out.println("the incremental for loop output is:"+j);
        }

        System.out.println("*************");

        for(int k=10;k>=1;k--){ // Initialization ; condition ; decrement
            System.out.println("the decremental for loop output is:"+k);
        }

        System.out.println("*************");

        for (int c=10;c>=-10;c--){ // Initialization ; condition(- or below 0) ; decrement
            System.out.println("the decremental for loop (below 0 condition ) is: "+c);
        }


        // 4- for-each--loop ( its also called advanced for loop); it is used exclusively to loop through elements in arrays ;

        String [] cars = new String[2];
        cars[0]= " jaguar ";
        cars[1]= " mustang ";

        for(String A: cars){
            System.out.println(A);
        }

        int [] ages = {23,27,19};
        System.out.println(ages.length);
        for(int B: ages){
            System.out.println(B);
        }















    }
}
