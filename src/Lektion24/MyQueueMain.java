package Lektion24;

import java.util.Scanner;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-03
 * Time: 14:22
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class MyQueueMain {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        MyQueue q = new MyQueue();

        System.out.print("Hur många producenter? ");
        Producer[] p = new Producer[scan.nextInt()];

        for (int i = 0; i < p.length; i++) {
            System.out.println("Producent " + (i + 1));
            System.out.print("Vilket ord ska läggas till? ");
            System.out.flush();
            String word = scan.next();
            System.out.print("Intervall: ");
            System.out.flush();
            int timeProducer = scan.nextInt();
            System.out.print("Prioritet? ");
            System.out.flush();
            int prio = scan.nextInt();
            p[i] = new Producer(word, timeProducer, q, prio);
        }

        System.out.print("Hur många konsumenter? ");
        System.out.flush();
        Consumer[] c = new Consumer[scan.nextInt()];
        for (int i = 0; i < c.length; i++) {
            System.out.print("Intervall: ");
            System.out.flush();
            int timeConsumer = scan.nextInt();

            c[i] = new Consumer(timeConsumer, q);
        }


        for (int i = 0; i < p.length; i++)
            p[i].t.start();
        for (int i = 0; i < c.length; i++)
            c[i].t.start();

        Thread.sleep(10000);
        System.exit(0);
    }
}
