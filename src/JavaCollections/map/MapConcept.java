package JavaCollections.map;

import java.util.HashMap;
import java.util.Map;

public class MapConcept {

    // 1)-What is map in java : map in java is an interface that will be implemented by hashMap,
    // The hashMap class will implement the map interface

    //2)- What are the map properties :
    // They contain value based on key
    // They are not ordered
    // The "Key" must be unique ( duplicated keys are not allowed )===> we can add a duplicated key to our elements but it will not be considered while we print out all the element , only the last added one that's going to be considered
    // The "value" can be duplicated


    public static void main(String[] args) {

        Map<String, String> fruits = new HashMap<>();
        // We will be using the put () to add keys and values to our hashmap
        fruits.put("red","apple");
        fruits.put("yellow","banana");
        fruits.put("white","radish");
        fruits.put("green","apple");

        // To access the element of a hashMap , we need to use the get() method and refer to the key ;
        System.out.println(fruits.get("red"));
        // To print out all the values and keys of a map , we will use for - each loop with the keySet () method :
        for (String b: fruits.keySet()){
            System.out.println("the key is:"+b+ "the value is :"+fruits.get(b));
        }

        //We also can print out all the value of a map directly by using the map object reference variable name :(just the output will be printed in one line)
        System.out.println(fruits);

        // Check if the key exist or not : we will be using the containsKey() method , this method returns a boolean type
        System.out.println(fruits.containsKey("blue"));
        // check if the value exist or not: we will be using the containValue() method , this method will return a boolean type
        System.out.println(fruits.containsValue("apple"));
        // check the size of a map :
        System.out.println(fruits.size());


    }




}
