/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh.ba7;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class UDPClient {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println(" Enrer a line ");
            String st = s.nextLine();

            DatagramSocket datagramsocket = new DatagramSocket();
            byte[] readBudder = new byte[1024];
            byte[] writeBuffer = null;

            InetAddress host = InetAddress.getByName("localhost");
            int post = 8079;
            writeBuffer = st.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(writeBuffer, writeBuffer.length, host, post);
            System.out.println(" Sent: " + st);
            datagramsocket.send(sendPacket);

            DatagramPacket receivePacket = new DatagramPacket(writeBuffer, writeBuffer.length);
            datagramsocket.receive(receivePacket);

            String line = new String(receivePacket.getData());
            System.out.println("Received :" + line);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
