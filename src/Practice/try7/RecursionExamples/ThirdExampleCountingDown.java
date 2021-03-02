package Practice.try7.RecursionExamples;

public class ThirdExampleCountingDown {

    public static void main(String[] args) {
        countDownMethod(20);

    }

    public static void countDownMethod(int i){

        if (i==0){
            System.out.println("the counting has been completed");
        }
        else{
            System.out.println("this number is:" +i);
            i--;
            countDownMethod(i);
        }

    }
}
