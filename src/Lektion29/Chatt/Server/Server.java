package Lektion29.Chatt.Server;
import Lektion29.Chatt.Client.Reciever;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-11
 * Time: 11:11
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Server extends Thread{

    private Socket clientSocket;
    private int port = 12345;

    public Server(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run(){

        try (PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        ) {
            String input;

            Reciever d = new Reciever(in, "Klient");
            d.start();

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

            Protocol protocol = new Protocol();
            out.println(protocol.processInput(null));

            while ((input = inputReader.readLine()) != null) {
                out.println(protocol.processInput(input));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}