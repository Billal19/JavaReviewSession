package JavaBasics;

public class GarbageCollectionConcept {

    public void finalize(){ // this finalize method will be called without calling it from the main method(without creating object or calling directly from the main method if its static) , because we used the System.gc(); to called the garbage collection method in java
        System.out.println("operation completed");
    }


    public static void main(String[] args) {

        GarbageCollectionConcept object1 = new GarbageCollectionConcept(); // this object will hold a space in the heap of our memory
        GarbageCollectionConcept object2 = new GarbageCollectionConcept(); // this object will hold a space in the heap of our memory

        object1=null; // this means that nothing is referring to this object , if we comment down this , we will not get an output in the consul
        object2=null;

        // since these two objects are not being referred , there is a concept in java called garbage collection;
        // what is Garbage collection in java:
        // is an automatic memory management system that java created, what it does , is that it allocates the memory back in the java heap once it gets rid of some objects you created without references.
        // Java Automatically calls the garbage collector to destroy and get rid of the blank object
        // we also can call the garbage manually : System.gc();

        System.gc(); // this is how we call the garbage collector manually
    }
}
