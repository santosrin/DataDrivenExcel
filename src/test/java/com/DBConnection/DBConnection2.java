package com.DBConnection;

import java.sql.*;

public class DBConnection2 {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433";
        Connection con;
        Statement st;
        ResultSet rs;

        try {
            con = DriverManager.getConnection(url,"sa","myPassword@12345");
            st = con.createStatement();
            String insertQuery = "Insert into Persons(PersonID,LastName,FirstName,Address,City) \" +\n" +
                    "\"values (10,'D','Peter','Kashinath','UK');";
            st.executeQuery(insertQuery);
            String query = "select * from Persons where PersonID=2";
            rs = st.executeQuery(query);
            while (rs.next()) {
                String fn = rs.getString("FirstName");
                System.out.println(rs.getRow());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
