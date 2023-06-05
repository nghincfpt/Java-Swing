/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghincjava3.ass;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import nghincjava3.ass.Model.sinhvien;
import nghincjava3.ass.Dao.sinhviendao;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import nghincjava3.ass.Heler.datavalidator;
import nghincjava3.ass.Heler.imagetHeld;
import nghincjava3.ass.Heler.messagedialoghelper;

public class studentPanel extends javax.swing.JPanel implements Runnable {

    private mainForm parentform;
    private DefaultTableModel tblmodel;
    private byte[] personalImage;

    int position;

    public studentPanel() {
        initComponents();
        position = 0;
        initable();

        loadtatotablle();

        clockActionPerformed(null);

    }

    private void initable() {
        tblmodel = new DefaultTableModel();
        tblmodel.setColumnIdentifiers(new String[]{"Mã Sinh Viên", "Họ tên", "email", "SĐT", "giới tính", "địa chỉ"});
        tblstudent.setModel(tblmodel);
    }

    public sinhvien getsinhvienposition(int positiion) {
        sinhviendao dao = new sinhviendao();
        sinhvien sv = new sinhvien();
        sv.setMasinhvien(tblstudent.getValueAt(position, 0).toString());
        sv.setHoten(tblstudent.getValueAt(position, 1).toString());
        sv.setEmail(tblstudent.getValueAt(position, 2).toString());

        sv.setSdt(tblstudent.getValueAt(position, 3).toString());

        sv.setDiachi(tblstudent.getValueAt(position, 5).toString());
        try {
            count.setText((position + 1) + " of " + dao.findall().size());
        } catch (Exception ex) {
            Logger.getLogger(studentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sv;

    }

    private void loadtatotablle() {
        try {
            sinhviendao dao = new sinhviendao();
            List<sinhvien> list = dao.findall();
            tblmodel.setRowCount(0);
            for (sinhvien it : list) {
                tblmodel.addRow(new Object[]{
                    it.getMasinhvien(), it.getHoten(), it.getEmail(), it.getSdt(),
                    it.getGioitinh() == 1 ? "nam" : "nữ",  it.getDiachi()
                });
                
             //   System.out.println("dia chi: " + it.getDiachi()); gọi địa chỉ trong sql 
            }
            tblmodel.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showerrordialog(parentform, e.getMessage(), "lỗi");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        txtten = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblimage = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        nam = new javax.swing.JRadioButton();
        nu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstudent = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdiachi = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        tbnnew = new javax.swing.JButton();
        tbnsave = new javax.swing.JButton();
        tbndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        clock = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        count = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 0, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Quản Lý Sinh Viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã Sinh Viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Họ Tên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("SĐT");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Giới Tính");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Địa Chỉ");

        txtma.setText("pd05001");

        txtten.setText("Nguyễn Công nghị");

        txtemail.setText("nghi@123");

        txtsdt.setText("0331245678");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/10207-man-student-light-skin-tone-icon-64.png"))); // NOI18N
        lblimage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnBrowse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/open-file-icon-16.png"))); // NOI18N
        btnBrowse.setText("Mở hình");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(btnBrowse)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimage, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnBrowse))
        );

        buttonGroup1.add(nam);
        nam.setSelected(true);
        nam.setText("nam");

        buttonGroup1.add(nu);
        nu.setText("Nữ");

