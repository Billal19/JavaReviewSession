package Practice.try8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetConceptReview {

    public static void main(String[] args) {

        //1-HashSet

        HashSet<String> obj = new HashSet<>();
        obj.add("Steve");
        obj.add("mike");
        obj.add("nick");
        obj.add("mike");
        obj.add("frank");
        obj.add("William");

        System.out.println(obj.size());
        System.out.println(obj.isEmpty());
        System.out.println(obj.contains("william"));
        obj.remove("mike");
        System.out.println(obj);

        for (String i : obj){
            System.out.println(i);
        }

        Iterator<String> itObj = obj.iterator();
        while (itObj.hasNext()){
            System.out.println(itObj.next());
        }

        System.out.println(obj.toArray()[2]);


        //2-Set interface will be implemented by HashSet class:

        Set<Integer> obj1 = new HashSet<>();
        obj1.add(10);
        obj1.add(11);
        obj1.add(13);
        obj1.add(34);
        obj1.add(9);
        obj1.add(15);
        System.out.println(obj.size());




        //3-Set interface will be implemented byt TreeSet;

        Set<String> obj2 = new TreeSet<>();
        obj2.add("abc");
        obj2.add("fgd");
        obj2.add("ksj");
        obj2.add("pli");
        obj2.add("was");

        System.out.println(obj2.toArray()[3]);

        for (String B: obj2){
            System.out.println();
        }


    }
}
