package Practice.try7.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQlReview {


    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/BillalDataBase?serverTimezone=UTC";
        String UserName ="root";
        String password = "MAC2019$";

        // creating connection :
        Connection myCon = DriverManager.getConnection(url,UserName,password);

        // create statement :
        Statement myState = myCon.createStatement();
        String Query = "INSERT INTO EMPLOYEES VALUE (131, 'Tatiana','Nursing', 23 , 'operation')";
        //Execute the statement :
        myState.execute(Query);

        System.out.println("the query was successfully executed");
        //Close the connection
        myCon.close();
    }
}
