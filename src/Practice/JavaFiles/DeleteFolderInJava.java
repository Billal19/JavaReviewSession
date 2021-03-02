package Practice.JavaFiles;

import java.io.File;

public class DeleteFolderInJava {
    public static void main(String[] args) {
        File object = new File("Data"); // i created a directory by name of Data in my project  then i deleted it using this program
        if (object.delete()){
            System.out.println("We successfully deleted this empty Folder \"Directory\" ");
        }else {
            System.out.println("We failed to delete this empty folder \"Directory\" ");
        }
    }
}
