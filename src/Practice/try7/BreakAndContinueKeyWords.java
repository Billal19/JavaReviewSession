package Practice.try7;

public class BreakAndContinueKeyWords {

    public static void main(String[] args) {

        // use break statement in a loop :
        for (int i = 0 ; i<10;i++){
            if(i == 5){
                break;
            }
            System.out.println(i); // the output here will be 01234, because we put a new condition after the for loop
        }

        // Use break statement in a while loop:
         int b =0;
        while (b<10){
            System.out.println(b);

            break;
        }

        //Break statement used in an array :

        int numbers []={10,20,30,40,50,60};
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]==40){
                break;
            }
            System.out.println(numbers[i]);
        }

        // use continue statement in for loop:

        for (int c = 0 ; c<10;c++){
            if(c == 5){
                continue;
            }
            System.out.println(c); // the output here will be 01234, because we put a new condition after the for loop
        }


        // use continue statement in while loop :

        int d =1;
        while(d<10){
            if (d==3){
                d++;
                continue;
            }

            System.out.println(d);
            d++;
        }






    }
}
