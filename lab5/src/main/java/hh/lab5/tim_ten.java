/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh.lab5;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class tim_ten {
    public static void main(String[] args) {
        try {// jbbc  sql sever -> working with a Connection
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-QRC9JLQ\\NGHI:1433;databaseName=Demo";
            String username = "sa";
            String password = "12345678az";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);
            Statement stmt =  con.createStatement();
            String sql = " delete  from Dome  where id = 4";
           int affectedRow= stmt.executeUpdate(sql); 
            System.out.println(""+affectedRow+ " delete");
                
                con.close();
                stmt.close();
              
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
