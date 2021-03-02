package Practice.oopReview;

public class Encapsulation {

    // We declared private variables that will be accessed through the method of this class.

    private String firstName ;
    private int employeeIncome;
    private char employeeInitial;


    // we created the public getter and setter methods  to be able to have access to these private variables  from another class .
    // getter and setter must be  created inside the main class outside of the main method



    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public int getEmployeeIncome(){
        return employeeIncome;
    }

    public void setEmployeeIncome(int employeeIncome){
        this.employeeIncome=employeeIncome;
    }

    public char getEmployeeInitial(){
        return employeeInitial;
    }

    public void setEmployeeInitial(char employeeInitial){
        this.employeeInitial=employeeInitial;
    }



    public static void main(String[] args) { // this main method was created only to see if we can have access to the private variables of this class
        Encapsulation object = new Encapsulation();
        System.out.println(object.employeeIncome);









    }

}
