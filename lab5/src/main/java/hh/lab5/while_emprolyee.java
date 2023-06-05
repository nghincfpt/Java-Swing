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


public class while_emprolyee {
    public static void main(String[] args) {
        try {// jbbc  sql sever -> working with a Connection
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-QRC9JLQ\\NGHI:1433;databaseName=Demo";
            String username = "sa";
            String password = "12345678az";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);
            Statement stmt =  con.createStatement();
            String sql = "select * from Student ";
            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
                int id= resultSet.getInt("id");
                String Name = resultSet.getString("Name");
                System.out.println(String.format("id:%d  - Name: %s", id,Name));
                
            }
                
                con.close();
                stmt.close();
                resultSet.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
