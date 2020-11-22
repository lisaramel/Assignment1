package Lektion25;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-04
 * Time: 10:59
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class GenericQueueNumbers<T extends Number> implements GenericQueueInterface<T>{

    List<T> l = new LinkedList<>();


    public int size() {
        return l.size();
    }

    public void put(T t) {
        l.add(t);

    }

    public T take(int index) {
        T t1 = l.get(0);
        l.remove(index - 1);
        return t1;
    }

    public T summarizeQueue(){
        Double totalSum = 0.0;
        for (T t : l) {
            totalSum += t.doubleValue();
        }
        //System.out.println(totalSum);
        return (T) totalSum;
    }

    public void printQueue() {
        for (T t : l) {
            System.out.println(t);
        }
    }

}
