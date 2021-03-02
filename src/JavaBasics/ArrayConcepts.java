package JavaBasics;

public class ArrayConcepts {

    public static void main(String[] args) {

        // 1. Arrays are used to store multiple values in a single variable of the same DataType,  instead of declaring separate variables for each value, and this is the advantage of arrays
        // 2. Arrays are objects , but their indexes may hold either primitive types , or reference types(object types ).
        // 3. To declare an array, define the variable type with square brackets:
        // 4. The syntax of Arrays is : DataType NameOfArrayVariable[] = new DataType [ Array length or size ];
            // Also we can use this syntax ; DataType NameOfArrayVariable [] = { ,,,, we put the values separated by comma,,,,};

        // 5.The Disadvantages of arrays are:
        // The length or the size is fixed,  that's why its called static arrays , we can not change the size , To overcome this issue , we will use the collections , ArrayList , HashTables, and dynamic arrays
        // Stores only similar DataTypes ==> To overcome this issue , we will need to use Object Arrays that allow us to store values of different DataTypes in one variable

        // 5.Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
             // Arrays are 0 indexed ; for example if we have 10 elements , the range is from 0 to 9 .
             //Lowest bound/index = 0
             //Upper bound / index = n-1 ( where n is the array size ).
        // 6. To find out how many elements an array has, use the length property that will give us the length


        int i []=new int[4];
        i[0]=10;
        i[1]=20;
        i[2]=30;
        i[3]=40;



        System.out.println(i[1]);
        System.out.println(i[3]);
        //System.out.println(i[4]); // This will throw an ArrayIndexOutOfBound, because the index 4 is out of bound, this will prevent the codes from being executed , that's why i am commenting it down .

        System.out.println(i.length);// this is called length property used to print out the length of the array

        // To print out all the values of an array , we will have to use : For Loop
        for (int j=0 ; j<i.length;j++){
            System.out.println(i[j]);
        }


        //2. Double Arrays ;
        double a [] = new double [3];
        a[0]= 10.12;
        a[1]= 21.46;
        a[2]= 52.98;

        System.out.println(a[0]);

        //3. Char Arrays ;
        char b [] = new char [3];
        b[0]='m';
        b[1]='$';
        b[2]='9';
        System.out.println(b[1]);

        //4.boolean Arrays ;
        boolean c[] = new boolean[2];
        c[0]=true;
        c[1]=false;
        System.out.println(c[0]);

        //5.String Arrays;
        String clothes [] = new String[4];
        clothes[0]="Sweater";
        clothes[1]="Pants";
        clothes[2]="Jacket";
        clothes[3]="Pajamas";

        System.out.println(clothes[1]);
        System.out.println(clothes.length);

        for(int g =0; g<clothes.length;g++){ // in here we used for loop to print out all the values stored in this array
            System.out.println(clothes[g]);
        }
        System.out.println(clothes[0]+","+clothes[1]+","+clothes[2]+","+clothes[3]); // we also can use concatenation to print out all the values stored in this array , but the output will be in one line


        //6. Object Arrays ; (object is a super class in java that allows us to store values of different DataTypes in one single variable)

        Object abc[]=new Object[5];
        abc[0]= "Tom";
        abc[1]= 'F';
        abc[2]= true;
        abc[3]=20.20;
        abc[4]="03/12/2020";


        System.out.println(abc[4]);
        for (int k =0 ; k<abc.length;k++){ // in here we used for loop to print out all the values stored in this array
            System.out.println(abc[k]);
        }
        System.out.println(abc[0]+","+abc[1]+","+abc[2]+","+abc[3]+","+abc[4]); // also we can do concatenation to print out all the values stored in the object array

        //7.Array with another syntax;

        String cars []={"Volvo", "Tesla", "Jaguar", "Maserati","RollsRoyce" };
        cars[0]="Lamborghini"; // in here i change the value from "Volvo" to "Lamborghini" , the new value overwrites the existing value
        System.out.println(cars[0]);
        System.out.println(cars.length);

        System.out.println(cars[0]+","+cars[1]+","+cars[2]+","+cars[3]+","+cars[4]); // we did concatenation to print all the values

        for (int p = 0 ; p<cars.length; p++){ // also we can for loop
            System.out.println(cars[p]);
        }












    }
}
