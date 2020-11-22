package Lektion23;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.time.LocalDateTime;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-02
 * Time: 10:40
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class DatagramReciever {
    public static void main(String[] args) throws  SocketException, IOException {

        int minPort = 55555;
        DatagramSocket socket = new DatagramSocket(minPort);
        byte[] data = new byte[256];

        while (true) {
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            System.out.println("Citat från " + packet.getAddress().getHostAddress() + " " + LocalDateTime.now());
            String quote = new String(packet.getData(), 0, packet.getLength());
            System.out.println(quote);
        }
    }
}
