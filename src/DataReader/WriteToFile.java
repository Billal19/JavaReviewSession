package DataReader;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {
        try {
            FileWriter obj1 = new FileWriter("ICreatedFile.txt");
            obj1.write("I AM LEARNING HOW TO WRITE IN A FILE USING JAVA ");
            obj1.close();

            System.out.println("We successfully maneged to write to our file");
        }catch (IOException e){
            System.out.println("An error occurred ");
            e.printStackTrace();

        }
    }
}
