/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh.chat_blibs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JTextPane;

/**
 *
 * @author ASUS
 */
public class chat_messageSocket {
    private Socket socket;
    private JTextPane txpmessgeboard;
    private PrintWriter out;
    private BufferedReader readr;

 

    public chat_messageSocket(Socket socket, JTextPane txpmessgeboard) throws IOException {
        this.socket = socket;
        this.txpmessgeboard = txpmessgeboard;
        out = new PrintWriter(socket.getOutputStream());
        readr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    
        receive();
    }
    private  void receive(){
        Thread th = new Thread(){
            public void run(){
            while(true){
                try {
                    String  line =readr.readLine();
                    if(line !=null){
                        txpmessgeboard.setText(txpmessgeboard.getText()+"\n"+line);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
            }
            
        };
        th.start();
    }
   
    public  void send(String mag){
       String current= txpmessgeboard.getText();
        txpmessgeboard.setText(current+"\nSent:"+mag);
        out.println(mag);
        out.flush();
    }
    public void close(){
        try {
            out.close();
            readr.close();
            socket.close();
        } catch (Exception e) {
        }
    }
    
}
