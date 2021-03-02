package Practice.try7.JavaFliesReview;

import java.io.File;

public class GetTheFilesInfo {

    public static void main(String[] args) {
        File obj = new File("DataTest/MyCreatedFile.txt");
        if (obj.exists()){
            System.out.println("the file name is : "+obj.getName());
            System.out.println("the file path is : "+obj.getAbsolutePath());
            System.out.println("is the file readable : "+ obj.canRead());
            System.out.println("is the file writable : "+obj.canWrite() );
            System.out.println("the size of the file is : "+obj.length());
        }
        else {
            System.out.println("we could not find the file");
        }
    }
}
