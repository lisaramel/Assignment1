package Lektion23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-02
 * Time: 13:53
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class WeatherReportSender {

    public static void main(String[] args) throws IOException, UnknownHostException, SocketException {

        Scanner scan = new Scanner(System.in);

        String output;
        String temp;
        String city;

        System.out.println("Vilken stad befinner du dig i?: ");
        city = scan.nextLine();

        if (city == null || city.length() == 0){
            System.exit(0);
        }

        System.out.println("Vad är det för temperatur?: ");

        InetAddress adress = InetAddress.getLocalHost();
        int port = 44441;
        DatagramSocket socket = new DatagramSocket();

        while(scan.hasNext()){
            temp = scan.next();
            output = city + " - " + temp + " grader";
            byte[] data = output.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, adress, port);
            socket.send(packet);

            System.out.println("Vilken stad befinner du dig i?: ");
            city = scan.next();

            System.out.println("Vad är det för temperatur?: ");
        }
    }

}

