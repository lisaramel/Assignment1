package Lektion24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-02
 * Time: 10:39
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class QuoteSenderThread implements Runnable {

    String quote1 = "What a good day to be proud of all the progress I've made";
    String quote2 = "I was in the mood for a new mood";
    String quote3 = "It's O-K";

    @Override
    public void run() {
        BufferedReader in = new BufferedReader(new
                InputStreamReader(System.in));

        List<String> allQuotes = new ArrayList<>();
        allQuotes.add(quote1);
        allQuotes.add(quote2);
        allQuotes.add(quote3);
        int listCounter = 0;

        try (DatagramSocket socket = new DatagramSocket();) {
            InetAddress adress = InetAddress.getLocalHost();
            int port = 55556;

           // while (!Thread.interrupted()) {
                while (true) {
                byte[] data = allQuotes.get(listCounter).getBytes();
                DatagramPacket packet = new DatagramPacket(data, data.length, adress, port);
                socket.send(packet);
                listCounter = (listCounter + 1) % 3;
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

        /*
        String quote;
        System.out.println("Citat: ");

        while((quote = in.readLine()) != null){
            if(quote.equals("bye")) System.exit(0);
            byte[] data = quote.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, adress, port);
            socket.send(packet);
            System.out.println("Citat: ");
        }System.exit(0);

         */

    }
}
