package OOPConceptPart2.Abstraction;

public class HSBCBank implements UsBank, BrazilBank { // we are achieving multiple inheritance


    // If a class is implemented any interface , then its mandatory to define /override all the methods of interface

    // overridden methods from the US bank
    public void credit(){
        System.out.println("Hsbc----credit");
    }

    public void debit (){
        System.out.println("Hsbc----debit");
    }

    public void transferMoney(){
        System.out.println("Hsbc----transferMoney");
    }


    // Existing methods in HSBC bank
    public void educationLoan(){
        System.out.println("Hsbc education------loan");
    }

    public void carLoan(){
        System.out.println("hsbc -----carLoan");
    }


    // Overridden method from Brazil bank
    public void mutualFund(){
        System.out.println("Hsbc -----mutualFund");
    }
}
