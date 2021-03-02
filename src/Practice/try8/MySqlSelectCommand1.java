package Practice.try8;

import java.sql.*;


public class MySqlSelectCommand1 {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/BillalDataBase?serverTimezone=UTC";
        String user = "root";
        String password = "MAC2019$";

        //Create the connection:
        Connection ConObj = DriverManager.getConnection(url,user,password);

        //Create a statement:
        Statement stateObj = ConObj.createStatement();
        String Query = "SELECT EMPLOYEE_ID , FIRST_NAME , LAST_NAME FROM EMPLOYEES";

        ResultSet results = stateObj.executeQuery(Query);

        while (results.next()){
            int empID = results.getInt("EMPLOYEE_ID");
            String fName = results.getNString("FIRST_NAME");
            String lName = results.getNString("LAST_NAME");

            System.out.println(empID+" "+fName+" "+lName);
        }

        System.out.println("the Query was successfully executed ");


    }
}
