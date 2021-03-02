package Practice.oopReview;

public class Father {

    public Father(){
        System.out.println("this is a parent class default constructor");
    }

    public Father(double height){
        System.out.println("the father's height is :"+height);
    }


    public Father(String job){
        System.out.println("the father works as :"+job);
    }


    public Father(String house, int money){
        System.out.println("the house is : " + house + " the amount of the money is :"+money);
    }
}
