package Lektion24;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-03
 * Time: 11:16
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class QuoteMainThread {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new QuoteSenderThread());
        Thread t2 = new Thread(new QuoteSenderThread());
        Thread t3 = new Thread(new QuoteSenderThread());
        Thread t4 = new Thread(new QuoteRecieverThread());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        //Thread.sleep(5000);
        //t1.interrupt();


    }
}
