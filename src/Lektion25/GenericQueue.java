package Lektion25;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-04
 * Time: 10:42
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class GenericQueue<T> implements GenericQueueInterface<T>{

    List<T> l = new LinkedList<>();

    @Override
    public int size() {
        return l.size();
    }

    @Override
    public void put(T t) {
        l.add(t);
    }


    @Override
    public T take(int index) {
        T t1 = l.get(0);
        l.remove(index - 1);
        return t1;
    }

    public void printQueue(){
        for(T t : l){
            System.out.println(t);
        }
    }

    public static <T> void printList(List<T> s){
        for(T print : s){
            System.out.println(print);
        }
        System.out.println();

    }

    public static void printListString(List<? extends String> s){
        for(String print : s){
            System.out.println(print);
        }
        System.out.println();

    }
}
