/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghincjava3.ass.Dao;

import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.sql.rowset.serial.SerialBlob;
import nghincjava3.ass.Heler.Databasehelper;
import nghincjava3.ass.Model.sinhvien;

public class sinhviendao {

    public boolean insert(sinhvien sv)
            throws Exception {

        String sql = "  INSERT INTO dbo.sinhvien(masinhvien,hoten ,email,sdt,gioitinh,diachi,hinh)"
                + "values(?,?,?,?,?,?,?)";

        try (
                 Connection con = Databasehelper.openConnertion();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, sv.getMasinhvien());
            pstmt.setString(2, sv.getHoten());
            pstmt.setString(3, sv.getEmail());
            pstmt.setString(4, sv.getSdt());
            pstmt.setInt(5, sv.getGioitinh());
            pstmt.setString(6, sv.getDiachi());
            if (sv.getHinh() != null) {
                Blob hinh = new SerialBlob(sv.getHinh());
                pstmt.setBlob(7, hinh);
            } else {
                Blob hinh = null;
                pstmt.setBlob(7, hinh);
            }
            return pstmt.executeUpdate() > 0;
        }

    }

    public boolean update(sinhvien sv)
            throws Exception {

        String sql = "UPDATE dbo.sinhvien\n"
                + "   SET hoten = ?,email = ? ,sdt = ?,gioitinh = ?,diachi = ? ,hinh = ?"
                + " where masinhvien = ?";

        try (
                 Connection con = Databasehelper.openConnertion();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(7, sv.getMasinhvien());
            pstmt.setString(1, sv.getHoten());
            pstmt.setString(2, sv.getEmail());
            pstmt.setString(3, sv.getSdt());
            pstmt.setInt(4, sv.getGioitinh());
            pstmt.setString(5, sv.getDiachi());

            if (sv.getHinh() != null) {
                Blob hinh = new SerialBlob(sv.getHinh());
                pstmt.setBlob(6, hinh);
            } else {
                Blob hinh = null;
                pstmt.setBlob(6, hinh);
            }
            return pstmt.executeUpdate() > 0;
        }

    }

    public boolean delete(String masinhvien)
            throws Exception {

        String sql = " delete from sinhvien"
                + " where masinhvien=?";

        try (
                 Connection con = Databasehelper.openConnertion();  PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(1, masinhvien);

            return pstmt.executeUpdate() > 0;
        }

    }

    public sinhvien findid(String masinhvien)
            throws Exception {

        String sql = "select * from sinhvien where masinhvien=?";
        try (
                 Connection con = Databasehelper.openConnertion();  PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(1, masinhvien);

            try (
                     ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    sinhvien sv = creaesinhvien(rs);
                    return sv;

                }
            }
            return null;
        }
    }

    public List<sinhvien> findall() throws Exception {
        String sql = "select* from sinhvien";
        try (
                 Connection con = Databasehelper.openConnertion();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            try (
                     ResultSet rs = pstmt.executeQuery();) {
                List<sinhvien> list = new ArrayList<sinhvien>();
                while (rs.next()) {
                    sinhvien sv = creaesinhvien(rs);
                    list.add(sv);

                }
                return list;
            }
        }
    }

    private sinhvien creaesinhvien(final ResultSet rs) throws SQLException {
        sinhvien sv = new sinhvien();
        sv.setMasinhvien(rs.getString("masinhvien"));
        sv.setHoten(rs.getString("hoten"));
        sv.setEmail(rs.getString("email"));
        sv.setSdt(rs.getString("sdt"));
        sv.setDiachi(rs.getString("diachi"));
        sv.setGioitinh(rs.getInt("gioitinh"));
        Blob blob = rs.getBlob("hinh");
        if (blob != null) {
            sv.setHinh(blob.getBytes(1, (int) blob.length()));
        }
        return sv;
    }
}
