/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh.ba7;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author ASUS
 */
public class UDPServar {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramsocket = new DatagramSocket(8079);
            byte[] readBudder = new byte[1024];
            byte[] writeBuffer = null;
            System.out.println("listening...");
            while(true){
                DatagramPacket receivePacket = new DatagramPacket(readBudder,readBudder.length);
                datagramsocket.receive(receivePacket);
                
                String  line  = new String(receivePacket.getData());
                System.out.println("Received :");
                
                writeBuffer = line .toUpperCase().getBytes();
                InetAddress host = receivePacket.getAddress();
                int port = receivePacket.getPort();
                DatagramPacket sendPacket = new DatagramPacket(writeBuffer,writeBuffer.length,host,port);
                System.out.println(" Sent: "+line.toUpperCase());
                datagramsocket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
