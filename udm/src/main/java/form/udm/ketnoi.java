/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.udm;


import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ketnoi {
    public static void main(String[] args) {
        try {// jbbc  sql sever -> working with a Connection
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-QRC9JLQ\\NGHI:1433;databaseName=UDM";
            String username = "sa";
            String password = "12345678az";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);
            Statement stmt =  con.createStatement();
            String sql = "select * from nhanvien ";
            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
                int manv= resultSet.getInt("manv");
                String matkhau = resultSet.getString("matkhau");
                String hoten = resultSet.getString("hoten");
                String vaitro = resultSet.getString("vaitro");
                System.out.println("ok");
                
                System.out.println(String.format("manv:%d  - matkhau: %s- hoten:%d- vaitro:%s", manv,matkhau,hoten,vaitro));
                
            }
                
                con.close();
                stmt.close();
                resultSet.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
