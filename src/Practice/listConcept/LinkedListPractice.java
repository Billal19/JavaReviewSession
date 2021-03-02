package Practice.listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {

        // The syntax of linked list is : LinkedList<DataType> LinkedObject = new LinkedList<DataType>(); / this is the syntax of a generic LinkedList
        // the non Generic ArrayList is also acceptable , but Its always recommended to use A generic linkedList ,
        // If we are using Eclipse everytime we create  Non generic LinkedList we will see a yellow lines in it ( which are warnings to specify the dataType)


        // Generic LinkedList :
        LinkedList<String> obj1 = new LinkedList<String>(); // this is the syntax of a Generic LinkedList
        obj1.add("house"); // to add elements to linkedList we will have to use the add() method
        obj1.add("Car");
        obj1.add("Health");
        obj1.add("Job");
        obj1.add("Peace");
        obj1.add("everything else");

        // To print out the size of a LinkedList, we will have to use the size() method:
        System.out.println(obj1.size());
        // To access an element of a linkedList we will have to use the get() method and refer to the index number:
        System.out.println(obj1.get(2));
        // To Change an element of a linkedList , we will have to use the set() method , and refer to the index number , then put the new value next to it :
        obj1.set(5,"necessary things");
        // To remove an element of a linkedList , we will have to use remove() method and refer to the index number ;
        obj1.remove(5);
        // To add a new element to be the fist one on the list , we will have to use addFist() method;
        obj1.addFirst("Money");
        // To add a new element to be the last one on the list , we will have to use addLast() method ;
        obj1.addLast("Wealth");
        // To remove first element , we will have to use removeFist() method :
        obj1.removeFirst();
        // To remove last element , we will have to use removeLast() method ;
        obj1.removeLast();

        // To print out all the elements of a linkedList , we can use so many different logic :
        // 1. use the regular System.out.println(LinkedListObject);
        System.out.println(obj1);

        // 2. We can use for loop;
        for (int i = 0; i<obj1.size();i++){
            System.out.println(obj1.get(i));
        }

        // 3. We can use For--each--loop;(advanced for loop)
        for (String a: obj1){
            System.out.println(a);
        }

        // 4. We can use While loop;
        int b=0;
        while(b<obj1.size()){
            System.out.println(obj1.get(b));
            b++;
        }
        System.out.println("--------");

        // 5.We can use Iterator :
        Iterator<String> ItRef = obj1.iterator();
        while (ItRef.hasNext()){
            System.out.println(ItRef.next());
        }


    }
}