        tblstudent.setBackground(new java.awt.Color(255, 102, 255));
        tblstudent.setModel(new javax.swing.table.DefaultTableModel(
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
        tblstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblstudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblstudent);

        txtdiachi.setColumns(20);
        txtdiachi.setRows(5);
        txtdiachi.setText("12 Nghệ An");
        jScrollPane2.setViewportView(txtdiachi);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbnnew.setBackground(new java.awt.Color(255, 255, 153));
        tbnnew.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/new-icon-16.png"))); // NOI18N
        tbnnew.setText("Tạo Mới ");
        tbnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnnewActionPerformed(evt);
            }
        });

        tbnsave.setBackground(new java.awt.Color(255, 255, 153));
        tbnsave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Save-icon.png"))); // NOI18N
        tbnsave.setText("Lưu");
        tbnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnsaveActionPerformed(evt);
            }
        });

        tbndelete.setBackground(new java.awt.Color(255, 255, 153));
        tbndelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Actions-edit-delete-icon-16.png"))); // NOI18N
        tbndelete.setText("Xóa");
        tbndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbndeleteActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(255, 255, 153));
        btnupdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Actions-document-edit-icon-16.png"))); // NOI18N
        btnupdate.setText("Cập nhật");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbnnew)
                .addGap(45, 45, 45)
                .addComponent(tbnsave)
                .addGap(59, 59, 59)
                .addComponent(btnupdate)
                .addGap(70, 70, 70)
                .addComponent(tbndelete)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnnew)
                    .addComponent(tbnsave)
                    .addComponent(tbndelete)
                    .addComponent(btnupdate))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        clock.setText("clock");
        clock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Fast-backward-icon-48.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Button-First-icon-48_1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Button-Last-icon-48.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ass/icom/Fast-forward-icon-48.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        count.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        count.setForeground(new java.awt.Color(255, 51, 51));
        count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count.setText("0 of 0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(68, 68, 68)
                .addComponent(jButton2)
                .addGap(64, 64, 64)
                .addComponent(jButton3)
                .addGap(59, 59, 59)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(count)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(173, 173, 173)
                                        .addComponent(nu)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nam)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtma)
                                    .addComponent(txtten)
                                    .addComponent(txtemail)
                                    .addComponent(txtsdt))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(clock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nam)
                            .addComponent(nu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnnewActionPerformed
        txtma.setText("");
        txtten.setText("");
        txtemail.setText("");
        txtsdt.setText("");
        buttonGroup1.clearSelection(); // button  group
        txtdiachi.setText("");
        personalImage = null;
        ImageIcon icon = new ImageIcon(getClass().getResource("/ass/icom/10207-man-student-light-skin-tone-icon-64.png"));
        lblimage.setIcon(icon);

    }//GEN-LAST:event_tbnnewActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        //hinh 
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                } else {
                    return f.getName().toLowerCase().endsWith(".jpg");
                }
            }

            @Override
            public String getDescription() {
                return "Image File (*.jpg)";
            }
        });
        if (chooser.showOpenDialog(parentform) == JOptionPane.CANCEL_OPTION) {
            return;
        }
        File file = chooser.getSelectedFile();
        try {
            ImageIcon icon = new ImageIcon(file.getPath());
            Image img = imagetHeld.resize(icon.getImage(), 140, 160);
            ImageIcon reImageIcon = new ImageIcon(img);
            lblimage.setIcon(reImageIcon);
            personalImage = imagetHeld.toByteArray(img, "jpg");

        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showerrordialog(parentform, e.getMessage(), "loi");
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void tbnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnsaveActionPerformed
        // save
        StringBuilder sb = new StringBuilder();
        datavalidator.validateEmty(txtma, sb, "Mã sinh viên không được để trông ");
        datavalidator.validateEmty(txtten, sb, "Tên  sinh viên không được để trông ");
        datavalidator.validateEmty(txtemail, sb, "EMAIL  không được để trông ");
        datavalidator.validateEmty(txtsdt, sb, "SĐT không được để trông ");
        datavalidator.validateEmty(txtsdt, sb, "SĐT không được để trông ");
       String sdt = txtsdt.getText();
        if(sdt.length()<=9){
            JOptionPane.showMessageDialog(parentform, "SDT  chưa đúng định dạnh");
            txtsdt.setBackground(Color.red);
        }else{
            txtsdt.setBackground(Color.white);
        }
        if (sb.length() > 0) {
            messagedialoghelper.showerrordialog(parentform, sb.toString(), "lỗi");
            return;
        }

        try {
            sinhvien sv = new sinhvien();
            sv.setMasinhvien(txtma.getText());
            sv.setHoten(txtten.getText());
            sv.setEmail(txtemail.getText());
            sv.setSdt(txtsdt.getText());
            sv.setDiachi(txtdiachi.getText());
            sv.setGioitinh(nam.isSelected() ? 1 : 0);
            sv.setHinh(personalImage);
            sinhviendao dao = new sinhviendao();
            if (dao.insert(sv)) {
                messagedialoghelper.showmessagedialog(parentform, "sinh  viên đã được lưu", "thông báo");
                loadtatotablle();
            } else {
                messagedialoghelper.showconfirmdialog(parentform, "sinh viên không được lưu do lỗi", "cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showerrordialog(parentform,
                    e.getMessage(), "lỗi");
        }
    }//GEN-LAST:event_tbnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // update
        StringBuilder sb = new StringBuilder();
        datavalidator.validateEmty(txtma, sb, "Mã sinh viên không được để trông ");
        datavalidator.validateEmty(txtten, sb, "Tên  sinh viên không được để trông ");

        if (sb.length() > 0) {
            messagedialoghelper.showerrordialog(parentform, sb.toString(), "lỗi");
            return;
        }
        if (messagedialoghelper.showconfirmdialog(parentform, "ban có muốn cập nhật", "hỏi") == JOptionPane.NO_OPTION) {
            return;

        }
        try {
            sinhvien sv = new sinhvien();
            sv.setMasinhvien(txtma.getText());
            sv.setHoten(txtten.getText());
            sv.setEmail(txtemail.getText());
            sv.setSdt(txtsdt.getText());
            sv.setDiachi(txtdiachi.getText());
            sv.setGioitinh(nam.isSelected() ? 1 : 0);
            sv.setHinh(personalImage);
            sinhviendao dao = new sinhviendao();
            if (dao.update(sv)) {
                messagedialoghelper.showmessagedialog(parentform, "sinh  viên đã được cập nhật", "thông báo");
                loadtatotablle();
            } else {
                messagedialoghelper.showconfirmdialog(parentform, "sinh viên không được cập nhật do lỗi", "cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showerrordialog(parentform,
                    e.getMessage(), "lỗi");
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void tbndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbndeleteActionPerformed
        // delete

        StringBuilder sb = new StringBuilder();
        datavalidator.validateEmty(txtma, sb, "Mã sinh viên không được để trông ");
        if (sb.length() > 0) {
            messagedialoghelper.showerrordialog(parentform, sb.toString(), "lỗi");
            return;
        }
        if (messagedialoghelper.showconfirmdialog(parentform, "ban có muốn xóa sinh viên hay k ??", "hỏi") == JOptionPane.NO_OPTION) {
            return;
        }
        try {

            sinhviendao dao = new sinhviendao();
            if (dao.delete(txtma.getText())) {
                messagedialoghelper.showmessagedialog(parentform, "sinh  viên đã được  XÓA", "thông báo");
                tbnnewActionPerformed(evt);
                loadtatotablle();
            } else {
                messagedialoghelper.showconfirmdialog(parentform, "sinh viên không  XÓA do lỗi", "cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showerrordialog(parentform,
                    e.getMessage(), "lỗi");
        }

    }//GEN-LAST:event_tbndeleteActionPerformed

    private void tblstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblstudentMouseClicked
        // hiem thi tu bang vao form
        try {
            int row = tblstudent.getSelectedRow();
            if (row >= 0) {
                String id = (String) tblstudent.getValueAt(row, 0);
                sinhviendao dao = new sinhviendao();
                sinhvien sv = dao.findid(id);
                if (sv != null) {
                    txtma.setText(sv.getMasinhvien());
                    txtten.setText(sv.getHoten());
                    txtemail.setText(sv.getEmail());
                    txtsdt.setText(sv.getSdt());
                    txtdiachi.setText(sv.getDiachi());
                    nam.setSelected(sv.getGioitinh() == 1 ? true : false);
                    if (sv.getHinh() != null) {
                        Image img = imagetHeld.createImageFromBytrArray(sv.getHinh(), "jpg");
                        lblimage.setIcon(new ImageIcon(img));
                        personalImage = sv.getHinh();
                    } else {
                        personalImage = sv.getHinh();
                        ImageIcon icon = new ImageIcon(getClass().getResource("/ass/icom/10207-man-student-light-skin-tone-icon-64.png"));
                        lblimage.setIcon(icon);

                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showerrordialog(parentform, e.getMessage(), "loi");
        }
    }//GEN-LAST:event_tblstudentMouseClicked

    private void clockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockActionPerformed
        Thread dh = new Thread(this);
        dh.start();
    }//GEN-LAST:event_clockActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        position = 0;
        try {
            sinhvien sv = getsinhvienposition(position);
            txtma.setText(sv.getMasinhvien());
            txtten.setText(sv.getHoten());
            txtemail.setText(sv.getEmail());
            txtsdt.setText(sv.getSdt());

            txtdiachi.setText(sv.getDiachi());
           
            tblstudent.setRowSelectionInterval(position, position);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // vè cuối
        sinhviendao dao = new sinhviendao();

        try {
            position = dao.findall().size() - 1;
            sinhvien sv = getsinhvienposition(position);
            txtma.setText(sv.getMasinhvien());
            txtten.setText(sv.getHoten());
            txtemail.setText(sv.getEmail());
            txtsdt.setText(sv.getSdt());

            txtdiachi.setText(sv.getDiachi());

            
            tblstudent.setRowSelectionInterval(position, position);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //--
        sinhviendao dao = new sinhviendao();

        try {

            position++;
            if (position > dao.findall().size() - 1) {
                position = 0;
            }
            sinhvien sv = getsinhvienposition(position);
            txtma.setText(sv.getMasinhvien());
            txtten.setText(sv.getHoten());
            txtemail.setText(sv.getEmail());
            txtsdt.setText(sv.getSdt());

            txtdiachi.setText(sv.getDiachi());

            tblstudent.setRowSelectionInterval(position, position);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // -
        sinhviendao dao = new sinhviendao();

        try {

            position--;
            if (position < 0) {
                position = dao.findall().size() - 1;
            }
            sinhvien sv = getsinhvienposition(position);
            txtma.setText(sv.getMasinhvien());
            txtten.setText(sv.getHoten());
            txtemail.setText(sv.getEmail());
            txtsdt.setText(sv.getSdt());

            txtdiachi.setText(sv.getDiachi());

            tblstudent.setRowSelectionInterval(position, position);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clock;
    private javax.swing.JLabel count;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblimage;
    private javax.swing.JRadioButton nam;
    private javax.swing.JRadioButton nu;
    private javax.swing.JTable tblstudent;
    private javax.swing.JButton tbndelete;
    private javax.swing.JButton tbnnew;
    private javax.swing.JButton tbnsave;
    private javax.swing.JTextArea txtdiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txtten;
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
