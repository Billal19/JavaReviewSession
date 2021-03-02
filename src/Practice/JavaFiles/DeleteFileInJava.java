package Practice.JavaFiles;

import java.io.File;

public class DeleteFileInJava {

    public static void main(String[] args) {

        File myObject = new File("src/Practice/JavaFiles/ThisFile.txt"); // we passed to this object the rootPath of the file
        if (myObject.delete()){
            System.out.println(" We successfully deleted the file with name of :"+myObject.getName());
        }else {
            System.out.println("We failed to delete the file named above");
        }

    }
}
