/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghincjava3.ass.Heler;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class messagedialoghelper {
    public static void showmessagedialog(Component parent, String content,String title){
        JOptionPane.showMessageDialog(parent,content,title,JOptionPane.INFORMATION_MESSAGE);
        
    }
      public static void showerrordialog(Component parent, String content,String title){
        JOptionPane.showMessageDialog(parent,content,title,JOptionPane.ERROR_MESSAGE);
        
    }
        public static int showconfirmdialog(Component parent, String content,String title){
      int chooce=  JOptionPane.showConfirmDialog(parent,content,title,
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return chooce;
    }
}
