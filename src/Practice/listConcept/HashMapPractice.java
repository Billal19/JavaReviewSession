package Practice.listConcept;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        // 1. NON generic hashMap: means that the hashMap is not restricted to store elements of a specific dataType.

        HashMap hashObj = new HashMap();
        hashObj.put("James",20);
        hashObj.put("income",true);
        hashObj.put('M',"initial");
        hashObj.put(28,90); // we use put() method to add elements of a hashMap

        System.out.println(hashObj.get("James")); // we use get() method to access the elements of a hashMap by referring to the key
        System.out.println(hashObj.size()); // we use the size () to print out the size of a hashMap (how many elements a hashMap stores )
        hashObj.remove(28); // we use remove() method to remove elements by referring to the key
        System.out.println(hashObj); // this method is used to print out all the elements of a hashMap.


        System.out.println("-------------------------------------");


        // 2. Generic HashMap : it means that the hashMap is restricted to store only keys and values of A specific DataType ;

        HashMap<String,String> carsModels = new HashMap<>();
        carsModels.put("Toyota","Avalon");
        carsModels.put("BMW","350E");
        carsModels.put("Nissan","Maxima");
        carsModels.put("Honda","Civic");
        carsModels.put("Ford","Mustang");

        System.out.println(carsModels.size());
        System.out.println(carsModels.get("Toyota"));
        System.out.println(carsModels.size());
        carsModels.remove("Nissan");
        System.out.println(carsModels);
        //carsModels.clear(); this method is used to remove all the elements of a hashMap
        //System.out.println(carsModels); after removing all the elements , if we try to print out all the elements of a hashMap , the output will be an empty {}

        for(String i: carsModels.values()){ // we use this for-- each--- loop with the value() method to print out all the values of a hashMap
            System.out.println(i);
        }

        for(String a: carsModels.keySet()){ // we use this for--each--loop with the keySet() method to print out all the keys of a hashMap
            System.out.println(a);
        }

        for(String b: carsModels.keySet()){ // this method  is used to print out all the keys and values of a hashMap
            System.out.println("The Car Brand is :" +b+ "     " +" The Car Name:"+ carsModels.get(b));
        }




    }
}
