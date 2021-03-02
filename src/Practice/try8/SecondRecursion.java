package Practice.try8;

public class SecondRecursion {

    public static void main(String[] args) {
        thisMethod(15);

    }

    public static void thisMethod(int i){
        if (i==0){
            System.out.println("this line prints one time and its the last line of code");
        }
        else {
            System.out.println("this line will be printed multiple times based on the condition"+i);
            i--;

            thisMethod(i);
        }
    }
}
