/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh.lab5;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class bai1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;database=Demo;";
            String username = "sa";
            String password = "12345678az";

            Connection con = DriverManager.getConnection(connectionUrl, username, password);
            System.out.println("ok");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
