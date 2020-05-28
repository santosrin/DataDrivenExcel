package ocrdemo;

import javax.xml.transform.Result;
import java.sql.*;
/*
1. import -> java.sql
2. load and register the driver -> com.mysql.jdbc.Driver
3. create connection
4. create statement
5. execute the query
6. process the result
7. close

*/

public class DBDemoClass {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:sqlserver://localhost:1433";
        String uname = "sa";
        String pwd = "myPassword@12345";
        int id;
        String ln;
        String fn;
        String ad;
        String ct;
//        String query = "select * from Persons where PersonID=2";
        //String query = "select * from Persons";
//        String query  = "Insert into Persons(PersonID,LastName,FirstName,Address,City) " +
//                "values (10,'D','Peter','Kashinath','UK');";

        String query  = "Insert into Persons(PersonID,LastName,FirstName,Address,City) " +
                "values (?,?,?,?,?);";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pwd);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1,12);
        st.setString(2,"LN1");
        st.setString(3,"FN1");
        st.setString(4,"AD1");
        st.setString(5,"CT1");
        //Statement st = con.createStatement();
        //ResultSet rs = st.executeQuery(query);
        int count = st.executeUpdate();

        System.out.println(count + " rows affected");
//        while(rs.next()) {
//            String name = rs.getInt(1) + ":"+ rs.getString(3);
//            System.out.println(name);
//        }

       // String name = rs.getString("FirstName");
//        String name = rs.getInt(1) + ":"+ rs.getString(3);
//        System.out.println(name);
        st.close();
        con.close();


    }
}
