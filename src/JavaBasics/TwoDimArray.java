package JavaBasics;


public class TwoDimArray {
    public static void main(String[] args) {

        // Two dimensional Array in programming language is nothing but an Array of Arrays ,
        // in java Two Dimensional Array , the Data is stored in the rows and columns , we can access the record bu using both Row index and column index (like an excel file)
        // if the Data is linear , we can use one dimensional array

        String abc [][] = new String [3][5];//this means we will be storing values in a table of 3 rows and 5 columns
        System.out.println(abc.length); // this will give us the total number of rows
        System.out.println(abc[0].length);// this will give us the total number of columns

        // 1ST ROW;
        abc [0][0] ="A";
        abc [0][1] ="B";
        abc [0][2] ="C";
        abc [0][3] ="D";
        abc [0][4] ="E";
        // 2ND ROW;
        abc [1][0] ="A1";
        abc [1][1] ="B1";
        abc [1][2] ="C1";
        abc [1][3] ="D1";
        abc [1][4] ="E1";
        // 3RD ROW;
        abc [2][0] ="A2";
        abc [2][1] ="B2";
        abc [2][2] ="C2";
        abc [2][3] ="D2";
        abc [2][4] ="D3";

        System.out.println(abc[2][2]);


        for (int row =0; row<abc.length;row++){ // we will have to use two for loops in order fo us to print
            for (int col=0; col<abc[0].length;col++){
                System.out.println(abc[row][col]);
            }

        }

        System.out.println("*************************************************");

        Object arrayObj [] [] = new Object[2][3]; // this is the object array used in a 2 dimensional array.
        //1st row :
        arrayObj[0][0]="hello";
        arrayObj[0][1]=100;
        arrayObj[0][2]= 'B';

        //2nd row :
        arrayObj[1][0]=29;
        arrayObj[1][1]="steve";
        arrayObj[1][2]= 'D';

        System.out.println(arrayObj[1][1]);

        System.out.println(arrayObj.length); // this prints out the number of rows
        System.out.println(arrayObj[0].length); // this prints out the number of columns

        for (int row=0; row<arrayObj.length;row++){ // this is nested for loop , it prints out all the values stored in a two dimensional array
            for (int col =0; col<arrayObj[0].length;col++){
                System.out.println(arrayObj[row][col]);
            }
        }



    }
}
