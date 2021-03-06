package Projects.PhoneBook.ServerPhoneBook;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-11
 * Time: 10:15
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Listener {


    public static void main(String[] args) throws IOException {

        int port = 22222;
        ServerSocket serverSocket = new ServerSocket(port);

        while(true) {
            try {
                final Socket clientSocket = serverSocket.accept();
                Server clientListener = new Server(clientSocket);
                clientListener.start();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
