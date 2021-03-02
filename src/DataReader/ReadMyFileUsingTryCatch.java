package DataReader;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadMyFileUsingTryCatch {

    public static void main(String[] args) {
        try{
            File myObj = new File ("src/DataReader/MyFile.txt");
            Scanner myScanner = new Scanner(myObj);
            while (myScanner.hasNextLine()){
                String Data = myScanner.nextLine();
                System.out.println(Data);
            }
            myScanner.close();

        } catch (FileNotFoundException e ){
            System.out.println("An error occurred");
            e.printStackTrace();

        }

    }

}
