package DataReader;

import java.io.File;

public class GetFileInfo {

    public static void main(String[] args) {

        File obj = new File("ICreatedFile.txt");
        if (obj.exists()){
            System.out.println("File name is :"+obj.getName());
            System.out.println("File absolute path is :"+obj.getAbsolutePath());
            System.out.println("Is the file Writable:"+ obj.canWrite());
            System.out.println("Is the file readable :"+ obj.canRead());
            System.out.println("the length of the file is :"+ obj.length());

        }else {
            System.out.println("the File does not exist");
        }
    }
}
