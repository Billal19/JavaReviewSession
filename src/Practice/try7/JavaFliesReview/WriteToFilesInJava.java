package Practice.try7.JavaFliesReview;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFilesInJava {

    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("MyReviewFile1");
            obj.write("i am writing this text to the file that i have created outside of the project");
            obj.write("This is the second text that i am writing to this file");
            System.out.println("we successfully wrote to this file ");
            obj.close();
        }catch (IOException e ){
            System.out.println("an exception has been occurred ");
            e.printStackTrace();
        }
    }
}
