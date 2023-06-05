/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh.lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class databayhelper {
    public static Connection openConnection() throws Exception{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-QRC9JLQ\\NGHI:1433;databaseName=student";
            String username = "sa";
            String password = "12345678az";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);
           System.out.println("ok");
        return con;
    }
}
