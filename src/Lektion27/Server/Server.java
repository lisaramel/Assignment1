package Lektion27.Server;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-09
 * Time: 10:50
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Server {

    int port = 33333;
    String quote1 = "What a good day to be proud of all the progress I've made";
    String quote2 = "I was in the mood for a new mood";
    String quote3 = "It's O-K";

    public Server() {

        List<String> allQuotes = new ArrayList<>();
        allQuotes.add(quote1);
        allQuotes.add(quote2);
        allQuotes.add(quote3);
        int listCounter = 0;

        try (ServerSocket serverSocket = new ServerSocket(port);
             Socket socket = serverSocket.accept();
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            // BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             ) {

            while (true) {
                listCounter = (listCounter + 1) % 3;
                out.println((allQuotes.get(listCounter)));
                Thread.sleep(2000);
                //System.out.println(in.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server s = new Server();
    }
}
