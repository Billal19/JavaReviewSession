package OOPConceptPart2.PracticePackage;

public class MainClass { // this is the execution class

    public static void main(String[] args) { // main method to execute our codes
        Maserati object = new Maserati(); // subclass object has been created to call the methods
        object.carYear();
        object.carExpenses(200,800);
        object.carColor();
    }
}
