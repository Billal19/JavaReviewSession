package Practice.try7.JavaFliesReview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesUsingTryCatch {

    public static void main(String[] args) {
        try {
            File obj = new File("DataTest/MyCreatedFile.txt");
            Scanner myObj = new Scanner(obj);
            while (myObj.hasNextLine()){
                String Data = myObj.nextLine();
                System.out.println(Data);
            }
            myObj.close();

        }catch (FileNotFoundException e ){
            System.out.println("we could not find the file");
            e.printStackTrace();
        }
    }
}
