package Lektion27.Client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-09
 * Time: 10:50
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Client {


    public Client(){

        String ipAdr = "127.0.0.1";
        int port = 33333;

        try(Socket socket = new Socket(ipAdr, port);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));)

        { while(true){
            System.out.println(in.readLine());
        }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client c = new Client();
    }
}
