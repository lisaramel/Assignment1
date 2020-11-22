package Lektion29.Chatt.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-11
 * Time: 11:10
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Client {

    Client() throws IOException {

        String ipAdr = "127.0.0.1";
        int port = 12345;

        GUI g = new GUI();


        try (Socket socket = new Socket(ipAdr, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            String input;
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

            Reciever d = new Reciever(in, "Server");
            d.start();

            while ((input = inputReader.readLine()) != null) {
                out.println(input);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException{
        Client c = new Client();
    }

}

