package Lektion24;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-03
 * Time: 14:04
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Consumer implements Runnable{

    protected Thread t = new Thread(this);
    private int interval;
    private MyQueue q;

    public Consumer(int time, MyQueue q){
        interval = time * 1000;
        this.q = q;

    }

    @Override
    public void run() {
    while(!Thread.interrupted()){
        try{
            Thread.sleep(interval);
            System.out.println(q.take());
            System.out.println("Prioritet: " + t.getPriority());
        }catch(Exception e){
            e.printStackTrace();
            break;
        }
    }
    }
}
