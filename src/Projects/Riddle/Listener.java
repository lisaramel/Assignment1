package Projects.Riddle;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-11
 * Time: 11:00
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Listener {

    public static void main(String[] args) throws IOException {
        int portNumber = 22222;

        ServerSocket serverSocket = new ServerSocket(portNumber);
        while(true){
            try {
                final Socket clientSocket = serverSocket.accept();
                RiddleServer clientListener = new RiddleServer(clientSocket);
                clientListener.start();

            } catch(Exception e){
                e.printStackTrace();
            }


        }
    }
}
