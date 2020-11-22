package Lektion26;

import java.net.DatagramPacket;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-06
 * Time: 13:41
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class ClassChatReciever extends ClassChatView implements Runnable{

    MulticastSocket socket;
    Thread activity = new Thread(this);
    List<String> newMessage = new ArrayList<>();

    public ClassChatReciever(MulticastSocket sock){

        socket = sock;
        activity.start();

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

                newMessage.add(message);

                String newText = "";
                for (int i = 0; i < newMessage.size(); i++) {
                    newText += (String) newMessage.get(i) + '\n' + '\n';
                    i += 1;
                }
                chatTextField.setText(newText);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
