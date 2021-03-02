package Practice.try7.FactorialNumbersPractice;

public class RecapExample {

  public static int factorialCheck(int n){
      if (n==1){
          System.out.println("factorial"+n+ " =1 ");
          return 1;
      }else {
          System.out.println("factorial" +(n)+ " = " +(n)+ " * factorial"+(n-1));
      }
      return n * factorialCheck(n-1);
  }

    public static void main(String[] args) {
        System.out.println(factorialCheck(5));
    }
}
