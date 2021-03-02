package JavaCollections.QueueConcept;

import java.util.LinkedList;
import java.util.Queue;

public class QueueConcept {


    public static void main(String[] args) {
        Queue<String> bbqLine = new LinkedList<String>(); // we will have to use linkedList since these two classes are related
        bbqLine.add("Jackson");
        bbqLine.add("Tyrone");
        bbqLine.add("Susan");
        bbqLine.add("Brittany");
        bbqLine.add("John");


        System.out.println(bbqLine.poll()); // this used to remove the first element in an Queue
        System.out.println(bbqLine.peek()); // the peek method is used to just look at the first element .
        //bbqLine.poll(); every time we use the poll () method the first element gets removed
        System.out.println(bbqLine.size());
        System.out.println(bbqLine.contains("ali"));

        System.out.println(bbqLine.toArray()[3]);

        System.out.println(bbqLine);
    }
}
