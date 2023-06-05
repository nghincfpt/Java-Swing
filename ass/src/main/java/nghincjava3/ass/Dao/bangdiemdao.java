/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghincjava3.ass.Dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;
import nghincjava3.ass.Heler.Databasehelper;
import nghincjava3.ass.Model.bangdiem;
import nghincjava3.ass.Model.sinhvien;

/**
 *
 * @author ASUS
 */
public class bangdiemdao {
       public boolean insert(bangdiem bd)
            throws Exception {

        String sql = "  INSERT INTO [dbo].[bangbiem]([masinhvien],[tienganh],[tinhoc],[gdtc])\n"
                + "  VALUES (?,?,?,?)";

        try (
                 Connection con = Databasehelper.openConnertion();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, bd.getMasinhvien());
            pstmt.setFloat(2, bd.getTienganh());
            pstmt.setFloat(3, bd.getTinhoc());
            pstmt.setFloat(4, bd.getGdtc());

            return pstmt.executeUpdate() > 0;
        }
    }
    public boolean update(bangdiem bd)
            throws Exception {

        String sql = "UPDATE [dbo].[bangbiem]"
                + "   SET [tienganh] = ?,[tinhoc] = ?,[gdtc] = ?"
                + " WHERE [masinhvien] =?";

        try (
                 Connection con = Databasehelper.openConnertion();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(4, bd.getMasinhvien());
            pstmt.setFloat(1, bd.getTienganh());
            pstmt.setFloat(2, bd.getTinhoc());
            pstmt.setFloat(3, bd.getGdtc());

            return pstmt.executeUpdate() > 0;
        }
    }
        public boolean deletebymasinhvien(String masinhvien)
            throws Exception {

        String sql = "delete from bangbiem" 
               + " WHERE [masinhvien] =?";

        try (
                 Connection con = Databasehelper.openConnertion(); 
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, masinhvien);

            return pstmt.executeUpdate() > 0;
        }
    }
              public bangdiem findbaymasinhvien(String masinhvien)
            throws Exception {

        String sql = "select * from bangbiem WHERE [masinhvien] =?";

        try (
                 Connection con = Databasehelper.openConnertion(); 
                PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(1, masinhvien);

            try (ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    bangdiem db = createbangdiem(rs);
                    return db;
                }
            }
               
          return null;
           
        }
    }
                public List<bangdiem> findall()
            throws Exception {

        String sql = "select * from bangbiem ";

        try (
                 Connection con = Databasehelper.openConnertion(); 
                PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
  
            try (ResultSet rs = pstmt.executeQuery();){
                List<bangdiem> list = new ArrayList<>();
                while(rs.next()){
                    bangdiem db = createbangdiem(rs);
                    list.add(db);
                }
                return list;
            }

           
        }
    }

    public List<bangdiem> findtop(int top)
            throws Exception {

        String sql = "select top " + top + " *,(tienganh+tinhoc+gdtc)/3 "
                + "as 'Diem tb' from bangbiem order by [Diem tb] desc ";

        try (
                 Connection con = Databasehelper.openConnertion();  PreparedStatement pstmt = con.prepareStatement(sql);) {

            try ( ResultSet rs = pstmt.executeQuery();) {
                List<bangdiem> list = new ArrayList<>();
                while (rs.next()) {
                    bangdiem db = createbangdiem(rs);
                    list.add(db);
                }
                return list;
            }

        }
    }

    private bangdiem createbangdiem(final ResultSet rs) throws SQLException {
        bangdiem db = new bangdiem();
        db.setMa(rs.getInt("ma"));
        db.setMasinhvien(rs.getString("masinhvien"));
        db.setTienganh(rs.getFloat("tienganh"));
        db.setTinhoc(rs.getFloat("tinhoc"));
        db.setGdtc(rs.getFloat("gdtc"));
        return db;
    }

    public String getMasinhvien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
