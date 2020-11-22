package Lektion29.ServerPhoneBook;

import Lektion29.ClientPhoneBook.Database;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-09
 * Time: 15:09
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Server extends Thread {

    Socket clientSocket;

    public Server(Socket clientSocket) throws ClassNotFoundException, IOException {
        this.clientSocket = clientSocket;

    }

    public void run(){

        try(
            ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
            ) {

            String input;

            Protocol protocol = new Protocol();
            out.writeObject(protocol.processInput(null));

            while ((input = (String)in.readObject()) != null) {
                out.writeObject(protocol.processInput(input));
            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
