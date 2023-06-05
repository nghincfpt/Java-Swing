/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh.ba7.bai1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
import javax.net.ssl.SSLSocket;

/**
 *
 * @author ASUS
 */
public class client {
    public static void main(String[] args) {
        try {
            System.out.println("Cllient is conecting ..");
            Socket socket = new Socket("localhost",7777);
            System.out.println("Client is connerct ");
            DataOutputStream outPutStream = new DataOutputStream(
            socket.getOutputStream());
            DataInputStream inputStream = new  DataInputStream(
            socket.getInputStream());
            while(true){
                System.out.println("nhap vao so thu nhat 1: ");
                outPutStream.writeDouble(new Scanner(System.in).nextDouble());
                outPutStream.flush();

                System.out.println("nhap vao so thu nhat 2: ");
                outPutStream.writeDouble(new Scanner(System.in).nextDouble());
                outPutStream.flush();
                
                System.out.println("tong 2 so: "+inputStream.readDouble());
                System.out.println(" tiep tuc?(y/n)");
                String  traloi = new Scanner(System.in).nextLine();
                if(traloi.equals("n")|| traloi.equals("N")){
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
