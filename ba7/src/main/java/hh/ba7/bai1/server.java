/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh.ba7.bai1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7777);

            System.out.println("Server is conecting ..");
            Socket socket = serverSocket.accept();
            System.out.println("Server is connerct ");

            DataInputStream inputStream = new DataInputStream(
                    socket.getInputStream());

            DataOutputStream outPutStream = new DataOutputStream(
                    socket.getOutputStream());

            while (true) {
                double number1 = inputStream.readDouble();
                double number2 = inputStream.readDouble();
                System.out.println("2 so nhan dc tu client la :" + number1 + "" + number2);
                double sum = number1 + number2;
                outPutStream.writeDouble(sum);
                outPutStream.flush();
                System.out.println(" tong 2 so la :" + sum);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
