
package hh.lab5;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class update {
    public static void main(String[] args) {
        try {// jbbc  sql sever -> working with a Connection
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-QRC9JLQ\\NGHI:1433;databaseName=hh";
            String username = "sa";
            String password = "12345678az";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);
           
            String sql = " UPDATE  nghi  set age=?  where id = 1"; // nhập mã muốn update
            PreparedStatement  pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,29);
           // 29 là mình muốn updete 
            // sai vi kiểu dữ liệu trong bang sql là String 
           int affectedRow= pstmt.executeUpdate(); 
            System.out.println(""+affectedRow+ "row update");
                
                
                pstmt.close();
                con.close();
              
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
