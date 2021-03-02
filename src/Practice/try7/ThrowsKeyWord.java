package Practice.try7;

public class ThrowsKeyWord {

    // there is a difference between throws and throw new key words in java ;
    // throw new is used to create a custom error , throw new key word used together with a type of exceptions , as java has multiple types of exceptions
    // throws keyword should be used right next to the method

    public static void main(String[] args) {

        ThrowsKeyWord obj = new ThrowsKeyWord();


        try {
            obj.Division();

        }catch (Exception e){
            e.printStackTrace();


        }


    }


    public void Division() {
        int a = 9/0;
    }
}
