package JavaBasics;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

    public static void main(String[] args) {

        //1- Non generic ArrayList ; means we don't have to specify the dataType , it could be any dataType , String ,int , double......, stored in one ArrayList

        ArrayList arrayObject = new ArrayList(); // This is The ArrayList Syntax

        // To add elements to an ArrayList we should use the add (); method ==> ArrayObjectName.add();

        arrayObject.add("Bill"); // first element (index0)
        arrayObject.add(29); //1
        arrayObject.add('M');// 2
        arrayObject.add(12.58);// 3
        arrayObject.add(100000); // 4




        System.out.println(arrayObject.size()); // this is the statement to get the size of an arrayList
        System.out.println(arrayObject.get(0)); // This is the statement to access a specific element ( we need to use the get() method and refer to the index number)
        //System.out.println((arrayObject.get(5)));// this is will an out of bound exception because the 5th element doesn't exist.

        arrayObject.set(0,"Billal"); // This method used to change an item : use the set()method and refer to the index number
        System.out.println(arrayObject.get(0));

        arrayObject.remove(3);
        System.out.println(arrayObject);

        System.out.println(arrayObject); // we can use this statement to print out all the values of an arrayList

        for (int i =0; i<arrayObject.size();i++){ // also we can do for loop ( for loop is much more practical)
            System.out.println(arrayObject.get(i));
        }

        //2-Generic ArrayList : means we have to restrict our arrayList to hold a specific DataType
        ArrayList <Integer> level = new ArrayList<Integer>(); // This Generic ArrayList Accepts only Integer values
        level.add(100);

        ArrayList<Character> initial = new ArrayList<Character>(); // This generic Array hold only Character dataType
        initial.add('B');
        initial.add('Y');

        for(Character i : initial){ // we also can use for each loop to print out all the values
            System.out.println(i);
        }

        System.out.println("*************************************");

        // in the this ArrayList we will do a recap of a whole ArrayList concept including the new method that we didn't cover above ( sorting method);
        // How to sort an arrayList : there is another useful class in the java.util package , its the collections class that includes the sort() for sorting lists alphabetically, and numerically.

        ArrayList<String> cars = new ArrayList<String >(); // This a restricted ArrayList , because we only can store values of a specific data type which is String
        cars.add("Tesla"); // the add method () is used to add elements to an arrayList
        cars.add("Jaguar");
        cars.add("AudiQ8");
        cars.add("Lamborghini");
        cars.add("Dodge");

        System.out.println(cars.get(0)); // the get() method used to access elements in an arrayList
        System.out.println(cars.size()); // the size () method used to print out the size or how many elements an arrayList Holds
        cars.set(4,"Maserati"); // the set () method is used to change the element by referring to the index number
        cars.remove(3); // the remove () used to remove an element from an arrayList by referring to the index number.
        //cars.clear(); the clear () method is used to remove all the elements of an arrayList
        System.out.println(cars); // this method used to print out all the elements of an arrayList , we also can use for loop and and for-each-loop if the arrayList is generic
        for(int allCars =0; allCars<cars.size();allCars++){ // i used for loop to print out all the values
            System.out.println(cars.get(allCars));
        }
        for(String allCARS: cars){// i used for-each-loop to print out all the values
            System.out.println(allCARS);
        }

        System.out.println("_______");
        Collections.sort(cars); // This sort() method is used to for sorting ArrayLists alphabetically and numerically
        for(int sorting = 0; sorting<cars.size(); sorting++){ // we used for loop to print out all the sorted values
            System.out.println(cars.get(sorting));
        }

        System.out.println("_________");
        for (String sorting : cars){ // we used for-each-loop to print out all the value
            System.out.println(sorting);
        }

        System.out.println("____________");

        System.out.println(cars); // we also can use this method to print out the values


       // ArrayList<E> object = new ArrayList<E>();if we don't know what DataType we are using , then instead of putting the DataType, we will put <E>,
        //also we will have to to go to our main method and add the < E> after static , otherwise we will get an error.














    }
}
