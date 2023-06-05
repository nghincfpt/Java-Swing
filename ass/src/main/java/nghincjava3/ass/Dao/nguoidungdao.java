/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghincjava3.ass.Dao;

import nghincjava3.ass.Heler.Databasehelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import nghincjava3.ass.Model.nguoidung;


/**
 *
 * @author ASUS
 */
public class nguoidungdao {
    public  nguoidung checklogin(String tendangnhap, String matkhau)
    throws Exception{
        String sql= "select tendangnhap, matkhau ,vaitro from nguoidung "
                + " where tendangnhap = ?  and matkhau = ?";
    
        try (
                Connection con = Databasehelper.openConnertion();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, tendangnhap);
            pstmt.setString(2, matkhau);
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    nguoidung nd = new nguoidung();
                    nd.setTendangnhap(tendangnhap);
                    nd.setVaitro(rs.getString("vaitro"));
                    return nd;
                }
            }
        }
        return null;
    }
}