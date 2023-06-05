/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghincjava3.ass;

import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nghincjava3.ass.Dao.bangdiemdao;
import nghincjava3.ass.Dao.sinhviendao;
import nghincjava3.ass.Heler.clock;
import nghincjava3.ass.Heler.datavalidator;
import nghincjava3.ass.Heler.imagetHeld;
import nghincjava3.ass.Heler.messagedialoghelper;
import nghincjava3.ass.Model.bangdiem;
import nghincjava3.ass.Model.sinhvien;

public class Quanlydiem extends javax.swing.JPanel implements Runnable {

    private Quanlydiem parentForm;
    private DefaultTableModel tblmodel;
    int position;

    public Quanlydiem() {
        initComponents();
        position = 0;
        initable();

        loabangfiem();
        clockActionPerformed(null);

    }

    private void initable() {
        tblmodel = new DefaultTableModel();
        tblmodel.setColumnIdentifiers(new String[]{
            "Mã sinh viên", "tiếng anh", "tin học", "DCTC", "Diem tb"
        });
        tbldiem.setModel(tblmodel);

    }

    public bangdiem getposition(int position) {
        bangdiem db = new bangdiem();
        db.setMasinhvien(tbldiem.getValueAt(position, 0).toString());
        db.setTienganh(Float.parseFloat(tbldiem.getValueAt(position, 1).toString()));
        db.setTinhoc(Float.parseFloat(tbldiem.getValueAt(position, 1).toString()));
        db.setGdtc(Float.parseFloat(tbldiem.getValueAt(position, 1).toString()));
      
        return db;
    }

    private void loabangfiem() {
        try {
            bangdiemdao dao = new bangdiemdao();
            List<bangdiem> list = (dao.findall());
            tblmodel.setRowCount(0);
            for (bangdiem db : list) {
                tblmodel.addRow(new Object[]{
                    db.getMasinhvien(), db.getTienganh(), db.getTinhoc(), db.getGdtc(),
                    (db.getTienganh() + db.getTinhoc() + db.getGdtc()) / 3
                });

            }
            tblmodel.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showerrordialog(parentForm, e.getMessage(), "LOI");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtstudentmasearch = new javax.swing.JTextField();
        tbnsearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtstufentid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtenglish = new javax.swing.JTextField();
        txtit = new javax.swing.JTextField();
        txtddtc = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblgpa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldiem = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        tbnxoa = new javax.swing.JButton();
        tbnluu = new javax.swing.JButton();
        tbnnhapmoi = new javax.swing.JButton();
        tbncapnhat = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        clock = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Mã Sinh Viên");

        tbnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/search-icon-24.png"))); // NOI18N
        tbnsearch.setText("Tìm kiếm");
        tbnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(txtstudentmasearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbnsearch)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstudentmasearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tbnsearch)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã sinh viên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Họ tên");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tiếng Anh");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tin Học");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("GDTC");

