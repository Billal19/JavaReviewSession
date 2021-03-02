package Practice.try7.JavaFliesReview;

import java.io.File;

public class DeletingFilesInJava {

    public static void main(String[] args) {
        File obj = new File("/Users/billalyahiaoui/IdeaProjects/JavaReviewSession/ThisWillBeDeleted.txt");
        if (obj.delete()){
            System.out.println("the file has been successfully deleted: "+ obj.getName());
        }
        else {
            System.out.println("we could not delete the file");
        }
    }
}
