package OOPConceptPart2.polymorphism;

public class Cat extends Animal{

    @Override
    // using the @override annotation will execute our codes automatically during run-time
    // not Using the @override annotation is not going to effect our execution , it will only execute our codes after compiling
    // If we have multiple methods , with "@override" Java will easily identifies which methods needs to override during run-time and which method needs to override after run-time

    public void animalSound(){

        System.out.println("the cat says : meow , meow");
    }

    public void catFood(){
        System.out.println("the cat loves milk");
    }

}
