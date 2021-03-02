package Practice.listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class GeneralArrays {

    public static void main(String[] args) {




        // 1. Regular arrays (1 dimensional arrays):
        String [] firstNames= new String[3];
        firstNames[0]="James";
        firstNames[1]="John";
        firstNames[2]="Jay";
        System.out.println(firstNames.length);
        System.out.println(firstNames[0]);
        for(int names=0; names<firstNames.length;names++){ // for loop to print out all the elements of an array
            System.out.println(firstNames[names]);
        }
        System.out.println(firstNames[0]+" "+firstNames[1]+" "+firstNames[2]); // also we can use concatenation to print out all the values of an array
        // Arrays are called static arrays because the size can not modified , it is fixed , however we can overcome this by creating a dynamic array , (ArrayList, collection , hashMap)
        // Also in the arrays we only can store variables of the the same DataType , to overcome this we will have to use Object Arrays that will allow us to to store values of different DataTypes in one single variable.

        // Object Arrays:
        Object[] arrayObj = new Object[3];
        arrayObj[0]="hello";
        arrayObj[1]= 120;
        arrayObj[2]= 'M';
        System.out.println(arrayObj.length); // to print out how many elements an object array has.
        System.out.println(arrayObj[2]); // to access the elements of an object array by referring to the index number
        for (int a=0; a<arrayObj.length;a++){ // we use for loop to print out the element stored in the object array
            System.out.println(arrayObj[a]);
        }
        System.out.println(arrayObj[0]+" "+arrayObj[1]+" "+arrayObj[2]); // also we can concatenation to print out all the elements stored in an array



        System.out.println("---------------------------------------------------");


        //2.Two dimension Array:
        String [][] cities = new String[2][3];
        cities[0][0]= "New york";
        cities[0][1]= "Los angeles";
        cities[0][2]= "San francisco";
        cities[1][0]= "Chicago";
        cities[1][1]= "Dallas";
        cities[1][2]= "Las vegas";
        System.out.println(cities[1][2]); // this is how to access the elements of a two dimensional array
        System.out.println(cities.length); // this used to print out the number of row a 2D array has
        System.out.println(cities[0].length);// this used to print out the number of columns a 2D array has .
        for(int row=0 ; row< cities.length;row++){ // we use this double for loop to print out all the values of a two dimensional array.
            for (int col=0; col<cities[0].length;col++){
                System.out.println(cities[row][col]);
            }
        }

        // Two dimensional Object Array; STORES ELEMENTS OG ANY DATE TYPE
        Object[][] multiType = new Object[2][3];
        multiType[0][0]="Hi";
        multiType[0][1]=50;
        multiType[0][2]='F';
        multiType[1][0]=12.76;
        multiType[1][1]=87266892;
        multiType[1][2]=32.98765432;
        System.out.println(multiType[1][0]);
        System.out.println(multiType.length); // the number of rows
        System.out.println(multiType[0].length);// the number of columns
        for(int row=0; row<multiType.length;row++){
            for(int col =0 ; col<multiType[0].length; col++){
                System.out.println(multiType[row][col]);
            }
        }

        System.out.println("-------------------------------------");

        //3.ArrayList :
        // ArrayList can store duplicated values,
        // ArrayList is not synchronized , means that the arrayList is not thread Safe , that's why it is slow comparing to other collection .
        // ArrayList is not Synchronized means that the object of an arrayList is mutable, once creating an object , that object can call two threads at a time , one thread is changing the value of an object that can be effected by another object , that's why arrayList is not thread safe .
        // ArrayList maintains insertion order .
        // there are two type of arrayLists :
        // * Non generic ArrayList that stores values of any dataType , its not restricted to store value of a specific of dataType.
        // * Generic ArrayList stores only values of a specific and same DataType

        // Non Generic ArrayList :
        ArrayList arrObj = new ArrayList();
        arrObj.add('B'); // we use the add() method to store elements
        arrObj.add(20);
        arrObj.add("steve");
        arrObj.add("David");
        System.out.println(arrObj.get(2)); // we use the get method tp access the elements of anm arrayList by referring to the index number
        System.out.println(arrObj.size()); // the size method is used to print out the size of an arrayList
        arrObj.set(1,100);
        arrObj.remove(3); // this method is used to remove an element by referring to the index number
        System.out.println(arrObj);// this method used to print out all the values of an arrayList
        for(int b=0;b<arrObj.size();b++){ // we use for loop to print out all the values of an arrayList , we also can for Each loop if the arrayList is generic
            System.out.println(arrObj.get(b));
        }

        // Generic ArrayList:
        ArrayList<Integer> bestNumbers= new ArrayList<Integer>();
        bestNumbers.add(200);
        bestNumbers.add(600);
        bestNumbers.add(98);
        bestNumbers.add(65);
        bestNumbers.add(25);
        System.out.println(bestNumbers.size());
        System.out.println(bestNumbers.get(2));
        bestNumbers.remove(4);
        bestNumbers.set(1, 478);
        System.out.println(bestNumbers);
        for(int c=0; c<bestNumbers.size();c++){
            System.out.println(bestNumbers.get(c));
        }
        for (Integer d: bestNumbers){// in here we are able to use for each loop to print out all the values since our arrayList is Generic
            System.out.println(d);
        }

        // If we don't know what dataType we will be using in our arrayList , we just have to use this Syntax :
        //ArrayList<E> obj = new ArrayList<E>(); we just have to the <E> to the main method after the keyWord static otherwise it will throw an error .


        // in here i will be creating the FollowingGeneralArrayList object , these objects are called USER DEFINED CLASS OBJECTS , we will store them in an arrayList
        FollowingGeneralArrayList v1 = new FollowingGeneralArrayList("Mustang", "Ford", 2018);
        FollowingGeneralArrayList v2 = new FollowingGeneralArrayList("Camaro", "Chevy", 2019);
        FollowingGeneralArrayList v3 = new FollowingGeneralArrayList("Passat", "vw", 2020);

        // we will be creating an ArrayList to store these objects ( user defined class objects ) :

        ArrayList<FollowingGeneralArrayList> object = new ArrayList<>(); // since we are only going to store these objects in this arrayList ,between the diamond braces we will put the className as a dataType.
        object.add(v1);
        object.add(v2);
        object.add(v3);

        // After storing the objects in an arrayList  we will create an iterator to traverse the collection or the values  ;
        Iterator<FollowingGeneralArrayList> itObject = object.iterator();
        while (itObject.hasNext()){ // we used while Loop Because the iterator doesn't work on index basis
            FollowingGeneralArrayList obj = itObject.next();
            System.out.println(obj.carName);
            System.out.println(obj.carBrand);
            System.out.println(obj.carYear);

        }


        System.out.println("***************************************************");

        //How to use the addAll() method: the addAll method is used to merge two Arrays together :
        ArrayList<String> ob1 = new ArrayList<>();
        ob1.add("SDCL");
        ob1.add("STLC");
        ob1.add("ALM");
        System.out.println(ob1);

        ArrayList<String> ob2 = new ArrayList<>();
        ob2.add("Jira");
        ob2.add("SQL");
        ob2.add("JAVA");
        System.out.println(ob2);

        ob1.addAll(ob2); // this is how we use the addAll method to merge two arrayList together.
        for(int i = 0; i<ob1.size();i++){
            System.out.println(ob1.get(i));
        }

        // How to use the removeAll method ,
        ob1.removeAll(ob2); // by using this method we will be able to remove all the elements added from ob2 to ob1 arrayList .
        for(int a = 0; a<ob1.size();a++){
            System.out.println(ob1.get(a));
        }

        // how to use retainAll()Method : this method is used to print out only the common elements stored in two arrayList;

        ArrayList<String> ob3 = new ArrayList<>();
        ob3.add("TOYOTA");
        ob3.add("NISSAN");
        ob3.add("HONDA");

        ArrayList<String> ob4 = new ArrayList<>();
        ob4.add("CHEVROLET");
        ob4.add("CHRYSLER");
        ob4.add("HONDA");

        ob3.retainAll(ob4);
        for(int b = 0; b<ob3.size();b++){
            System.out.println(ob3.get(b));
        }




















    }
}
