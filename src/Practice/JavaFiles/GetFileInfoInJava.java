package Practice.JavaFiles;

import java.io.File;

public class GetFileInfoInJava {

    public static void main(String[] args) {
        File object = new File("MyPracticeFile"); // we passed the root path of the file
        if (object.exists()){
            System.out.println("This method used to get the name of the file:"+object.getName());
            System.out.println("This method used to test weather the file readable or not:"+object.canRead());
            System.out.println("This method used to test weather the file writable or not:"+object.canWrite());
            System.out.println("This method used to get the absolute path of a file :"+object.getAbsolutePath());
            System.out.println("This method used to return the file size in bytes:"+object.length());
        }else {
            System.out.println("File not found");
        }
    }
}
