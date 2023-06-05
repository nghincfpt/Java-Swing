/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghincjava3.ass.Heler;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class Databasehelper {

    public static Connection openConnertion() throws Exception {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://DESKTOP-QRC9JLQ\\NGHI:1433;databaseName=ASS";
        String username = "sa";
        String password = "12345678az";
        Connection con = DriverManager.getConnection(connectionUrl, username, password);
        
        return con;


    }
}
