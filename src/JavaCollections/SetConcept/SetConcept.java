package JavaCollections.SetConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {

    // 1)-What is set :Set is an interface from the java hierarchy of collection framework
    // The set interface is implemented by two classes ( HashSet, linked hashSet ) , and also is extended by one interface called (SortedSet)
    // The sortedSet interface is implemented by one class ( treesSet )

    // 2)- The properties of set interface :
    // - Set interface is an Unordered collection ( the elements are not stored in order ) , that's why they don't have the get() method or access a specific element.
    // - We can not store duplicate elements ( we can add or write as many duplicated elements as we want , but when we print them out , they will not be printed , because set doesn't store them )
    // - Set interface takes only unique values
    // - It has more implementation such as HashSet, LinkedHash, and treeSet


    public static void main(String[] args) {

        // Set interface using hashSet :
        Set<Integer> myObj = new HashSet<>(); // in this example , the hashSet class is implementing the Set interface
        myObj.add(28);
        myObj.add(239);
        myObj.add(45);
        myObj.add(8);
        myObj.add(28);
        myObj.add(83);
        myObj.add(1);
        myObj.add(5);
        System.out.println(myObj.size());
        System.out.println(myObj.isEmpty());// this method will return true if the hashSet is empty, and false if the hashSet is not empty
        System.out.println(myObj.contains(10)); // this method will return true if the hashSet contains this element, and returns false if the hashSet doesn't contain this elements
        myObj.remove(28);// this method is used to remove , NOTE: since the hashSet is not an ordered collection ,
        // if we wanted to remove a certain element , we will be referring directly to the element value instead of the index number. index don't work in hashSet

        for (int i : myObj){
            System.out.println(i);
        }

        Iterator<Integer> myIt = myObj.iterator();
        while (myIt.hasNext()){
            System.out.println(myIt.next());
        }


        System.out.println("--------------");

        // Set interface using TreeSet

        Set<Integer> obj = new TreeSet<>();
        obj.add(28);
        obj.add(239);
        obj.add(45);
        obj.add(8);
        obj.add(28);
        obj.add(2);
        obj.add(1);
        obj.add(3);
        obj.add(7);

        System.out.println(obj.size()); // this method used to get the size
        System.out.println(obj.isEmpty()); // this method is used to check if the treeSet is empty or not
        System.out.println(obj.contains(239)); // this method is used to check if a specific element , exists or not by referring to the element itself
        System.out.println(obj.remove(1)); // this method is used to remove a certain elements by referring to the element itself .
        System.out.println(obj.size());

        System.out.println("-------------------------");
        for (int a : obj){ // we used for each loop to print out all the elements of a treeSet
            System.out.println(a);
        }

        // TreeSet does not take duplicate elements , as we can see in the output , when we printed all the elements , it did not print the duplicated ones
        // In The TreesSet the elements are printed in a sorted order , they are per default sorted in an ascending order .




    }




}
