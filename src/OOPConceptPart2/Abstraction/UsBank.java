package OOPConceptPart2.Abstraction;

public interface UsBank { // Interface doesn't contain a main method

    int min_bal = 100;

    public void credit (); // Interface doesn't contain a method's body, only method prototype or in the other words "the declaration of the method"
    public void debit ();
    public void transferMoney();



    // Notes;
    // In interface , we only can declare a method , method's body is not allowed , only method prototype
    // In interface , we can declare variables and they are by default Static .
    // In interface , the variables values can not be changed .
    // In interface , static methods are not allowed because the interfaces are part of objects and objects never take static methods
    // In interface , there no main method
    // Interface is abstract in nature = means that we can not create the object of interface
}
