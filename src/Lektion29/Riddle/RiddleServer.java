package Lektion29.Riddle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-10
 * Time: 13:53
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */

public class RiddleServer extends Thread{

    Socket clientSocket;
    int portNumber = 22222;

    public RiddleServer(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void run(){

        try (PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        ) {

            String inputLine, outputLine;

            RiddleProtocol protocol = new RiddleProtocol();
            outputLine = protocol.processInput(null);
            out.println(outputLine);

            while ((inputLine = in.readLine()) != null) {
                outputLine = protocol.processInput(inputLine);
                out.println(outputLine);
                if (outputLine.equals("Bye."))
                    break;
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                    + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}
