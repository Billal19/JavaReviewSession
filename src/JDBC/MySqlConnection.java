package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/BillalDataBase?serverTimezone=UTC";
        String user = "root";
        String password = "MAC2019$";

        //1) Create a connection :
        Connection myCon = DriverManager.getConnection(url,user,password);

        //2) Create statement/Query;
        Statement myStm = myCon.createStatement();
        String query = "INSERT INTO EMPLOYEES VALUE (130,'chris','mac', 35, 'cleaning')";
        //3) Execute statement or Query;
        myStm.execute(query);
        //4) Close the connection;
        myCon.close();

        System.out.println("The statement has been successfully executed ");

    }
}
