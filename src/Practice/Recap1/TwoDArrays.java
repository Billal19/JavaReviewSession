package Practice.Recap1;

public class TwoDArrays {

    public static void main(String[] args) {

        String [] [] clothes = new String[2][3];
        clothes [0][0]= "pants";
        clothes [0][1]= "T-shirt";
        clothes [0][2]= "sweater";
        clothes [1][0]= "tankTop";
        clothes [1][1]= "boxer";
        clothes [1][2]= "pajamas";

        System.out.println(clothes.length); // this will give us the numbers of rows we have in our 2d array
        System.out.println(clothes[0].length); // this will give us the number of columns we have in our 2d array

        System.out.println(clothes[0][2]); // to access any element of an array we will we will have to refer to the row index and the column index

        for ( int row=0; row<clothes.length;row++){
            for(int col=0; col<clothes[0].length;col++){
                System.out.println(clothes[row][col]);
            }
        }


        System.out.println("----------------------------------");
        // we also can use an object array in two dimensional arrays: as we know that the object array is used to store values of different data types in one single variable;

        Object [][] newArray = new Object[2][3]; // we have 2 rows and 3 columns ;
        newArray[0][0]= 'H';
        newArray[0][1]= "Bill";
        newArray[0][2]= 12.56;
        newArray[1][0]= false;
        newArray[1][1]= 128;
        newArray[1][2]= "01/01/1001";

        System.out.println(newArray.length);
        System.out.println(newArray[0].length);
        System.out.println(newArray[1][2]);
        for(int row=0; row<newArray.length;row++){
            for(int col=0;col<newArray[0].length;col++){
                System.out.println(newArray[row][col]);
            }
        }








    }
}
