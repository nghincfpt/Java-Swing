/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class doimau extends Frame implements ActionListener{
 Button btnRed,btnBlue;
    public doimau(String title) throws HeadlessException {
        super(title);
        btnRed = new Button("red");
        btnBlue = new Button("blue");
        setLayout(new FlowLayout());
        add(btnRed);
        add(btnBlue);
        btnRed.addActionListener(this);
        btnBlue.addActionListener(this);
    }
   @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("red")){
       setBackground(Color.red);
    }else{
            setBackground(Color.blue);
        }
    }
   
    public static void main(String[] args) {
      
        doimau frame = new doimau("AWT frame demo ");
        frame.setSize(300,200);
       frame.addWindowListener( new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
       });

        frame.setVisible(true);
    }
}
