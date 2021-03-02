package Practice.try8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlInsertCommand {

    public static void main(String[] args) throws SQLException {


        String url = "jdbc:mysql://localhost:3306/BillalDataBase?serverTimezone=UTC";
        String user = "root";
        String password = "MAC2019$";

        //1 - Create the connection:
        Connection myCon = DriverManager.getConnection(url,user,password);

        //2 - Create a statement:

        Statement myStat = myCon.createStatement();
        String myQuery = "INSERT INTO EMPLOYEES VALUE (126,'NICK','MADISON', 27,'SECURITY')";

        //3 - Execute the statement;
        myStat.execute(myQuery);
        System.out.println("the Query has been executed successfully ");

        // 4- close the connection :
        myCon.close();


    }
}
