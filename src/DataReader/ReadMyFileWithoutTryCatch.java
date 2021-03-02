package DataReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadMyFileWithoutTryCatch {

    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("src/DataReader/MyFile.txt");
        Scanner myScan = new Scanner(myFile);
        System.out.println(myScan.nextLine()); // if we only use print out statement method ( we only can read the first line of the file).,
        // but if we wanted to read all the lines , we will have to use while loop
        // if we directly wanted to read all the lines of our file, then there is no need to use this print out statement , we just have to use while loop and print out everything from there .
        while (myScan.hasNextLine()){ // now by using while loop we managed to read the text written in our file ( all the lines )
            System.out.println(myScan.nextLine());
        }



    }
}
