package DataReader;


import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

    public static void main(String[] args) {
        FileReader FR = null; // the FileReader will read a file in java
        BufferedReader BR = null;

        String fileName ="src/DataReader/Sample.txt";
       try {
           FR = new FileReader(fileName);
           BR = new BufferedReader(FR);

           String data;
           //data=BR.readLine();
           while ( (data=BR.readLine() )!=null) {
               System.out.println(data);
           }

       }catch (Exception e){
           e.printStackTrace();
           System.out.println("File Not Found");
       }finally {
           try {
               FR.close();
               BR.close();
           }catch (Exception e){

           }
       }



    }
}
