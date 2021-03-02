package Practice.JavaFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWithoutTryCatchBlock {

    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("MyPracticeFile");
        Scanner myScan = new Scanner(obj);
        while (myScan.hasNextLine()){
            System.out.println(myScan.nextLine());

        }
    }
}
