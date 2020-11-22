package Projects.WeatherProgram;

import javax.swing.*;
import java.awt.*;
import java.net.DatagramPacket;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-02
 * Time: 13:53
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class WeatherRecieverMulticast extends JFrame implements Runnable{

    MulticastSocket socket;
    Thread activity = new Thread(this);
    List<String> newEntry = new ArrayList<>();

    JPanel panel = new JPanel();
    JTextArea textArea = new JTextArea(10,20);


    public WeatherRecieverMulticast(MulticastSocket ms) {

        socket = ms;
        activity.start();

        add(panel);
        panel.add(textArea, BorderLayout.SOUTH);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void run() {
                newRow(new byte[256]);
    }

    public void newRow(byte[] data){

        while (true) {
            try {
                DatagramPacket packet = new DatagramPacket(data, data.length);
                socket.receive(packet);
                String message = new String(packet.getData(), 0, packet.getLength());

                newEntry.add(message);

                String newText = "";
                for (int i = 0; i < newEntry.size(); i++) {
                    newText += (String) newEntry.get(i) + '\n' + '\n';
                    i += 1;
                }
                textArea.setText(newText);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
