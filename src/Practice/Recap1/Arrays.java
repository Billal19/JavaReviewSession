package Practice.Recap1;

public class Arrays {

    public static void main(String[] args) {

        //String arrays :
        String [] weather = new String[3];
        weather[0]= " nice weather ";
        weather[1]= " rainy weather ";
        weather[2]= " sunny weather ";

        System.out.println(weather[0]);
        System.out.println(weather.length);
        for(int a=0 ; a<weather.length; a++){ // we used for loop to print out all the values , for loop is a good practice to print out all the values
            System.out.println(weather[a]);
        }
        System.out.println(weather[0]+""+weather[1]+""+weather[2]); // we used concatenation to print out all the values



        // double array:
        double [] results = new double[2];
        results[0]=12.87;
        results[1]=23.98;

        for (int i = 0; i <results.length; i++ ){
            System.out.println(results[i]);
        }

        // boolean array;

        boolean [] news = new boolean[2];
        news[0]=true;
        news[1]= false;
        System.out.println(news[0]);
        for (int b =0; b<news.length;b++){
            System.out.println(news[b]);
        }

        // another syntax of an array :

        String [] cars = {"mazda", "fiat" , "honda", " camry"};
        cars[3]="Nissan";
        for(int i =0; i<cars.length;i++) {
            System.out.println(cars[i]);
        }
        System.out.println(cars[3]);

        // object arrays : used to store values of different data types in one single variable.

        Object [] myArrays = new Object[4];
        myArrays[0]= true;
        myArrays[1]= "money";
        myArrays[2]= 200;
        myArrays[3]='M';

        System.out.println(myArrays.length);
        System.out.println(myArrays[1]);
        System.out.println(myArrays[3]);

        for(int c=0 ;c<myArrays.length; c++){
            System.out.println(myArrays[c]);
        }





    }


}
