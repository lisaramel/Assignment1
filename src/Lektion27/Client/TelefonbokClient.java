package Lektion27.Client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ) {
                String userInput;
                String serverPrintOut;
                BufferedReader buffIn = new BufferedReader(new InputStreamReader(System.in));

                while(true) {
                while ((serverPrintOut = in.readLine()) != null) {
                    System.out.println(serverPrintOut);

                    userInput = buffIn.readLine();
                    if (userInput != null)
                        out.println(userInput);

                    }

                 if((userInput = buffIn.readLine()) == null) {
                     System.exit(0);
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
