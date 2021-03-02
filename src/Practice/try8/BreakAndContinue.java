package Practice.try8;

public class BreakAndContinue {

    public static void main(String[] args) {
        //Break in for loop:
        for (int i =0;i<10;i++){
            if (i==7){
                break;
            }
            System.out.println(i);
        }

        //Break in While loop;

        int b=3;
        while (b<9){
            System.out.println(b);

            break;
        }

        //Break in Array:

        int number[] = { 10,20,30,40,50,60,70};
        for (int c=0;c<number.length;c++){
            if (number[c]==30){
                break;
            }
            System.out.println(number[c]);
        }







    }
}
