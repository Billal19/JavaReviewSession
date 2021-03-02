package DataReader;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        try {
            File obj= new File ("ICreatedFile.txt"); // In here i only specified the file name , i did not  specify the location where the file will be created ,
            // due to this , our file will be created outside of all the packages , but if wanted to create the file in a specific location , we just have to get the path of that location ,
            // for example we will get the path of the Directory where we wanted to create a file , pass it to File object followed by the fileName .
            // check The practice package for a similar example with the path of directory
            if (obj.createNewFile()){
                System.out.println("File created :" + obj.getName());
            }else {
                System.out.println("File already exists.");
            }
        }catch (IOException e){ // The IOException is usually used in files
            System.out.println("An error occurred");
            e.printStackTrace();
        }





    }
}
