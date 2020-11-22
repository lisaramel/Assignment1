package Lektion26;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-06
 * Time: 12:05
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class ClassChatSender extends ClassChatView {

    private int port;
    private InetAddress adress;
    private InetSocketAddress socketAdress;
    private MulticastSocket socket;


    public ClassChatSender(String ip, int port) throws IOException {

        this.port = port;
        adress = InetAddress.getByName(ip);
        socket = new MulticastSocket(port);
        socketAdress = new InetSocketAddress(ip, port);
        socket.joinGroup(socketAdress, null);

        MyListener l = new MyListener();
        chatTextField.addActionListener(l);

        ClassChatReciever chatReciever = new ClassChatReciever(socket);


    }


    public void send(String name, String input) {
        String message = name + '\n' + input;
        byte[] data = message.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, adress, port);
        try {
            socket.send(packet);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    class MyListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button){
       //         send(" ~ LOGGADE UT");
                System.exit(0);
            }

            if(e.getSource() == chatTextField){
//                send(chatTextField.getText());

            }
        }
    }



    public static void main(String[] args) throws Exception {
        ClassChatSender cs = new ClassChatSender("235.235.235.237", 33333);
    }
}
