package Lektion24;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-03
 * Time: 13:54
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class MyQueue {

    private Object obj = new Object();
    private List <Object> l = new ArrayList<>();

    public int size(){
        return l.size();
    }

    public synchronized void put(Object obj){
       // l.add(obj);
        //notify();
        int p = Thread.currentThread().getPriority();
        int i;

       // for (i=size()-1; i>=0 && p > ((Object) l.get(i)).pri; i--)
      //  ;
      //  l.add(i+1, obj);
        notify();
    }

    public synchronized Object take(){
        while (l.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                return null;
            }
        }
            Object obj = l.get(0);
            l.remove(0);
            return obj;
    }

    //public void printQueue()
}
