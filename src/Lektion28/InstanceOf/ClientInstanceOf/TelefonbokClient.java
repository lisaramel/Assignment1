package Lektion28.InstanceOf.ClientInstanceOf;

import Lektion28.InstanceOf.ServerInstanceOf.Initiate;
import Lektion28.InstanceOf.ServerInstanceOf.Response;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

                Object fromServer;
                String fromClient;
                BufferedReader buffIn = new BufferedReader(new InputStreamReader(System.in));

                while(true) {
                while ((fromServer = in.readObject()) != null) {

                    if(fromServer instanceof Initiate) {
                        System.out.println("Connection completed");
                        //System.out.println("Vilken kompis vill du ha e-mail till?");
                    }
                    else if(fromServer instanceof Response) {
                        if (!((Response) fromServer).isFound()) { // om found är false
                            System.out.println("Denna person finns inte registrerad.");
                            System.out.println();
                        } else {
                            System.out.println(((Response) fromServer).getFriend().getInfo());
                            System.out.println();
                        }
                    }
                    System.out.println("Vilken kompis vill du ha info om?");

                    fromClient = buffIn.readLine();
                    if (fromClient != null)
                        //System.out.println("Client: " + fromClient);
                        out.writeObject(fromClient);
                    }

                 //if((buffIn.readLine()) == null) {
                 //    System.exit(0);
                // }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


    }

    public static void main(String[] args) {

            TelefonbokClient tc = new TelefonbokClient();

    }
}
