/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh.lab5;

import java.awt.Color;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class bai2 extends javax.swing.JFrame {
    ArrayList<student>list ;
int position;

    public bai2() {
    list = new ArrayList();
        initComponents();
       position = 0 ;  
    }
     public void fillTable(){
    DefaultTableModel model= (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        for (student nghi : list){
            Object[] row = new Object[]{ nghi.getMsv(),nghi.getHoten(),
               nghi.getEmail(),nghi.getSdt(),nghi.getDiachi()
            };
            model.addRow(row);
}
     }
     void setdataform(int vitri){
         student sv = list.get(vitri);
         txtma.setText(sv.getMsv());
         txtten.setText(sv.getHoten());
         txtemail.setText(sv.getEmail());
         txtsdt.setText(sv.getSdt());
         txadiachi.setText(sv.getDiachi());
         lblsum.setText((position+1) + " of "+ list.size());
     }

boolean kt(){
    boolean kt=true;
    if(txtma.getText().equals("")){
        JOptionPane.showMessageDialog(this,"ban chua nhap ma");
        txtma.setBackground(Color.red);
    }else{
        txtma.setBackground(Color.white);
    }
    if(txtten.getText().equals("")){
         JOptionPane.showMessageDialog(this,"ban chua nhap ten !!");
        txtten.setBackground(Color.red);
    }else{
        txtten.setBackground(Color.white);
    }
    if(txtemail.getText().equals("")){
        JOptionPane.showMessageDialog(this," ban chua nhap email");
        txtemail.setBackground(Color.red);
    }else{
        txtemail.setBackground(Color.WHITE);
    }
    if (txtemail.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "ban chua nhap ten !!");
        txtemail.setBackground(Color.red);
    } else {
        txtemail.setBackground(Color.white);
    }
    if(txtsdt.getText().equals("")){
        JOptionPane.showMessageDialog(this," ban chua nhap SDT");
        txtsdt.setBackground(Color.red);
    }else{
        txtsdt.setBackground(Color.white);
    }
    if(txadiachi.getText().equals("")){
        JOptionPane.showMessageDialog(this,"ban chua nhap dia chi");
        txadiachi.setBackground(Color.red);
    }else{
        txadiachi.setBackground(Color.white);
    }
    
    return kt;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grop = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
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
        nam = new javax.swing.JRadioButton();
        nu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txadiachi = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lblsum = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab5/icom/Student-3-icon.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ USERS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("MÃ SV");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("HO TÊN");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("EMAIL");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("SĐT");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("GIỚI TÍNH");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ĐỊA CHỈ");

        grop.add(nam);
        nam.setText("NAM");

        grop.add(nu);
        nu.setText("NỮ");

        txadiachi.setColumns(20);
        txadiachi.setRows(5);
        jScrollPane1.setViewportView(txadiachi);

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ma sv ", "ho ten", "email", "sdt", "dia chi"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jButton5.setText("New");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab5/icom/Button-First-icon-48.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        lblsum.setText("0 of 0 ");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab5/icom/Fast-backward-icon-48.png"))); // NOI18N

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab5/icom/Fast-forward-icon-48.png"))); // NOI18N

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab5/icom/Fast-forward-icon-48.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nam)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(lblsum))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(38, 38, 38))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nam)
                    .addComponent(nu))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7)
                        .addComponent(jButton8)
                        .addComponent(jButton9))
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(lblsum)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//       JFileChooser luu = new JFileChooser();
//       int save = luu.showSaveDialog(null);
//       if(save==JFileChooser.APPROVE_OPTION);
//        File name = luu.getSelectedFile();
//        try {
//            PrintWriter pw = new PrintWriter(name);
//            pw.print(table);
//            pw.close();
//            JOptionPane.showMessageDialog(this," more success");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
       
