package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDMLCommands {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // In order to create a program by which we can execute the queries , and connect to the database using the JDBC driver , weill have to follow these steps:
        //1. we need to create a connection to the DataBse
        //2. Create statement or Query
        //3.Execute statement or Query
        //4.Close the connection
        // these 4 steps are applicable when we are using the insert , update , delete commands .

        // if we are using the select command , then we will use all the above 4 steps , we only have to add one step before closing the connection;
        //1. we need to create a connection to the DataBse
        //2. Create statement or Query
        //3.Execute statement or Query
        //4.Store the results in result set
        //5.Close the connection

        //Class.forName("com.mysql.jdbc.Driver"); // this class used to to load and register the URL


        //1) Create a connection :
        Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/BillalDataBase?serverTimezone=UTC","root","MAC2019$");

        //2) Create statement/Query;
        Statement myStm = myCon.createStatement(); // this class is used to insert , update , and delete
        String s = "INSERT INTO EMPLOYEE VALUE (108,'Mike','Harry', 32, 'recruiting')"; // this is used to insert data to the dataBase
        //String s = "UPDATE EMPLOYEE SET FIRST NAME='Max' WHERE EMPLOYEE ID=101";// this is used to update the data in the database
        //String s = "DELETE FROM EMPLOYEE WHERE EMPLOYEE ID = 106"; // this is used to delete data from dataBase

        //3) Execute statement or Query;
        myStm.execute(s);

        //4) Close the connection;
        myCon.close();

        System.out.println("The Query has been executed ");


    }
}