        txtstufentid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtstufentidFocusLost(evt);
            }
        });

        txtenglish.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtenglishFocusLost(evt);
            }
        });

        txtit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtenglishFocusLost(evt);
            }
        });

        txtddtc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtenglishFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtstufentid)
                    .addComponent(txtname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtenglish, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtddtc))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtstufentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtenglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(txtit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtddtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Điểm Thi");

        lblgpa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblgpa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgpa.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblgpa)
                    .addComponent(jLabel9))
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel9)
                .addGap(38, 38, 38)
                .addComponent(lblgpa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbldiem.setBackground(new java.awt.Color(153, 255, 255));
        tbldiem.setModel(new javax.swing.table.DefaultTableModel(
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
        tbldiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldiem);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbnxoa.setBackground(new java.awt.Color(51, 255, 51));
        tbnxoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Button-Close-icon-16.png"))); // NOI18N
        tbnxoa.setText("Xóa");
        tbnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnxoaActionPerformed(evt);
            }
        });

        tbnluu.setBackground(new java.awt.Color(51, 255, 51));
        tbnluu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbnluu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Save-icon.png"))); // NOI18N
        tbnluu.setText("Lưu");
        tbnluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnluuActionPerformed(evt);
            }
        });

        tbnnhapmoi.setBackground(new java.awt.Color(51, 255, 51));
        tbnnhapmoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbnnhapmoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/new-icon-16.png"))); // NOI18N
        tbnnhapmoi.setText("Nhập mới");
        tbnnhapmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnnhapmoiActionPerformed(evt);
            }
        });

        tbncapnhat.setBackground(new java.awt.Color(51, 255, 51));
        tbncapnhat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbncapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Actions-document-edit-icon-16.png"))); // NOI18N
        tbncapnhat.setText("Cập nhật");
        tbncapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbncapnhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(tbnnhapmoi)
                .addGap(35, 35, 35)
                .addComponent(tbnluu)
                .addGap(43, 43, 43)
                .addComponent(tbncapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(tbnxoa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnxoa)
                    .addComponent(tbnluu)
                    .addComponent(tbnnhapmoi)
                    .addComponent(tbncapnhat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/logo.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Quản lý điểm sinh viên Fpoly");

        clock.setText("Clock");
        clock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockActionPerformed(evt);
            }
        });

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Button-First-icon-48_1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Fast-backward-icon2-48.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 255, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Button-Last-icon-48.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 255, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Fast-forward-icon-48.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setText("Top 3");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 255, 51));
        jButton6.setText("llist student");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(45, 45, 45)
                .addComponent(jButton3)
                .addGap(51, 51, 51)
                .addComponent(jButton5)
                .addGap(51, 51, 51)
                .addComponent(jButton4)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clock, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(clock))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbnnhapmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnnhapmoiActionPerformed
        txtstufentid.setText("");
        txtenglish.setText("");
        txtit.setText("");
        txtddtc.setText("");
        txtname.setText("");
    }//GEN-LAST:event_tbnnhapmoiActionPerformed

    private void tbnluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnluuActionPerformed
        //save nếu cso thì cập nhật
        StringBuilder sb = new StringBuilder();
        datavalidator.validateEmty(txtstufentid, sb, "Ban chua nhap ma");
        datavalidator.validateEmty(txtenglish, sb, "Ban chua nhap điểm");
        datavalidator.validateEmty(txtit, sb, "Ban chua nhap điểm");
        datavalidator.validateEmty(txtddtc, sb, "Ban chua nhap diểm");

        if (sb.length() > 0) {
            messagedialoghelper.showerrordialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        try {
            bangdiem bd = new bangdiem();
            bd.setMasinhvien(txtstufentid.getText());
            bd.setTienganh(Float.parseFloat(txtenglish.getText()));
            bd.setTinhoc(Float.parseFloat(txtit.getText()));
            bd.setGdtc(Float.parseFloat(txtddtc.getText()));

            bangdiemdao dao = new bangdiemdao();
            if (dao.findbaymasinhvien(txtstufentid.getText()) != null) {
                if (messagedialoghelper.showconfirmdialog(parentForm, "bạn có muốn cập nhật điểm không", "lỗi") == JOptionPane.NO_OPTION) {
                    return;
                }
                if (dao.update(bd)) {
                    messagedialoghelper.showmessagedialog(parentForm, "Bảng điểm đã được cập nhật", "thông báo");

                } else {
                    messagedialoghelper.showmessagedialog(parentForm, "Bảng điểm chưa được cập nhật", "thông báo");
                }

            } else {
                if (dao.insert(bd)) {
                    messagedialoghelper.showmessagedialog(parentForm, "Bảng điểm đã được lưu", "thông báo");

                } else {
                    messagedialoghelper.showmessagedialog(parentForm, "Bảng điểm chưa được lưu", "thông báo");
                }
            }
            loabangfiem();
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showerrordialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tbnluuActionPerformed

    private void txtstufentidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtstufentidFocusLost
        // nhap mã ra tên sinh viên
        try {
            sinhviendao dao = new sinhviendao();
            sinhvien sv = dao.findid(txtstufentid.getText());
            if (sv != null) {
                txtname.setText(sv.getHoten());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtstufentidFocusLost

    private void txtenglishFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtenglishFocusLost
        // tinsh ddiem tb anh
        
        
        
        if (txtenglish.getText().equals("")
                || txtit.getText().equals("")
                || txtddtc.getText().equals("")) {
            return;
        }

        float ta = Float.parseFloat(txtenglish.getText());
        float it = Float.parseFloat(txtit.getText());
        float pt = Float.parseFloat(txtddtc.getText());

        float avg = (ta + it + pt) / 3;

        String st = String.format("%.2f", avg);
        lblgpa.setText(st);
    }//GEN-LAST:event_txtenglishFocusLost

    private void tbncapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbncapnhatActionPerformed
        // cap nhat giống nut lưu
       // tbnluuActionPerformed(evt);
       
         StringBuilder sb = new StringBuilder();
        datavalidator.validateEmty(txtstufentid, sb, "Ban chua nhap ma");

        if (sb.length() > 0) {
            messagedialoghelper.showerrordialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        try {
            bangdiem bd = new bangdiem();
            bd.setMasinhvien(txtstufentid.getText());
            bd.setTienganh(Float.parseFloat(txtenglish.getText()));
            bd.setTinhoc(Float.parseFloat(txtit.getText()));
            bd.setGdtc(Float.parseFloat(txtddtc.getText()));

            bangdiemdao dao = new bangdiemdao();
            if (dao.findbaymasinhvien(txtstufentid.getText()) != null) {
                if (messagedialoghelper.showconfirmdialog(parentForm, "bạn có muốn cập nhật điểm không", "lỗi") == JOptionPane.NO_OPTION) {
                    return;
                }
                if (dao.update(bd)) {
                    messagedialoghelper.showmessagedialog(parentForm, "Bảng điểm đã được cập nhật", "thông báo");

                } else {
                    messagedialoghelper.showmessagedialog(parentForm, "Bảng điểm chưa được cập nhật", "thông báo");
                }

            } else {
                if (dao.insert(bd)) {
                    messagedialoghelper.showmessagedialog(parentForm, "Bảng điểm đã được lưu", "thông báo");

                } else {
                    messagedialoghelper.showmessagedialog(parentForm, "Bảng điểm chưa được lưu", "thông báo");
                }
            }
            loabangfiem();
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showerrordialog(parentForm, e.getMessage(), "Lỗi");
        }
       
    }//GEN-LAST:event_tbncapnhatActionPerformed

    private void tbnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnxoaActionPerformed
        // xoa
        try {
            if (txtstufentid.getText().equals("")) {
                messagedialoghelper.showmessagedialog(parentForm, "ma sinh vien can phai nhap", "lỗi");
                return;
            }
            bangdiemdao dao = new bangdiemdao();//booloean thay bang sinh vien
            bangdiem db = dao.findbaymasinhvien(txtstufentid.getText());
            if (db == null) {
                messagedialoghelper.showmessagedialog(parentForm, "Mã dinh vien khong tồn tại trong bàng điểm", "lỗi");
                return;
            }
            if (messagedialoghelper.showconfirmdialog(parentForm, "Bạn muốn xóa sinh viên khoong", "thong báo")
                    == JOptionPane.NO_OPTION) {
                return;
            }

            if (dao.deletebymasinhvien(txtstufentid.getText())) {
                messagedialoghelper.showmessagedialog(parentForm, "diem cua sinh vien da dc xoa", "thong bao");
            } else {
                messagedialoghelper.showerrordialog(parentForm, "diem cua sinh vien k the xoa", "thong bao");
            }
            loabangfiem();
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showerrordialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tbnxoaActionPerformed

    private void tbldiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldiemMouseClicked
        // hiển thị lên form
        try {
            int row = tbldiem.getSelectedRow();
            if (row >= 0) {
                String id = (String) tbldiem.getValueAt(row, 0);
                bangdiemdao dao = new bangdiemdao();
                bangdiem sv = dao.findbaymasinhvien(id);
                sinhviendao svdao = new sinhviendao();
                sinhvien svs = svdao.findid(sv.getMasinhvien());
                if (sv != null) {
                    txtstufentid.setText(sv.getMasinhvien());
                    //them phan hien thi ten
                    txtname.setText(svs.getHoten());
                    txtenglish.setText(sv.getTienganh() + "");
                    txtit.setText(sv.getTinhoc() + "");
                    txtddtc.setText(sv.getGdtc() + "");

                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
//                                           

    }//GEN-LAST:event_tbldiemMouseClicked

    private void tbnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnsearchActionPerformed
        // tim kiem
        try {
            bangdiemdao dao = new bangdiemdao();
            bangdiem bd = dao.findbaymasinhvien(txtstudentmasearch.getText());

            if (bd != null) {
                txtstufentid.setText(bd.getMasinhvien());
                txtenglish.setText(String.format("%.2f", bd.getTienganh()));
                txtit.setText(String.format("%.2f", bd.getTinhoc()));
                txtddtc.setText(String.format("%.2f", bd.getGdtc()));
                txtstufentidFocusLost(null); // rả ten
                txtenglishFocusLost(null); // điểm
            } else {
                messagedialoghelper.showmessagedialog(parentForm, "khong tim thay sinh vien co ma theo yeu cau", "thong bao");
            }
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showerrordialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tbnsearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // vè 1
        position = 0;
        try {
            bangdiem db = getposition(position);
            sinhviendao svdao = new sinhviendao();
            sinhvien svs = svdao.findid(db.getMasinhvien());
            txtstufentid.setText(db.getMasinhvien());
            txtname.setText(svs.getHoten());
            txtenglish.setText(db.getTienganh() + "");
            txtit.setText(db.getTinhoc() + "");
            txtddtc.setText(db.getGdtc() + "");
            txtenglishFocusLost(null);
            tbldiem.setRowSelectionInterval(position, position);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // -
        bangdiemdao dao = new bangdiemdao();
        ;

        try {
            position--;
            if (position < 0) {
                position = dao.findall().size() - 1;
            }
            bangdiem db = getposition(position);
            sinhviendao svdao = new sinhviendao();
            sinhvien svs = svdao.findid(db.getMasinhvien());
            txtstufentid.setText(db.getMasinhvien());
            txtname.setText(svs.getHoten());
            txtenglish.setText(db.getTienganh() + "");
            txtit.setText(db.getTinhoc() + "");
            txtddtc.setText(db.getGdtc() + "");
            //  lblgpa.setText(db.);
            txtenglishFocusLost(null);
            tbldiem.setRowSelectionInterval(position, position);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void clockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockActionPerformed
        // clock

        Thread dg = new Thread(this);
        dg.start();


    }//GEN-LAST:event_clockActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // top 3
        try {
            bangdiemdao dao = new bangdiemdao();
            List<bangdiem> list = dao.findtop(3);
            tblmodel.setRowCount(0);
            for (bangdiem db : list) {
                tblmodel.addRow(new Object[]{
                    db.getMasinhvien(), db.getTienganh(), db.getTinhoc(), db.getGdtc(),
                    (db.getTienganh() + db.getTinhoc() + db.getGdtc()) / 3
                });

            }
            tblmodel.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showerrordialog(parentForm, e.getMessage(), "LOI");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // cuoi
        bangdiemdao dao = new bangdiemdao();

        try {
            position = dao.findall().size() - 1;
            bangdiem db = getposition(position);

            sinhviendao svdao = new sinhviendao();
            sinhvien svs = svdao.findid(db.getMasinhvien());
            txtstufentid.setText(db.getMasinhvien());
            txtname.setText(svs.getHoten()); // lấy từ sinh vien dao vs sinh vien
            txtenglish.setText(db.getTienganh() + "");
            txtit.setText(db.getTinhoc() + "");
            txtddtc.setText(db.getGdtc() + "");
            txtenglishFocusLost(null);
            tbldiem.setRowSelectionInterval(position, position);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // ---
        bangdiemdao dao = new bangdiemdao();

        try {

            position++;
            if (position > dao.findall().size() - 1) {
                position = 0;
            }
            bangdiem db = getposition(position);
            sinhviendao svdao = new sinhviendao();
            sinhvien svs = svdao.findid(db.getMasinhvien());
            txtstufentid.setText(db.getMasinhvien());
            txtname.setText(svs.getHoten());

            txtenglish.setText(db.getTienganh() + "");
            txtit.setText(db.getTinhoc() + "");
            txtddtc.setText(db.getGdtc() + "");
            txtenglishFocusLost(null);
            tbldiem.setRowSelectionInterval(position, position);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       // all lên form
        
        try {
            bangdiemdao dao = new bangdiemdao();
            List<bangdiem> list = dao.findtop(10);
            tblmodel.setRowCount(0);
            for (bangdiem db : list) {
                tblmodel.addRow(new Object[]{
                    db.getMasinhvien(), db.getTienganh(), db.getTinhoc(), db.getGdtc(),
                    (db.getTienganh() + db.getTinhoc() + db.getGdtc()) / 3
                });

            }
            tblmodel.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showerrordialog(parentForm, e.getMessage(), "LOI");
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clock;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblgpa;
    private javax.swing.JTable tbldiem;
    private javax.swing.JButton tbncapnhat;
    private javax.swing.JButton tbnluu;
    private javax.swing.JButton tbnnhapmoi;
    private javax.swing.JButton tbnsearch;
    private javax.swing.JButton tbnxoa;
    private javax.swing.JTextField txtddtc;
    private javax.swing.JTextField txtenglish;
    private javax.swing.JTextField txtit;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstudentmasearch;
    private javax.swing.JTextField txtstufentid;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            try {
                Date now = new Date();
                SimpleDateFormat hh = new SimpleDateFormat();
                // hh.applyPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
                hh.applyPattern("HH:mm:ss.aa ");
                // hh.applyPattern("hh:mm:ss aa");

                String time = hh.format(now);
                clock.setText(time);
                //  start.setText(time);
                Thread.sleep(1000);

            } catch (Exception ex) {
                break;
            }
        }
    }
}
