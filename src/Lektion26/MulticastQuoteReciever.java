package Lektion26;

import java.io.IOException;
import java.net.*;
import java.time.LocalDateTime;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-02
 * Time: 10:40
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class MulticastQuoteReciever {
    public static void main(String[] args) throws  SocketException, IOException {

        int port = 12540;
        String ip = "234.235.236.237";
        InetAddress adress = InetAddress.getByName(ip);
        InetSocketAddress socketAdr = new InetSocketAddress(adress, port);
        MulticastSocket socket = new MulticastSocket(port);
        socket.joinGroup(socketAdr, null);
        byte[] data = new byte[256];

        while (true) {
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
           //System.out.println("Citat från " + packet.getAddress().getHostAddress() + " " + LocalDateTime.now());
            String quote = new String(packet.getData(), 0, packet.getLength());
            System.out.println(quote);
        }
    }
}
