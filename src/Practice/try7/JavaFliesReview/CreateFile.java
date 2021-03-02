package Practice.try7.JavaFliesReview;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        try {
            File obj = new File("MyReviewFile1");
            if (obj.createNewFile()){
                System.out.println("the file was successfully created outside of our java project because we did not specify the exact location");
            }
            else {
                System.out.println("file already exist");
            }

        } catch (IOException e ){
            System.out.println("an exception has been occurred");
        }
    }
}
