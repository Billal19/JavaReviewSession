package JavaCollections.ListConcept;


import java.util.ArrayList;
import java.util.Iterator;

public class VehicleArrayList {

    public static void main(String[] args) {

        //1.we will create 4 objects of the vehicle class , this object are called user-defined class object , we will store them in an arrayList;

        Vehicle v1 = new Vehicle("PickUp Truck","Ford",2017);
        Vehicle v2 = new Vehicle("Sports","Dodge",2018);
        Vehicle v3 = new Vehicle("Van","Chevy",2019);
        Vehicle v4 = new Vehicle("Classic","Mercedes",2020);

        //2.Now we are storing the user defined class objects in the arrayList
        ArrayList<Vehicle> Cars = new ArrayList<Vehicle>();
        Cars.add(v1);
        Cars.add(v2);
        Cars.add(v3);
        Cars.add(v4);

        //3.Now in order for us to loop traverse these objects , we will have to create an Iterator;
        Iterator<Vehicle> ItObj = Cars.iterator();
        while (ItObj.hasNext()){
            Vehicle vhc = ItObj.next();
            System.out.println(vhc.vehicleType);
            System.out.println(vhc.TruckBrand);
            System.out.println(vhc.TruckYear);
        }


        System.out.println("---------------------------------------------------");

        // 1.How to use the addAll() Method; the addAll() used to merge two ArrayList Together

        ArrayList<String> exp = new ArrayList<String>();
        exp.add("School");
        exp.add("Stress");
        exp.add("headache");

        ArrayList<String> exp1 = new ArrayList<String>();
        exp1.add("Pandemic");
        exp1.add("Vaccination");
        exp1.add("recession");

        exp.addAll(exp1);

        for(int i=0; i<exp.size();i++){
            System.out.println(exp.get(i));
        }

        // 2.How to use the removeAll();

        exp.removeAll(exp1);
        for(int i=0; i<exp.size();i++){
            System.out.println(exp.get(i));
        }

        // 3.How to use the retainAll();

        ArrayList<String> exp2 = new ArrayList<String>();
        exp2.add("School");
        exp2.add("Stress");
        exp2.add("Victory");

        ArrayList<String> exp3 = new ArrayList<String>();
        exp3.add("Pandemic");
        exp3.add("Vaccination");
        exp3.add("Victory");

        exp2.retainAll(exp3);


        for(int i=0; i<exp2.size();i++){
            System.out.println(exp2.get(i));
        }
















    }





}
