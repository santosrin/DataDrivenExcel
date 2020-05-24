package com.DBConnection;

import java.sql.*;

public class DataBaseUtil {

    public static void main(String[] args) {

        //create the connection with database:
        //String myDriver = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433";
        Connection con;
        Statement stmt;
        ResultSet rs;

        try {
            con = DriverManager.getConnection(url,"sa","myPassword@12345");
            stmt = con.createStatement();
            String insertQuery = "Insert into Persons(PersonID,LastName,FirstName,Address,City) " +
                    "values (10,'D','Peter','Kashinath','UK');";
            stmt.execute(insertQuery);

            //String query = "select * from Persons";
            String query = "select * from Persons where PersonID=2";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                String FirstName = rs.getString("FirstName");
                System.out.println(rs.getRow()+ " ");
                System.out.print(FirstName);

            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
