/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh.bai6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class hienthilenform extends javax.swing.JFrame {
    DefaultTableModel tblmodel;

    public hienthilenform() {
        initComponents();
        initable();
        loademployee();
    }

    private void initable(){
         tblmodel = new  DefaultTableModel();
        tblmodel.setColumnIdentifiers(new String []{"uname","umail","upass","ucontry"});
        jTable1.setModel(tblmodel);
    }
private void loademployee(){
    try {
    
            String username = "sa";
            String password = "12345678az";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-QRC9JLQ\\NGHI:1433;databaseName=Emp";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);

            String sql = "select * from emp";
            PreparedStatement pstmt = con.prepareStatement(sql);
                
            ResultSet rs = pstmt.executeQuery();
            tblmodel.setRowCount(0);
            while(rs.next()){
         String [] row = new String []{
             rs.getString("uname"),rs.getString("umail"),rs.getString("upass"),rs.getString("ucontry")
         };
         tblmodel.addRow(row);
            }
            tblmodel.fireTableDataChanged();
            rs.close();
            pstmt.close();
            con.close();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
        e.printStackTrace();
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        txtcountry = new javax.swing.JTextField();
        tbnupdate = new javax.swing.JButton();
        tbnsave = new javax.swing.JButton();
        txtnew = new javax.swing.JButton();
        tbndelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("quản lý nhân viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("email");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("pass");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("country");

        tbnupdate.setText("Update");
        tbnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnupdateActionPerformed(evt);
            }
        });

        tbnsave.setText("save");
        tbnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnsaveActionPerformed(evt);
            }
        });

        txtnew.setText("New");
        txtnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnewActionPerformed(evt);
            }
        });

        tbndelete.setText("Delete");
        tbndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbndeleteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcountry, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtemail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbnsave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbnupdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbndelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tbnsave))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtnew)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbnupdate))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(tbndelete)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnewActionPerformed
        txtname.setText("");
        txtemail.setText("");
        txtpass.setText("");
        txtcountry.setText("");
    }//GEN-LAST:event_txtnewActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if (row >= 0) {
            txtname.setText(jTable1.getValueAt(row, 0).toString());
            txtemail.setText(jTable1.getValueAt(row, 1).toString());
            txtpass.setText(jTable1.getValueAt(row, 2).toString());
            txtcountry.setText(jTable1.getValueAt(row, 3).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void tbnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnsaveActionPerformed
       //seve
        try {
    
            String username = "sa";
            String password = "12345678az";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-QRC9JLQ\\NGHI:1433;databaseName=Emp";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);

            String sql = "insert into emp (uname,umail,upass,ucontry) values(?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
                
            pstmt.setString(1,txtname.getText());
            pstmt.setString(2,txtemail.getText());
            pstmt.setString(3,txtpass.getText());
            pstmt.setString(4,txtcountry.getText());
            
            pstmt.executeUpdate();
            loademployee();
            JOptionPane.showMessageDialog(this, " seve employees successfull");
            pstmt.close();
            con.close();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_tbnsaveActionPerformed

    private void tbnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnupdateActionPerformed
      //updete
      if(JOptionPane.showConfirmDialog(this,"do you want to update?")==JOptionPane.NO_OPTION){
          return;
      }
       try {
    
            String username = "sa";
            String password = "12345678az";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-QRC9JLQ\\NGHI:1433;databaseName=Emp";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);

            String sql = "update emp set  umail = ?, upass = ? ,ucontry= ? "
                    +"where uname= ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
                
            pstmt.setString(4,txtname.getText());
            pstmt.setString(1,txtemail.getText());
            pstmt.setString(2,txtpass.getText());
            pstmt.setString(3,txtcountry.getText());
            
            pstmt.executeUpdate();
            loademployee();
            JOptionPane.showMessageDialog(this, " emp is updata");
            
            pstmt.close();
            con.close();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_tbnupdateActionPerformed

    private void tbndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbndeleteActionPerformed
       //delete
         if(JOptionPane.showConfirmDialog(this,"do you want to update?")==JOptionPane.NO_OPTION){
          return;
      }
       try {
    
            String username = "sa";
            String password = "12345678az";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-QRC9JLQ\\NGHI:1433;databaseName=Emp";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);

            String sql ="delete from emp where uname=?";
            PreparedStatement pstmt = con.prepareStatement(sql);
                
            pstmt.setString(1,txtname.getText());
   
            
            pstmt.executeUpdate();
            loademployee();
            JOptionPane.showMessageDialog(this, " emp is delete");
            pstmt.close();
            con.close();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
        txtnewActionPerformed(evt);
        e.printStackTrace();
    }
    }//GEN-LAST:event_tbndeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(hienthilenform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hienthilenform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hienthilenform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hienthilenform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hienthilenform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton tbndelete;
    private javax.swing.JButton tbnsave;
    private javax.swing.JButton tbnupdate;
    private javax.swing.JTextField txtcountry;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JButton txtnew;
    private javax.swing.JTextField txtpass;
    // End of variables declaration//GEN-END:variables
}
