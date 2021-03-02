package Practice.JavaFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWriteToFile {

    public static void main(String[] args) {

        try{
            File obj1 = new File("MyPracticeFile");
            if(obj1.createNewFile()){
                System.out.println("the file has been successfully created :"+ obj1.getName());
            } else{
                System.out.println("File already exists ");
            }
        }catch (IOException e ){
            System.out.println("An error has been occurred");
            e.printStackTrace();
        }

        try {
            FileWriter obj2 = new FileWriter("MyPracticeFile");
            obj2.write("In this example i managed to create and write to a file at the same time , hopefully it will work  ");
            obj2.close();
            System.out.println(" we successfully wrote to our file");
        }catch (IOException e){
            System.out.println("An error occurred ");
            e.printStackTrace();
        }


    }
}
