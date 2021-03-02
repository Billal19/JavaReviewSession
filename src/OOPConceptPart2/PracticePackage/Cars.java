package OOPConceptPart2.PracticePackage;

public abstract class Cars { // this is an abstract class , even the class sign in the package has been changed after we added the abstract keyword to this class.



    // we will be creating two type of methods inside the abstract class, knowing that it can hold regular and abstract  methods

    public void carExpenses(int cost1, int cost2){ // this is a regular method with a body
        int dealerCut = cost1;
        int insuranceCut = cost2;
        int totalExpenses = cost1+cost2;
        System.out.println(" The first agreed Total is :"+totalExpenses);
    }

    public abstract void carYear(); // this is an abstract class without a  body because the body is not allowed here.
    // the body of this method will be provided by the subclass when it inherits this class
}
