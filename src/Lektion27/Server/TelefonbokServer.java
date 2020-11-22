package Lektion27.Server;

import Lektion27.Client.DAO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
    DAO d = new DAO();

    public TelefonbokServer(){

        try(ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ) {

            String input;
            String output;

            out.println("Vilken kompis vill du veta numret till?");

            while ((input = in.readLine()) != null) {
                output = d.getKompis(input);

                if(output == null) {
                    out.println("Kompisen " + input + " finns inte registrerad");
                }
                else{
                    out.println(output);
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
