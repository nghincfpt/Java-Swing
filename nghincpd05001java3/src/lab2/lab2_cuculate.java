/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class lab2_cuculate extends javax.swing.JFrame {
String operandl = "";
String operator =" ";

boolean isEqualsFerss =false;
    public lab2_cuculate() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        manhinh = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnchia = new javax.swing.JButton();
        tbncan = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        tbn6 = new javax.swing.JButton();
        btncnhan = new javax.swing.JButton();
        btnphantram = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btntru = new javax.swing.JButton();
        btn1chix = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        tbncongtru = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        btncong = new javax.swing.JButton();
        tnbbang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("casio");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        manhinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        manhinh.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(manhinh, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manhinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.GridLayout(4, 5, 5, 5));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3);

        btnchia.setText("/");
        btnchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchiaActionPerformed(evt);
            }
        });
        jPanel2.add(btnchia);

        tbncan.setText("sqrt");
        tbncan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbncanActionPerformed(evt);
            }
        });
        jPanel2.add(tbncan);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5);

        tbn6.setText("6");
        tbn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn6ActionPerformed(evt);
            }
        });
        jPanel2.add(tbn6);

        btncnhan.setText("*");
        btncnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncnhanActionPerformed(evt);
            }
        });
        jPanel2.add(btncnhan);

        btnphantram.setText("%");
        btnphantram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbncanActionPerformed(evt);
            }
        });
        jPanel2.add(btnphantram);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9);

        btntru.setText("-");
        btntru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntruActionPerformed(evt);
            }
        });
        jPanel2.add(btntru);

        btn1chix.setText("1/x");
        btn1chix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbncanActionPerformed(evt);
            }
        });
        jPanel2.add(btn1chix);

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0);

        tbncongtru.setText("+/-");
        tbncongtru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbncongtruActionPerformed(evt);
            }
        });
        jPanel2.add(tbncongtru);

        btnc.setText("c");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });
        jPanel2.add(btnc);

        btncong.setText("+");
        btncong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncongActionPerformed(evt);
            }
        });
        jPanel2.add(btncong);

        tnbbang.setText("=");
        tnbbang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnbbangActionPerformed(evt);
            }
        });
        jPanel2.add(tnbbang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(42, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbncanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbncanActionPerformed
  if(manhinh.getText().equals("")){
      return;
  }
  String cmd=evt.getActionCommand();
        try {
            double value = Double.parseDouble(manhinh.getText());
            if(cmd.equals("sqrt")){
            value = Math.sqrt(value);
            }else if(cmd.equals("%")){
                value=value*100;
            }if(cmd.equals("1/x")){
                value =1/value;
            }
            manhinh.setText(""+value);
            isEqualsFerss = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbncanActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        //1
     if(isEqualsFerss){
            isEqualsFerss = false;
            manhinh.setText("");
        }
         String cmd = evt.getActionCommand();
        manhinh.setText(manhinh.getText()+cmd);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
      if(isEqualsFerss){
            isEqualsFerss = false;
            manhinh.setText("");
        }
         String cmd = evt.getActionCommand();
        manhinh.setText(manhinh.getText()+cmd);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
         if(isEqualsFerss){
            isEqualsFerss = false;
            manhinh.setText("");
        }
         String cmd = evt.getActionCommand();
        manhinh.setText(manhinh.getText()+cmd);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
           if(isEqualsFerss){
            isEqualsFerss = false;
            manhinh.setText("");
        }
         String cmd = evt.getActionCommand();
        manhinh.setText(manhinh.getText()+cmd);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
          if(isEqualsFerss){
            isEqualsFerss = false;
            manhinh.setText("");
        }
         String cmd = evt.getActionCommand();
        manhinh.setText(manhinh.getText()+cmd);
    }//GEN-LAST:event_btn5ActionPerformed

    private void tbn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn6ActionPerformed
        // TODO add your handling code here:
          if(isEqualsFerss){
            isEqualsFerss = false;
            manhinh.setText("");
        }
         String cmd = evt.getActionCommand();
        manhinh.setText(manhinh.getText()+cmd);
    }//GEN-LAST:event_tbn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        
           if(isEqualsFerss){
            isEqualsFerss = false;
            manhinh.setText("");
        }
         String cmd = evt.getActionCommand();
        manhinh.setText(manhinh.getText()+cmd);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
         if(isEqualsFerss){
            isEqualsFerss = false;
            manhinh.setText("");
        }
         String cmd = evt.getActionCommand();
        manhinh.setText(manhinh.getText()+cmd);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
          if(isEqualsFerss){
            isEqualsFerss = false;
            manhinh.setText("");
        }
         String cmd = evt.getActionCommand();
        manhinh.setText(manhinh.getText()+cmd);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        if(isEqualsFerss){
            isEqualsFerss = false;
            manhinh.setText("");
        }
         String cmd = evt.getActionCommand();
        manhinh.setText(manhinh.getText()+cmd);
    }//GEN-LAST:event_btn0ActionPerformed

    private void tbncongtruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbncongtruActionPerformed
     
        try {
           double  value = Double.parseDouble(manhinh.getText());
           value = - value;
           manhinh.setText(""+value);
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this,"loi");
    }
    }//GEN-LAST:event_tbncongtruActionPerformed

    private void btnchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchiaActionPerformed
       String cmd=evt.getActionCommand();
         operator= cmd;
        operandl = manhinh.getText();
        manhinh.setText("");
    }//GEN-LAST:event_btnchiaActionPerformed

    private void btncnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncnhanActionPerformed
       String cmd=evt.getActionCommand();
         operator= cmd;
        operandl = manhinh.getText();
        manhinh.setText("");
    }//GEN-LAST:event_btncnhanActionPerformed


    private void btntruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntruActionPerformed
       String cmd=evt.getActionCommand();
         operator= cmd;
        operandl = manhinh.getText();
        manhinh.setText("");
    }//GEN-LAST:event_btntruActionPerformed

    private void btncongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncongActionPerformed
     String cmd=evt.getActionCommand();
         operator= cmd;
        operandl = manhinh.getText();
        manhinh.setText("");
    }//GEN-LAST:event_btncongActionPerformed
//r//r  hang tu
    private void tnbbangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnbbangActionPerformed
       if(manhinh.getText().equals("") || operandl.equals("")){
           return;
       }
        try {
           double so1=Double.parseDouble(operandl);
           double s2=Double.parseDouble(manhinh.getText());
           double result=0;
          if(operator.equals("+")) {
           result= so1 + s2;
          }else
              if(operator.equals("-")) {
           result= so1 - s2;
          }else
              if(operator.equals("*")) {
           result= so1 * s2;
           }else
              if(operator.equals("/")) {
           result= so1 / s2;
          }
          manhinh.setText(""+result);
          isEqualsFerss=true;
        }catch (Exception e) {
    e.printStackTrace();
        }
              
    }//GEN-LAST:event_tnbbangActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
      manhinh.setText("");
      operandl="";
      operator="";
      isEqualsFerss = false;
    }//GEN-LAST:event_btncActionPerformed

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
            java.util.logging.Logger.getLogger(lab2_cuculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab2_cuculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab2_cuculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab2_cuculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab2_cuculate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn1chix;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnchia;
    private javax.swing.JButton btncnhan;
    private javax.swing.JButton btncong;
    private javax.swing.JButton btnphantram;
    private javax.swing.JButton btntru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField manhinh;
    private javax.swing.JButton tbn6;
    private javax.swing.JButton tbncan;
    private javax.swing.JButton tbncongtru;
    private javax.swing.JButton tnbbang;
    // End of variables declaration//GEN-END:variables
}
