/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh.lab5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class studentDao {

    public boolean insert(student stud) throws Exception {
        String sql = "insert into sinhvien(masv, hoten, email, sdt, gioitinh, diachi) values(?,?,?,?,?,?)";
        try (
                 Connection con = databayhelper.openConnection();
                PreparedStatement patmt = con.prepareStatement(sql);) {
            patmt.setString(1, stud.getMsv());
            patmt.setString(2, stud.getHoten());
            patmt.setString(3, stud.getEmail());
            patmt.setString(4, stud.getSdt());
            patmt.setInt(5, stud.getGioitinh());
            patmt.setString(6, stud.getDiachi());
            return patmt.executeLargeUpdate() > 0;
        }
    }
        public student findId(String masv) throws Exception {
        String sql = "select * from sinhvien where masv=?";
        try (
                 Connection con = databayhelper.openConnection();  PreparedStatement patmt = con.prepareStatement(sql);) {
            patmt.setString(1, masv);
            ResultSet rs = patmt.executeQuery();
            if (rs.next()) {
                student stud = new student();
                  stud.setMsv(rs.getString("masv"));
                  stud.setHoten(rs.getString("hoten"));
                  stud.setEmail(rs.getString("email"));
                  stud.setSdt(rs.getString("sdt"));
                  stud.setGioitinh(rs.getInt("gioitinh"));
                  stud.setDiachi(rs.getString("diachi"));
                return stud;   
        }
        return null;
    }
}
        
         public boolean update(student stud) throws Exception {
        String sql = "update sinhvien set hoten = ? , email = ? , sdt= ? ,gioitinh = ? , diachi=? "
                +" where masv = ?";
        try (
                 Connection con = databayhelper.openConnection();
                PreparedStatement patmt = con.prepareStatement(sql);) {
            patmt.setString(6, stud.getMsv());
            patmt.setString(1, stud.getHoten());
            patmt.setString(2, stud.getEmail());
            patmt.setString(3, stud.getSdt());
            patmt.setInt(4, stud.getGioitinh());
            patmt.setString(5, stud.getDiachi());
            return patmt.executeLargeUpdate() > 0;
        }
    }
         
           public boolean delete(String masv) throws Exception {
        String sql = "delete from sinhvien where masv = ?";
        try (
                 Connection con = databayhelper.openConnection();
                PreparedStatement patmt = con.prepareStatement(sql);) {
       patmt.setString(1,masv);
            return patmt.executeLargeUpdate() > 0;
        }
    }
        }