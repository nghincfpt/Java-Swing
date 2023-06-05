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


public class readEmployee {
    public static void main(String[] args) {
        try {// jbbc  sql sever -> working with a Connection
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-QRC9JLQ\\NGHI:1433;databaseName=hh";
            String username = "sa";
            String password = "12345678az";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);
           DriverManager stmt =  con.createStatement();
           /*
            statement: thi hanh  cau lenh tuy y tai thoi diem chay
            preparedStatement : cua lenh sql duoc bien dich truoc 
            callableStatement: goi  thu tuc tren  DBMS
            
            kết nối tạo ra câu lệnh 
            Statement s = con.createStatement()
            preparedStatement ps = con.prepareStatement(String)
            CallableStatement cs = con.prepareCall(String)
                       */

            String sql = "select * from nghi ";
            ResultSet resultSet = stmt.executeQuery(sql);
            if (resultSet.next()) {
                System.out.println("id :" + resultSet.getInt(1));
                System.out.println("Name :" + resultSet.getString("Name"));
                System.out.println("age :" + resultSet.getString("age"));
          
                resultSet.close();
                
                stmt.close();
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
