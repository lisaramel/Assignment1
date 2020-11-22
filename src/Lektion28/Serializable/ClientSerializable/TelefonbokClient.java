package Lektion28.Serializable.ClientSerializable;

import java.io.*;
import java.net.Socket;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-09
 * Time: 15:09
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class TelefonbokClient {

    int port = 22222;
    String ipAdr = "127.0.0.1";

    public TelefonbokClient(){


            try (Socket socket = new Socket(ipAdr, port);
                 ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                 ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            ) {
                String userInput;
                Friend fromServer;
                BufferedReader buffIn = new BufferedReader(new InputStreamReader(System.in));

                while(true) {
                while ((fromServer = (Friend) in.readObject()) != null) {
                    System.out.println(fromServer.getInfo());

                    userInput = buffIn.readLine();
                    if (userInput != null)
                        out.writeObject(userInput);

                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }


    }

    public static void main(String[] args) {

            TelefonbokClient tc = new TelefonbokClient();

    }
}
