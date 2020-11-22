package Lektion28.InstanceOf.ServerInstanceOf;

import Lektion28.InstanceOf.ClientInstanceOf.Database;
import Lektion28.InstanceOf.ClientInstanceOf.Friend;

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
public class TelefonbokServer {

    int port = 22222;
    Database d = new Database();

    public TelefonbokServer(){

        try(ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            ) {

            String input;
            Friend outputFriend;

            //out.writeObject(new Initiate());

            TelefonbokProtocol protocol = new TelefonbokProtocol();
            out.writeObject(protocol.processInput(null));

            while ((input = (String)in.readObject()) != null) {
                out.writeObject(protocol.processInput(input));
            }


            /*while ((input = (String)in.readObject()) != null) {
                outputFriend = d.getFriend(((String)input).trim());

                if(outputFriend == null) {
                    out.writeObject(new Response(false));
                }
                else{
                    out.writeObject(new Response(true, outputFriend));
                }

            }

             */



        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TelefonbokServer ts = new TelefonbokServer();
    }
}
