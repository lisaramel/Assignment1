package Lektion24;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-02
 * Time: 10:40
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class QuoteRecieverThread implements Runnable {

    //LocalDateTime today;
      DateTimeFormatter formatter;

    QuoteRecieverThread(){
         //this.today = LocalDateTime.now().withNano(0);
           formatter = DateTimeFormatter.ofPattern("uuuu-MM.dd HH:mm:ss");

    }
    @Override
    public void run() {

        int minPort = 55556;
        try (DatagramSocket socket = new DatagramSocket(minPort);) {
            byte[] data = new byte[256];

            while (true) {
                DatagramPacket packet = new DatagramPacket(data, data.length);
                socket.receive(packet);
                //System.out.println("Citat från " + packet.getAddress().getHostAddress() + " " + LocalDateTime.now().format(formatter));
                String quote = new String(packet.getData(), 0, packet.getLength());
                System.out.println(quote);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
