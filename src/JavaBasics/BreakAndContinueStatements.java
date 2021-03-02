package JavaBasics;

public class BreakAndContinueStatements {
    // 1.what is break in java: as we learned previously , that break statement is used in the switch case, when java reaches the break keyword , it breaks out of the switch block,
    // when a match if found , the job is done , its time to take a break , there is no need to for more elements , or more code to be executed .
    // the break keyword can save a lot of execution time because it ignores all of the rest of the codes in the switch block .
    // The break statement or keyword can also be used to break out or jump out of the loop .
    // The break keyword in general can not be used outside of a loop or a switch


    public static void main(String[] args) {
        // A* Example of a Break statement or keyword in loops :
        for(int i =0; i<10 ; i++){ // this is a for loop with an initialization of i=0; a condition of i<10 , with an increment i++ ; i am expecting an output of:0123456789
            // but it will not be the case because i have another condition that's going to break right after its declaration
            if(i==6){ // this is a new condition for my for loop : due to this , i am expecting an output of :012345 , because we added the break statement after this
                break; // this break word will jump out this loop
            }
            System.out.println(i);
        }
        System.out.println("-------------------------------------------------------");

        // B* Break statement used in a while loop :
        int i = 5;
        while (i<10){
            System.out.println(i);
            break; // i put break here to jump out of the loop , because i did not increment or decrement the while loop to have a proper loop and prevent the infinite looping from happening  ,
            // so our program will go crazy and print out infinite loops if i did not put the break statement
            // but using the break statement , it will jump out of the loop and print out only the value one time
            //i++; i tried to increment my while loop after the break statement but i got an error because this increment became an unreachable statement
            //break; lets say i incremented the while loop then after the increment i put the break statement , our print out in this example will be only 5.  Because this break statement will effect the looping even if we put it after the increment
        }

        System.out.println("-------------------------------------------------------");

        // C* Break statement used in array ;

        int [] number ={10,20,30,40,50};
        for( int a =0 ; a<number.length;a++ ){
            if(number[a] == 30){ // if we don't want to print out all the elements , we will be using another condition here and end it with break statement that will jump out of the loop
                break;
            }
            System.out.println(number[a]); // this method used to print out the elements stored in an Array
        }




        System.out.println("-------------------------------------------------------");

        // Example on how to use the continue statement :
        // Continue statement used to break one iteration (in the loop) , if a specified condition occurs , and continues with the next iteration in the loop

        // Continue statement used in a for loop
        for(int b = 0; b<10; b++){
            if (b==4){ // this is a new condition
                continue;
            }
            System.out.println(b);
        }

        System.out.println("------------------------------------------------------");


        int d= 0;
        while(d<10){
            if(d==2){
                d++;
                continue;

            }
            System.out.println(d);
            d++;
        }












    }
}
