package JavaCollections.ListConcept;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

    public static<E> void main(String[] args) {

        // 1. Static Array; its called static array because the size is fixed not changeable , to overcome this we will use Dynamic Array which is ArrayList
        String phones [] = new String[3];
        phones[0]="Iphone";
        phones[1]="Galaxy";
        phones[2]="LGPhone";
        System.out.println(phones.length);

        //2. Dynamic Array = ArrayList
        // 2.1(non generic Array = not restricted to store specific dataType); under the ArrayList we will be able to see a warning yellow line that will ask to define the dataType. this yellow line is usually seen in in Eclipse IDE
        // - ArrayList can Store duplicated values
        // - ArrayList maintains insertion order , means that the arrayList elements are stored in order , and they are printed based on their index numbers
        // - ArrayList is Not Synchronized meaning that the arrayList is not thread Safe , that's why ArrayList is slow comparing to other collections
        // - ArrayList is not Synchronized means that the object is mutable, once creating the arrayList object , that object is calling two threads at a the time but one thread is changing the value of an object that can be effected by another object . that's why arrayList is not thread safe , and not synchronized by default .
        // - It Allows random access to fetch the elements because it stores the values on the index basis
        ArrayList randomArray = new ArrayList(); // this is none generic array , we can store any dataType in it

        randomArray.add("hello");
        randomArray.add(128);
        randomArray.add(15.35);
        randomArray.add('B');
        randomArray.add('B'); // ArrayList can Store duplicated values , when we print out all the values of an arrayList, all the duplicated elements will be printed

        System.out.println(randomArray.size());
        System.out.println(randomArray.get(3));
        for(int i=0 ; i<randomArray.size();i++){
            System.out.println(randomArray.get(i));
        }

        // 2.2(Generic Array = rested to store values of a specific and same dataType)
        ArrayList<Integer> weight = new ArrayList<Integer>();
        weight.add(170);
        weight.add(180);

        // 2.3; If we don't know what DataType we should pass into our arrayList then we will have to the letter <E> after arrayList,
        // making sure that we added the letter <E> in the main method after static , otherwise it will be an Error.
        ArrayList<E> OBJECT = new ArrayList<E>();

        // Employee object Objects; in here we created 3 objects of the employees class , these objects are called "user-defined class objects " will be stored in an arrayList
        Employee e1 = new Employee("Sam",25,"QA");
        Employee e2 = new Employee("Bil",26,"Dev");
        Employee e3 = new Employee("John",27,"Admin");

        // we will create an arrayList;
        ArrayList<Employee> labor = new ArrayList<Employee>(); // we wanted to store employee object , that's why we made our ArrayList hold only employee types as dataType
        labor.add(e1);
        labor.add(e2);
        labor.add(e3);

        // After storing the employee objects in the arrayList , we will use Iterator to traverse the values ;
        Iterator<Employee> ref = labor.iterator();
        while(ref.hasNext()){ // we are using while loop because Iterator doesn't work on index basis
            Employee emp = ref.next(); // we created a variable that has Employee dataType , to store the value of (ref.next)
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.Dept);
        }

        System.out.println("--------------------------------------");

        // AddAll(); the addAll() used to merge two arrayLists together

        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("test");
        ar1.add("selenium");
        ar1.add("QTP");

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("dev");
        ar2.add("Java");
        ar2.add("Javascript");

        ar1.addAll(ar2); // this method used to add the elements of ar2 arrayList to to the elements of ar1 arrayList
        for(int i = 0; i<ar1.size();i++){
            System.out.println(ar1.get(i));
        }

        // removeAll(): this used to remove all the values from an arrayList

        ar1.removeAll(ar2); // by using this method in this example , all the elements added from ar2 arrayList to ar1 arrayList will be removed
        for(int i = 0; i<ar1.size();i++){
            System.out.println(ar1.get(i));

        }

        System.out.println("---------------");

        // retainAll(); this method used to print out only the common elements between two arrayLists
        ArrayList<String> ar3 = new ArrayList<String>();
        ar3.add("test");
        ar3.add("selenium");
        ar3.add("QTP");

        ArrayList<String> ar4 = new ArrayList<String>();
        ar4.add("test");
        ar4.add("SQL");
        ar4.add("ALM");

        ar3.retainAll(ar4);

        for(int i = 0; i<ar3.size();i++){
            System.out.println(ar3.get(i));

        }



    }



}
