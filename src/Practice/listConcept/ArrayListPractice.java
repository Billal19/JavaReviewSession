package Practice.listConcept;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {


    public static void main(String[] args) {

        //1. Non generic ArrayList :

        ArrayList clothesObj = new ArrayList(); // this is a non generic array because we did not specify the the dataType
        // we will be using the add() method to elements to this arrayList , since its a non generic arrayList , we can store element of any data Type
        clothesObj.add("pants");
        clothesObj.add("sweater");
        clothesObj.add(250);
        clothesObj.add(78.56);
        clothesObj.add('A');
        clothesObj.add(65.87654f);
        System.out.println(clothesObj.size());// this method used tp get the size of an arrayList
        System.out.println(clothesObj.get(3)); // the get() method used to get access the elements of an array list by referring to the index of the element.
        clothesObj.set(2,700); // the set() method is used to change the elements of an array by referring to the index number , and put the new value right next to the index number.
        clothesObj.remove(3); // the remove() method is used to remove elements by referring to the index number .
        //clothesObj.clear();// this method to remove all the elements

        // How to print out all the elements of an arrayList :
        // we will be using for loop :
        for (int i=0 ; i<clothesObj.size();i++){
            System.out.println(clothesObj.get(i));
        }

        // or we can use this method to print out all the elements :
        System.out.println(clothesObj); // we can use to print out all the elements , just the results will be in one line .

        // we can also use for each loop if our array List is Generic ArrayList

        //2.Generic ArrayList :
        ArrayList<Integer> arrayObj = new ArrayList<Integer>(); // this is a generic arrayList , we only can store integer values ;
        arrayObj.add(20);
        arrayObj.add(50);
        arrayObj.add(30);
        arrayObj.add(10);
        arrayObj.add(40);
        System.out.println(arrayObj.size());


        // to print out all the values of a GENERIC ArrayList , we can use :
        // for loop:
        for (int a = 0 ;a< arrayObj.size(); a++){
            System.out.println(arrayObj.get(a));
        }
        // or this method :
        System.out.println(arrayObj);

        // or for--each--loop(advanced for loop)
        for(int b: arrayObj){
            System.out.println(b);
        }

        // How to sort an arrayList: there is another useful class in the java.util packages , its called a collection class which includes the sort() method used to sort the list alphabetically and numerically
        Collections.sort(arrayObj); // this is the sort method to sort the list numerically since the values are integer values
        System.out.println(arrayObj); // now when we print out the values , they will be sorted numerically


        // there is another way on how to create an arrayList when we don't know what data type we will be using;
        // ArrayList<E> arrayObject = new ArrayList<E>(); / this is the syntax of ArrayList when we don't know what data Type we will be using ,
        // We will be using the <E> instead of put the dataType, also we will have to add the <E> to the main method after the Static , otherwise we will get an error.














    }
}
