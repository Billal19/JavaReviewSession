package JavaBasics;

import java.util.HashMap;

public class HashMapConcept {

    public static void main(String[] args) { //
        HashMap firstHash = new HashMap(); // this is a syntax of none restricted hashMap (means we can pass any key and value of any data Type)
        firstHash.put(20,"cars");
        firstHash.put("mustang",2019);
        firstHash.put(12,56); // the put method is used to add elements.
        System.out.println(firstHash); // this method used to print out all the values
        System.out.println(firstHash.size()); // this is the method to print out the size of a HashMap
        System.out.println(firstHash.get(20)); // this method used to access elements by referring to the key
        firstHash.remove(12) ;// this method used to remove elements by referring to the keys
        System.out.println(firstHash);

        System.out.println("**********************************************");



        // in here we Created a HashMap object called capitalCities
        HashMap<String,String> capitalCities = new HashMap<String, String>();

        // In here we Added keys and values (Country, City)
        capitalCities.put("ENGLAND","LONDON");
        capitalCities.put("FRANCE","PARIS");
        capitalCities.put("GERMANY","BERLIN");
        capitalCities.put("NORWAY","OSLO");
        capitalCities.put("USA","WASHINGTON DC");
        System.out.println(capitalCities); // this method will give us all the values(keys and values) stored in a hashMap
        System.out.println(capitalCities.get("USA")); // this method is used to access an element by referring to a key
        capitalCities.remove("FRANCE"); // this method is used to remove an element by referring to its key
        System.out.println(capitalCities);
        //capitalCities.clear(); this method to remove all the elements or outputs
        System.out.println(capitalCities); // after removing all the items the output will be be two empty curly braces{}
        System.out.println(capitalCities.size());// this method used to print out the size of a hashMap

        // How to print out all the keys of a hashMap; we will have to use the keySet method (); and a for each loop
        for(String i:capitalCities.keySet()){
            System.out.println(i);
        }
        // How to print out all the values of hashMap; we will have to use the value method (): and a for each loop
        for (String i: capitalCities.values()){
            System.out.println(i);
        }
        // how to print out all the values(keys and values) of a hashMap: we will have to use for each loop;
        for (String i :capitalCities.keySet()){
            System.out.println("Country:   "  +  i   + "    Capital :  "  +capitalCities.get(i));
        }













    }
}
