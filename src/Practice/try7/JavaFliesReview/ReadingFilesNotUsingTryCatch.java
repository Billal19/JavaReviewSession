package Practice.try7.JavaFliesReview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesNotUsingTryCatch {

    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("DataTest/MyCreatedFile.txt");
        Scanner ScanObj = new Scanner(obj);
        while (ScanObj.hasNextLine()){
            System.out.println(ScanObj.nextLine());
        }
    }
}
