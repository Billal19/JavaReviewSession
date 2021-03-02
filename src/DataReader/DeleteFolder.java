package DataReader;

import java.io.File;

public class DeleteFolder {
    // In this class i created a Direcotry by the name of " ToBeDeleted " , i used the same program to delete  FILE .
    // I successfully managed to delete this Directory by passing the path of it to the File Class Object




    public static void main(String[] args) {
        File obj1 = new File("ToBeDeleted");
        if (obj1.delete()){
            System.out.println("Folder has been deleted "+obj1.getName());
        }else{
            System.out.println("Failed to delete the file for some unknown reasons");
        }
    }
}
