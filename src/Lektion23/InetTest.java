package Lektion23;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-02
 * Time: 09:48
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class InetTest {

      /*  public InetTest() {
            try {
                String ip;
                Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
                while (interfaces.hasMoreElements()) {
                    NetworkInterface iface = interfaces.nextElement();
                    // filters out 127.0.0.1 and inactive interfaces
                    if (iface.isLoopback() || !iface.isUp())
                        continue;

                    Enumeration<InetAddress> addresses = iface.getInetAddresses();
                    while (addresses.hasMoreElements()) {
                        InetAddress addr = addresses.nextElement();
                        ip = addr.getHostAddress();
                        System.out.println(iface.getDisplayName() + " " + ip);
                        System.out.println(iface.getName());
                    }
                }
            } catch (SocketException e) {
                e.printStackTrace();
            }
        }

        public static void main (String[]args){
            InetTest i = new InetTest();
        }

       */

    public static void main(String[] args) {

        /*InetAddress adress = InetAddress.getLocalHost();

        System.out.println(adress);
        System.out.println(adress.getHostName());
        System.out.println(adress.getHostAddress());
        System.out.println(adress.isMulticastAddress());

        InetAddress loopBack = InetAddress.getLoopbackAddress();
        System.out.println(loopBack);

        adress = InetAddress.getByName("www.dn.se");
        //adress = InetAddress.getByName("dn.sedfvdv");
        System.out.println(adress);

        InetAddress SW[] = InetAddress.getAllByName("www.hm.se");
        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }

         */
    }

}

