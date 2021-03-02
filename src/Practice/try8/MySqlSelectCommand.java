package Practice.try8;

import java.sql.*;

public class MySqlSelectCommand {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/BillalDataBase?serverTimezone=UTC";
        String user = "root";
        String password = "MAC2019$";

        // 1- Open the connection :
        Connection myCon = DriverManager.getConnection(url,user,password);

        // 2- Create a statement:
        Statement myState = myCon.createStatement();
        String SelectQuery = "select employee_id , first_name, last_name, age , department_name from employees";

        // 3- Execute the statement and store it in a resultSet method();

        ResultSet myResults = myState.executeQuery(SelectQuery);

        while (myResults.next()){
            int ID = myResults.getInt("EMPLOYEE_ID");
            String fName = myResults.getNString("FIRST_NAME");
            String lName = myResults.getNString("LAST_NAME");
            int Age = myResults.getInt("AGE");
            String Department = myResults.getNString("DEPARTMENT_NAME");

            System.out.println(ID +" "+fName+" "+lName+" "+Age+" "+Department);


        }

        myCon.close();





    }
}
