package JavaBasics;

import java.util.HashSet;
import java.util.Set;

public class HowToFindDuplicateElement {

    public static void main(String[] args) {
        //1).Compare each element : the time complexity of this is solution is o(n) , ( o n square which is the worst approach ), because if we have a lot of elements , it will take a lot of time , (o n square time complexity)
        String[] classes = {"SDLC", "ALM", "SQL", "JIRA", "JAVA", "SELENIUM" , "ALM"};

        for (int i =0 ; i< classes.length;i++){
            for (int j =i+1; j<classes.length; j++){
                if (classes[i].equals(classes[j])){// we will do the if system to compare between the elements
                    System.out.println("duplicate element is :"+classes[i]);
                }
            }
        }



        // 2.use hashSet; Java Collection , it stores unique values ; its the recommended approach to find duplicated elements

        Set<String> mySet = new HashSet<String>();
        for (String chapter: classes){
            if (mySet.add(chapter)==false){// we used the if statement and the add () method , to start adding the elements stored in an array , as we know hashSet doesn't take duplicated elements
                // so its gonna start adding the elements one by one , by the time it gets to the elements that's been added already .it will throw false , which the element will be a duplicated element

                System.out.println("we found the duplicated element:"+chapter);

            }
        }

    }
}
