/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghincjava3.ass.Heler;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class datavalidator {
   public static void validateEmty(JTextField field, StringBuilder sb,String errorMessage){
       if(field.getText().equals("")){
           sb.append(errorMessage).append("\n");
           field.setBackground(Color.red);
           field.requestFocus();
       }else{
           field.setBackground(Color.white);
       }
   } 
   
   public static void validateEmty(JPasswordField field, StringBuilder sb,String errorMessage){
       String password = new String(field.getPassword());
       if(password.equals("")){
           sb.append(errorMessage).append("\n");
           field.setBackground(Color.red);
           field.requestFocus();
       }else{
           field.setBackground(Color.white);
       }
   } 

    public static void validateEmty(JTextArea txtdiachi, StringBuilder sb, String sđt_không_được_để_trông_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
