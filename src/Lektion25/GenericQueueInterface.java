package Lektion25;

import javax.swing.*;
import java.util.LinkedList;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-04
 * Time: 10:35
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public interface GenericQueueInterface<T>{

    public int size();

    public void put(T t);

    public Object take(int index);

}
