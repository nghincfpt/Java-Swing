
package nghincjava3.ass;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import nghincjava3.ass.Heler.clock;
import nghincjava3.ass.Heler.sharedData;


public class mainForm extends javax.swing.JFrame {
private studentPanel mStudentPanel;
private Quanlydiem diempanel;
private Emaill emailpane;
 

    public mainForm() {
        initComponents();
        setLocationRelativeTo(null);
        // hienj  dang nhap thao kich co
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        tbrlogout = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btngioithieu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tpmainboard = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblloginName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mu_thoat = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        muMangeStudent = new javax.swing.JMenu();
        mu_study = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mu_quanlydiem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mu_aboutas = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        tbrlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/logout-icon-32.png"))); // NOI18N
        tbrlogout.setText("Đăng Xuất");
        tbrlogout.setFocusable(false);
        tbrlogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrlogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrlogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrlogout);
        jToolBar1.add(jSeparator5);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        jButton2.setText("Quản Lý Sinh Viên");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/gpa-icon-32.png"))); // NOI18N
        jButton3.setText("Quản Lý Điểm");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator4);

        btngioithieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Actions-help-about-icon-32.png"))); // NOI18N
        btngioithieu.setText("Giới Thiệu");
        btngioithieu.setFocusable(false);
        btngioithieu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btngioithieu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btngioithieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngioithieuActionPerformed(evt);
            }
        });
        jToolBar1.add(btngioithieu);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Actions-document-edit-icon-32.png"))); // NOI18N
        jButton1.setText("Emaill");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        lblloginName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblloginName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblRole.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblloginName, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblloginName)
                .addGap(18, 18, 18)
                .addComponent(lblRole)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mu_thoat.setText("Hệ Thống ");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Login-icon-32.png"))); // NOI18N
        jMenuItem2.setText("Đăng xuất");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mu_thoat.add(jMenuItem2);
        mu_thoat.add(jSeparator3);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Actions-edit-delete-icon-16.png"))); // NOI18N
        jMenuItem3.setText("Thoát");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mu_thoat.add(jMenuItem3);

        jMenuBar1.add(mu_thoat);

        muMangeStudent.setText("Quản Lý");

        mu_study.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mu_study.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/10207-man-student-light-skin-tone-icon-24.png"))); // NOI18N
        mu_study.setText("Quản Lý Sinh Viên");
        mu_study.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mu_studyActionPerformed(evt);
            }
        });
        muMangeStudent.add(mu_study);
        muMangeStudent.add(jSeparator2);

        mu_quanlydiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mu_quanlydiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/gpa-icon-32.png"))); // NOI18N
        mu_quanlydiem.setText("Quản Lý Điểm");
        mu_quanlydiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mu_quanlydiemActionPerformed(evt);
            }
        });
        muMangeStudent.add(mu_quanlydiem);

        jMenuBar1.add(muMangeStudent);

        jMenu2.setText("Trợ Giúp");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Actions-help-about-icon-32.png"))); // NOI18N
        jMenuItem7.setText("Nội Dung ");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);
        jMenu2.add(jSeparator1);

        mu_aboutas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mu_aboutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Person-Male-Light-icon-24.png"))); // NOI18N
        mu_aboutas.setText("Giới Thiệu");
        mu_aboutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mu_aboutasActionPerformed(evt);
            }
        });
        jMenu2.add(mu_aboutas);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tpmainboard, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 49, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tpmainboard, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngioithieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngioithieuActionPerformed
        //gioi  thieu 
        AboutDialong  dialong = new AboutDialong(this,true);
        dialong.setVisible(true);
    }//GEN-LAST:event_btngioithieuActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mu_studyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mu_studyActionPerformed
       if(mStudentPanel == null){  
        mStudentPanel = new studentPanel();
        ImageIcon icom= new ImageIcon(getClass().getResource
        ("/ass/icom/10207-man-student-light-skin-tone-icon-24.png"));
        tpmainboard.addTab("Quản Lý Sinh Viên", icom, mStudentPanel,"Quản Lý Sinh Viên");
       }
        tpmainboard.setSelectedComponent(mStudentPanel);
    }//GEN-LAST:event_mu_studyActionPerformed

    private void mu_quanlydiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mu_quanlydiemActionPerformed
       if(diempanel==null){
           diempanel = new  Quanlydiem();
           ImageIcon icom = new ImageIcon(getClass().getResource
        ("/ass/icom/gpa-icon-32.png"));
       tpmainboard.addTab("Quản Lý Điểm", icom, diempanel,"Quản Lý Điểm");
       }
        tpmainboard.setSelectedComponent(diempanel);
    }//GEN-LAST:event_mu_quanlydiemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       mu_studyActionPerformed(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mu_aboutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mu_aboutasActionPerformed
       btngioithieuActionPerformed(evt);
    }//GEN-LAST:event_mu_aboutasActionPerformed

    private void tbrlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrlogoutActionPerformed
       // đăng nhập
       loginDialog logindalog = new loginDialog(this,true);
       logindalog.setVisible(true);
         processLoginSussessful();
    }//GEN-LAST:event_tbrlogoutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mu_quanlydiemActionPerformed(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         loginDialog dialog = new loginDialog(this,true);
        dialog.setVisible(true);
        processLoginSussessful();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       tbrlogoutActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
         if(emailpane==null){
           emailpane = new  Emaill();
           ImageIcon icom = new ImageIcon(getClass().getResource
        ("/ass/icom/Actions-document-edit-icon-32.png"));
       tpmainboard.addTab("Emaill", icom, emailpane,"Emaill");
       }
        tpmainboard.setSelectedComponent(emailpane);
    }//GEN-LAST:event_jButton1ActionPerformed

 private void processLoginSussessful(){
     lblloginName.setText(sharedData.nguoidangnhap.getTendangnhap());
     lblRole.setText(sharedData.nguoidangnhap.getVaitro());
     
     tpmainboard.removeAll();
     if(sharedData.nguoidangnhap.getVaitro().equals("giangvien")){
           mu_quanlydiem.setEnabled(true);
         mu_study.setEnabled(false);
         
     }else if(sharedData.nguoidangnhap.getVaitro().equals("daotao")){
        mu_quanlydiem.setEnabled(false);
         mu_study.setEnabled(true);
         
     }
 }
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
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngioithieu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblloginName;
    private javax.swing.JMenu muMangeStudent;
    private javax.swing.JMenuItem mu_aboutas;
    private javax.swing.JMenuItem mu_quanlydiem;
    private javax.swing.JMenuItem mu_study;
    private javax.swing.JMenu mu_thoat;
    private javax.swing.JButton tbrlogout;
    private javax.swing.JTabbedPane tpmainboard;
    // End of variables declaration//GEN-END:variables

    private static class LoginDialong {

        public LoginDialong(mainForm aThis, boolean b) {
        }
    }
}
