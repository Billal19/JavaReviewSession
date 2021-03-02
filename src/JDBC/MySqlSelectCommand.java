package JDBC;

import java.sql.*;

public class MySqlSelectCommand {

    // In the previous class (MySqlDMLCommands) we learned how to insert , update and delete the database .
    // Using the select command , will help us execute the queries and return the values in the console )


    public static void main(String[] args) throws SQLException {

        String Url = ("jdbc:mysql://localhost:3306/BillalDataBase?serverTimezone=UTC");
                     //"jdbc:mysql://localhost:3306/BillalDataBase?serverTimezone=UTC";
        String user = "root";
        String  password = "MAC2019$";

        //1)create the connection :
        Connection myCon = DriverManager.getConnection(Url,user,password);
        //2)create a statement :
        Statement myStat = myCon.createStatement();
        String myQuery = "select employee_id , first_name, last_name, age , department_name from employees";
        //3-4) Execute the statement or the query and store the result in the ResultSet;


        ResultSet myRe = myStat.executeQuery(myQuery);
        while (myRe.next()){
            int empI = myRe.getInt("EMPLOYEE_ID");
            String FName = myRe.getNString("FIRST_NAME");
            String LName = myRe.getNString("LAST_NAME");
            int Age = myRe.getInt("AGE");
            String DName = myRe.getNString("DEPARTMENT_NAME");


            System.out.println(empI+" "+FName+" "+LName+" "+ Age + " "+ DName);
        }



        myCon.close();

        System.out.println("Successfully Executed ............. ");



    }
}
