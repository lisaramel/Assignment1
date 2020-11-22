package Lektion23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.time.LocalDateTime;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-02
 * Time: 13:53
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class WeatherReportReciever {
    public static void main(String[] args) throws IOException {
        int myPort = 44441;

        DatagramSocket socket = new DatagramSocket(myPort);
        byte[] data = new byte[256];

        while(true){
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            System.out.println("Väderrapport " + LocalDateTime.now());
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println(message);

        }
    }
}
