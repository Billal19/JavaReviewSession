package DataReader;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        File myObj = new File ("src/DataReader/Test.txt"); // we need to pass the file path in order for us to delete it

        if (myObj.delete()){
            System.out.println("Deleted the file :"+myObj.getName());
        }else {
            System.out.println("Failed to delete the File");
        }

    }
}
