package JavaCollections.ListConcept;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

    public static void main(String[] args) {
        LinkedList<String> linkObject = new LinkedList<String>(); // This is a generic linkedList , also the non generic linkedList is acceptable . if we are using Eclipse when we create a non generic linkedList or arrayList  there will be a yellow line which is a warning , because its always recommended to specify the dataType

        //-how to add elements ;
        linkObject.add("test");
        linkObject.add("QTP");
        linkObject.add("Selenium");
        linkObject.add("ALM");
        linkObject.add("Jira");

        //-how to print out all the elements;
        System.out.println(linkObject);

        //-how to use the addFirst();
        linkObject.addFirst("Automation");
        System.out.println(linkObject);

        //-how to use addLast();
        linkObject.addLast("Manual");
        System.out.println(linkObject);

        //- how to access element; use the get() method and refer to the index number;
        System.out.println("the first element has been changed from test to ===> "+linkObject.get(0));

        //- how to set or change element ; use the set () method and refer to the index number of the element we wanted to change;
        linkObject.set(1,"SQL");
        System.out.println(linkObject);

        // How to sort the elements alphabetically;
        Collections.sort(linkObject);
        System.out.println(linkObject);

        //-how to remove elements ; use the remove () method and refer to the index number of the element we wanted to remove;
        linkObject.remove(0);
        System.out.println(linkObject);

        //-how to remove first and last element; we need to use removeFirst(). and removeLast();
        linkObject.removeFirst();
        linkObject.removeLast();
        System.out.println(linkObject);

        System.out.println("----------------------");

        //- How to iterate or print out all the values of a linkedList;
        // there are so many ways on how to print out all the values ;
        // 1-we can use For Loop
        for(int i =0; i<linkObject.size();i++){
            System.out.println(linkObject.get(i));
        }
        // 2-we can use for Each Loop , which is also known as advanced for loop;
        for(String i: linkObject){
            System.out.println(i);
        }
        // 3-we can use Iterator
        Iterator<String> It0bj = linkObject.iterator();
        while(It0bj.hasNext()){
            System.out.println(It0bj.next()); // this is who we use iterator when we want to print out all the values of a linkedList as well as well and an arrayList
        }

        // 4-we can use While Loop
        int A=linkObject.size();
        while (linkObject.size()>=A){
            System.out.println(linkObject);
            A++;
        }

        int i =0;
        while (linkObject.size()>i){
            System.out.println(linkObject.get(i));
            i++;
        }







        // 5-Also we can use directly the linkedList objectName;
        System.out.println(linkObject);





    }
}
