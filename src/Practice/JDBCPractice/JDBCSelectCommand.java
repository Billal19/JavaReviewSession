package Practice.JDBCPractice;

import java.sql.*;

public class JDBCSelectCommand {

    // If wanted to select the select the database then we will add one step after executing the query which will be the result storing :
    // 1-create a connection
    // 2-create a statement / or query
    // 3-execute the statement or query
    // 4-Store the results in result set
    // 5-close the connection

    public static void main(String[] args) throws SQLException {
        String Url = "jdbc:mysql://localhost:3306/BillalDataBase?serverTimezone=UTC";
        String User = "root";
        String Password ="MAC2019$";

        //1) create the connection :
        Connection myCon = DriverManager.getConnection(Url,User,Password);
        //2) create a statement :
        Statement stmt = myCon.createStatement();
        String s = " select employee_id , first_name , last_name, department_name  from employees ";


        //3) Execute the statement or the query / & store data in ResultSet ;
        ResultSet myResult = stmt.executeQuery(s);
        while (myResult.next()){
            int empI = myResult.getInt("EMPLOYEE_ID");
            String firstName = myResult.getNString("FIRST_NAME");
            String lastName = myResult.getNString("LAST_NAME");
            String departmentName = myResult.getNString("DEPARTMENT_NAME");

            System.out.println(empI+" "+firstName+" "+lastName+" "+departmentName);


        }

       //5) close the connection
        myCon.close();

        System.out.println("the data has been retrieved ");

    }


}
