package OOPConceptPart2.Abstraction;

public class TestBank {

    public static void main(String[] args) {

        System.out.println(UsBank.min_bal);// this how we call the variable from the interface , we need to the use the interface name.name of the variable since its by default a static variable

        HSBCBank hsObject = new HSBCBank();


        // Compile time polymorphism; we are overriding thes methods , that's why its called compile time polymorphism
        hsObject.carLoan();
        hsObject.credit();
        hsObject.debit();
        hsObject.educationLoan();
        hsObject.transferMoney();


        // Dynamic polymorphism ; child class object can be referred by the parent class reference variable ( but in this case the child class object will be referred by the parent interface variable)
        UsBank usObject = new HSBCBank(); // only overridden methods can be called
        usObject.credit();
        usObject.debit();
        usObject.transferMoney();

    }
}
