package Lektion24;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-03
 * Time: 14:04
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Producer implements Runnable{

    protected Thread t = new Thread(this);
    private String s;
    private int interval;
    private MyQueue q;
    private Object obj;
    private int prio;

    public Producer(String s, int time, MyQueue q, int prio){
        this.s = s;
        interval = time * 1000;
        this.q = q;
        this.prio = prio;
        //obj = new Object();
    }

    @Override
    public void run() {
        t.setPriority(prio);
        while(!Thread.interrupted()){
            try{
                Thread.sleep(interval);
                q.put(s);
            }catch(Exception e){
                e.printStackTrace();
                break;
            }
        }
    }
}
