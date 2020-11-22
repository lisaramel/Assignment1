package Lektion28.Serializable.ServerSerializable;

import Lektion28.Serializable.ClientSerializable.Database;
import Lektion28.Serializable.ClientSerializable.Friend;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-09
 * Time: 15:09
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class TelefonbokServer {

    int port = 22222;
    Database d = new Database();

    public TelefonbokServer(){

        try(ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            ) {

            Object input;
            Friend outputFriend;

            out.writeObject(new Friend("Vilken kompis vill du veta numret till?", 0, null, null));

            while ((input = (String)in.readObject()) != null) {
                outputFriend = d.getKompis(((String)input));

                if(outputFriend == null) {
                    out.writeObject(new Friend("Denna person finns inte registrerad", 0,null, null));
                }
                else{
                    out.writeObject(outputFriend);
                }

            }



        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TelefonbokServer ts = new TelefonbokServer();
    }
}
