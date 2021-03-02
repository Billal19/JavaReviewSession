package Practice.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRecap {

    // 1)What is mySql :
    // MySql is freely available open source relational database management system (RDBMS), which has some of its rules set to manage the data,
    // in other words , it is used to manage , access and manipulate the data .
    // - mySql has a high performance comparing it to other relational database systems .
    // -mySql is cost effective which means , its cheaper when compared to to other database systems in terms of costs , in fact the community edition is free,
    // and the commercial edition has some licensing fee but its still cost effective .
    // - mySql is cross platform, which means it works on all platforms .

    // 2)What is mySql workbench :
    // mySql workbench is an IDE or a tool by which we can perform queries on the actual Database.
    // mySql workbench is a visual database designing and modeling too used for the mySql relational database server ,it facilitates the creation of a new physical dataModel ,
    // and modification of the the existing mysql database ,
    // the purpose of the workbench is to provide the interface to work with the database more easily and in a more structured way.

    // 3)What is JDBC :
    // JDBC stands for java database connectivity , its an application programming interface (API) , for the java programming language , which defines how a client may access the database ,
    // it is a java based database access technology used for JDBC , it's part of the java standard edition platform from oracle corporation .

    // In order to create a java program by which we can execute queries and connect to the database , we will have to download and install the following:
    // - JAVA (JDK) , IDE( ECLIPSE , INTELLIJ IDEA , ....), MYSQL COMMUNITY SERVER , MYSQL WORKBENCH , MYSQL JDBC DRIVER (mysql.connector.java)
    // After downloading and installing whatever we needed we will follow these steps tp create a program :

    // these 4 steps are applicable of insert, update and delete the database ( these commands are not going to return anything for us , it will only do the actions in mysql workbench)
    // 1-create a connection
    // 2-create a statement / or query
    // 3-execute the statement or query
    // 4-close the connection

    // If wanted to select the database then we will add one step after executing the query which will be the result storing :
    // 1-create a connection
    // 2-create a statement / or query
    // 3-execute the statement or query
    // 4-Store the results in ResultSet
    // 5-close the connection

    public static void main(String[] args) throws SQLException {

        String Url = "jdbc:mysql://localhost:3306/BillalDataBase?serverTimezone=UTC";
        String User = "root";
        String Password ="MAC2019$";


        //1) create the connection :
        Connection myCon = DriverManager.getConnection(Url,User,Password);
        //2) create a statement :
        Statement myStm = myCon.createStatement();
        String query = " INSERT INTO EMPLOYEES VALUE (111, 'Melisa','Hilton', 34 , 'Testing')"; // this query is to insert values to a database
        //String query = "UPDATE EMPLOYEE SET FIRST NAME ='eEmily' where EMPLOYEE ID =103"; // this query is to update values
       // String query ="DELETE FROM EMPLOYEE WHERE EMPLOYEE ID  =103"; // this query is to delete values
        //3)Execute the statement;
        myStm.execute(query);
        //4)close the connection :
        myCon.close();

        System.out.println("A new row has been added to the table ");





    }






}