StringBuilder sb = new StringBuilder();
if(txtma.getText().equals("")){
    sb.append(" ma sinh vien khong duoc de trong");
    txtma.setBackground(Color.red);
}else{
    txtma.setBackground(Color.white);
}
if(sb.length()>0){
    JOptionPane.showMessageDialog(this, sb);
    return;
}
        try {
            student stud=new student();
            stud.setMsv(txtma.getText());
            stud.setHoten(txtten.getText());
            stud.setEmail(txtemail.getText());
            stud.setSdt(txtsdt.getText());
            
            stud.setGioitinh(nam.isSelected() ? 1:0);
            stud.setDiachi(txadiachi.getText());
            studentDao dao = new studentDao();
            dao.insert(stud);
            JOptionPane.showMessageDialog(this," add success ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this," Error: "+e.getMessage());
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // add
//      if( kt()==true){
//       student student = new student();
//        student.setMsv(txtma.getText());
//        student.setHoten(txtten.getText());
//        student.setEmail(txtemail.getText());
//        student.setSdt(txtsdt.getText());
//        student.setDiachi(txadiachi.getText());
//        list.add(student);
//        JOptionPane.showMessageDialog(this," more succecs");
//        fillTable();
//        
    //}    
    //search
    if(txtma.getText().equals("")){
        JOptionPane.showMessageDialog(this,"ma sinh vien phai dc nhap de tim kiem ");
        return ;
    }
        try {
            studentDao dao = new studentDao();
            student stud = dao.findId(txtma.getText());
            if(stud != null){
                txtten.setText(stud.getHoten());
                txtemail.setText(stud.getEmail());
                txtsdt.setText(stud.getSdt());
                nam.setSelected(stud.getGioitinh()==1);
                nu.setSelected(stud.getGioitinh()==0);
                txadiachi.setText(stud.getDiachi());
            }else{
                JOptionPane.showMessageDialog(this,"sinh vien k tim thay");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            e.printStackTrace();
            
        }
   
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        //delete 
//         String u =txtma.getText();
//         if(u.equals("")){
//             JOptionPane.showMessageDialog(this,"ban chua nhap ma can xoa");
//         }else{
//             int position=search(u);
//             if(position<0){
//                 JOptionPane.showMessageDialog(this,"ma khong ton tai");
//             }else{
//                 
//                 int choice =JOptionPane.showConfirmDialog(this,"ban cos chac muon xoa", u, JOptionPane.YES_NO_CANCEL_OPTION);
//                if( choice==JOptionPane.YES_OPTION){
//                 list.remove(choice);
//                 JOptionPane.showMessageDialog(this," xoa success");
//                 fillTable();
//             }}
//         }

    
StringBuilder sb = new StringBuilder();
if(txtma.getText().equals("")){
    sb.append(" ma sinh vien khong duoc de trong");
    txtma.setBackground(Color.red);
}else{
    txtma.setBackground(Color.white);
}
if(sb.length()>0){
    JOptionPane.showMessageDialog(this, sb);
    return;
}
if(JOptionPane.showConfirmDialog(this,"ban có muon xoa" ) == JOptionPane.NO_OPTION){
        return;
    }
        try {
            student stud=new student();
            stud.setMsv(txtma.getText());
            stud.setHoten(txtten.getText());
            stud.setEmail(txtemail.getText());
            stud.setSdt(txtsdt.getText());
            
            stud.setGioitinh(nam.isSelected() ? 1:0);
            stud.setDiachi(txadiachi.getText());
            studentDao dao = new studentDao();
            dao.delete(txtma.getText());
            JOptionPane.showMessageDialog(this," successful delete ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this," Error: "+e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton2ActionPerformed
        int search(String ma){
            for (int i = 0; i <list.size(); i++) {
                if(list.get(i).getMsv().equalsIgnoreCase(ma)){
                    return i;
                }
                
            }
            return -1;
        }
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
       int vitri = table.getSelectedRow();
        setdataform(vitri);
    }//GEN-LAST:event_tableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // update
//        String u =txtma.getText();
//        if(u.equals("")){
//            JOptionPane.showMessageDialog(this,"ban chua nhap ma dde update");
//        }else{
//            int position = search(u);
//            if(position<0){
//                JOptionPane.showMessageDialog( this,"ma k ton tai");
//            }else{
//                student student = new student();
//                student.setMsv(u);
//                student.setHoten(txtten.getText());
//                student.setEmail(txtemail.getText());
//                student.setSdt(txtsdt.getText());
//                student.setDiachi(txadiachi.getText());
//                list.set(position,student);
//                fillTable();
//                JOptionPane.showMessageDialog(this," cap nhat thanh cong");
//            }
//        }

      
StringBuilder sb = new StringBuilder();
if(txtma.getText().equals("")){
    sb.append(" ma sinh vien khong duoc de trong");
    txtma.setBackground(Color.red);
}else{
    txtma.setBackground(Color.white);
}
if(sb.length()>0){
    JOptionPane.showMessageDialog(this, sb);
    return;
    
}
if(JOptionPane.showConfirmDialog(this,"ban có muon xoa" ) == JOptionPane.NO_OPTION){
        return;
    }
        try {
            student stud=new student();
            stud.setMsv(txtma.getText());
            stud.setHoten(txtten.getText());
            stud.setEmail(txtemail.getText());
            stud.setSdt(txtsdt.getText());
            
            stud.setGioitinh(nam.isSelected() ? 1:0);
            stud.setDiachi(txadiachi.getText());
            studentDao dao = new studentDao();
            dao.update(stud);
            JOptionPane.showMessageDialog(this," da ddc cap nhat ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this," Error: "+e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txtma.setText("");
        txtten.setText("");
        txtsdt.setText("");
        txadiachi.setText("");
        
         grop.clearSelection();  
        txtemail.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         position=0;
        setdataform(position);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        position=list.size()-1;
        setdataform(position);
    }//GEN-LAST:event_jButton9ActionPerformed

  
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
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblsum;
    private javax.swing.JRadioButton nam;
    private javax.swing.JRadioButton nu;
    private javax.swing.JTable table;
    private javax.swing.JTextArea txadiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txtten;
    // End of variables declaration//GEN-END:variables

   
}
