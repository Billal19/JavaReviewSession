package Practice.try7.JDBC;

import java.sql.*;


public class SelectCommandInJDBC {

    public static void main(String[] args) throws SQLException {

        String Url = "jdbc:mysql://localhost:3306/world_x?serverTimezone=UTC";
        String User = "root";
        String Password = "MAC2019$";


        // Creating the connection:
        Connection myCon = DriverManager .getConnection(Url,User,Password);

        // Creating statement :
        Statement myState = myCon.createStatement();
        String myQuery = " select ID , Name , CountryCode , District, Info from city ";
        ResultSet myResults = myState.executeQuery(myQuery);
        while (myResults.next()){
            int cityId = myResults.getInt("ID");
            String cityName = myResults.getNString("NAME");
            String CountryCD = myResults.getNString("COUNTRYCODE");
            String DistrictName = myResults.getNString("DISTRICT");
            String Information = myResults.getNString("INFO");

            System.out.println(cityId+ " " +cityName+ " " +CountryCD+ "" +DistrictName+ "" +Information);

        }


        myCon.close();

        System.out.println("we were able to fetch the date from the world_x DataBase");








    }
}
