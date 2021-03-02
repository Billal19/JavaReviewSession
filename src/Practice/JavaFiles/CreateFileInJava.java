package Practice.JavaFiles;

import java.io.File;
import java.io.IOException;

public class CreateFileInJava {



    public static void main(String[] args) {
        try {
            File myObj = new File("/Users/billalyahiaoui/IdeaProjects/JavaReviewSession/DataTest/MyCreatedFile.txt");
            // In the file class object where we have to specify the file name or directory , if we only write the name of the file , the file will be created outside of all the package and directories ,
            // But if we wanted to create  a file in a specific location  , we will have to write the path of that location followed by the file name , like i did in this example , i created a file inside a directory
            if (myObj.createNewFile()){
                System.out.println("A new File has been created :"+ myObj.getName());
            }else{
                System.out.println("The File already exists ");
            }
        }catch (IOException e ){
            System.out.println("An error has been occurred ");
            e.printStackTrace();
        }
    }
}
