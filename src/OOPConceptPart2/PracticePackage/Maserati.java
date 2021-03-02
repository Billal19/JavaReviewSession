package OOPConceptPart2.PracticePackage;

public class Maserati extends Cars { // when Maserati (subclass) extends the Cars class(superclass),
    // we will get an error because we have to implement the abstract class from the superClass in the subclass,
    // we can implement the abstract class either by clicking on the error then hit implement abstract method , or or manually write the same exact abstract method as the one in the superclass
    // Knowing that when we implement it from the error , the @override annotation will be automatically written on top of the method .
    // The @override annotation will allow the code to be executed at run time , and if we multiple methods , the @override annotation will make it easier for java to identify which method will be executed at run-time , and which method will be executed after run-time.
    // Not using the @override annotation will not effect the execution of the program , it will only execute it after compiling.


//    public void carYear(){ // in here we create the method manually without the abstract key work
//        System.out.println("the car year is 2020");
//    }

    public void carExpenses(int cost1, int cost2){ // This is called method overriding because this same name method  was implemented in two different class with the same number of parameters and same dataType , the only difference is the implementation.
        int dealerCut = cost1;
        int insuranceCut = cost2;
        int totalExpenses = cost1+cost2;
        System.out.println("this is the final total agreet to :"+totalExpenses);
    }

    @Override
    public void carYear() { // in here the method was implement by clicking on the error sign then implement method
        System.out.println("the car year is 2020");

    }

    public void carColor(){
        System.out.println("favorite color is dark gray");
    }


}
