package EnumConcept;

// Why do we use enums : we use enums for things that do not change , also its useful because we don't have to specify the type




enum Degree { // the enum could be used outside the class as it could be used out inside the class , in this example its used outside the class
    HIGH , MEDIUM , LOW
}


public class EnumConceptInJava {

    public static void main(String[] args) {
        Degree myEnum = Degree.HIGH;
        System.out.println(myEnum);

        switch (myEnum){
            case HIGH:
                System.out.println("The degree of warmth was High");
                break;
            case LOW:
                System.out.println("The degree of warmth was Low ");
                break;
            case MEDIUM:
                System.out.println("The degree of warmth was Medium");
                break;
            default:
                System.out.println("we haven't found a match of this cases ");
        }


        // If we wanted to print out all the value or the constants of an enum , we can use for loop (advanced for loop ) with the values method
        // The enum type has a values() method , which returns an array of all enum constants , this method is useful when you want to loop through the constants of an enum
        for( Degree myEnum2: Degree.values() ){
            System.out.println(myEnum2);
        }




    }






}
