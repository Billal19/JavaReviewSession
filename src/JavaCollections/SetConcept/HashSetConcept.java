package JavaCollections.SetConcept;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {

    public static void main(String[] args) {

        HashSet<String> monkeys = new HashSet<String>();
        // To add elements in a hashSet , we will be using the add() method
        monkeys.add("lemur");
        monkeys.add("orangatang");
        monkeys.add("spider monkey");
        monkeys.add("silverBack gorilla");
        monkeys.add("lemur"); // this is duplicated element , we can write but it can not be considered as its not acceptable in hashSet


        System.out.println(monkeys.size()); // this is used to get the size
        System.out.println(monkeys.remove("lemur")); // this used to remove a specific element as we have to refer to element itself since they are not stored in order or in index bases
        System.out.println(monkeys.isEmpty()); // this will return true or false , it checks if the HashSet is empty or not
        System.out.println(monkeys.contains("spider monkey")); // this will return true or false , it checks for the availability of the element specified in the method





        // To print out all the elements of a hashSet we will be using different approaches:
        // A/ -for each loop : advanced for loop.
        for (String a: monkeys){
            System.out.println(a);
        }
        // B/ -Directly by using the hashSet object name :
        System.out.println(monkeys); // but the output will be in one line

        // C/ -Use Iterator :
        Iterator<String> myItObj = monkeys.iterator();
        while (myItObj.hasNext()){
            System.out.println(myItObj.next());
        }




        System.out.println("--------------");

        // if we wanted to print out the elements of a hashSet one by one we will use the toArray method :
        // in hashSet we can not rely on the position or the order of our adding , as the order that comes back , the elements are sort of hashed , they are unordered
        Object[] myObj = monkeys.toArray();
        System.out.println(myObj[1]);


        System.out.println(monkeys.toArray()[3]); // or we can use the toArray method like this to print out the elements one by one .



    }
}
