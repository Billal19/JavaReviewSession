package OOPConceptPart2.polymorphism;

public class TestClass {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        Cat myCat = new Cat();
        Dog myDog = new Dog();


        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();

        // This is called Polymorphism ; polymorphism means "many forms" , it occurs when we have many classes that are related to each other by inheritance,
        // As we specified in the in the inheritance topic, inheritance  will allow us to inherit attributes and methods from another,
        // Polymorphism will use those methods to perform different tasks , Polymorphism allows us to perform certain actions in different ways.
        // There are two Types of Polymorphism ;
        // 1- Compile-time polymorphism (method overloading)
        // 2- Run - time polymorphism ( method overriding )
        // Knowing that:
        // 1-Method overloading: is that multiple methods can have the same name with different arguments or parameters, also methods with same names and same numbers of parameters are called methods overloading.
        // 2-Method overriding :is a feature that allows the subclass or the child class to provide its specific implementation using the same method that is already provided by the superclass or the parent class .
        //  overriding methods are implemented in two different classes (child class and the parent class) , inheritance concept is required to allow the subclass to override the superclass.

    }
}
