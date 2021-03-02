package Practice.JavaFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileUsingTryCatchBlock {

    public static void main(String[] args) {

        try {
            File obj2 = new File("MyPracticeFile");
            Scanner scanObj = new Scanner(obj2);
            while (scanObj.hasNextLine()){
                String Data = scanObj.nextLine();
                System.out.println(Data);
            }
            scanObj.close();
        }catch (FileNotFoundException e ){
            System.out.println("An Error occurred");
            e.printStackTrace();
        }

    }
}
