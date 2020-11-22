package Projects.WeatherProgram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-02
 * Time: 13:53
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class WeatherSenderMulticast extends JFrame implements ActionListener {

    int port;
    InetAddress adress;
    InetSocketAddress socketAdress;
    MulticastSocket socket;

    JPanel panel = new JPanel();
    JTextField cityTextField = new JTextField(20);
    JTextField tempTextField = new JTextField(20);
    JLabel city = new JLabel("Stad: ");
    JLabel temp = new JLabel("Temperatur: ");

    DateTimeFormatter formatter;

    public WeatherSenderMulticast(String ip, int port) throws IOException {

        this.port = port;
        adress = InetAddress.getByName(ip);
        socket = new MulticastSocket(port);
        socketAdress = new InetSocketAddress(ip, port);
        socket.joinGroup(socketAdress, null);

        add(panel);
        panel.setLayout(new GridLayout(2, 1));
        panel.add(city);
        panel.add(cityTextField);
        panel.add(temp);
        panel.add(tempTextField);
        cityTextField.addActionListener(this);
        tempTextField.addActionListener(this);
        formatter = DateTimeFormatter.ofPattern("uuuu-MM.dd HH:mm:ss");


        setSize(200, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        WeatherRecieverMulticast wr = new WeatherRecieverMulticast(socket);

    }

    public void send(String city, double temp) {
        String message = LocalDateTime.now().format(formatter) + "\n" + city + " - " + temp + " grader";
        byte[] data = message.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, adress, port);
        try {
            socket.send(packet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cityTextField || e.getSource() == tempTextField) {
            Scanner scan = new Scanner(tempTextField.getText());
            send(cityTextField.getText(), scan.nextDouble());
        }
    }


    public static void main(String[] args) throws IOException, UnknownHostException, SocketException {

        WeatherSenderMulticast ws = new WeatherSenderMulticast("235.235.236.237", 44435);

    }
}

