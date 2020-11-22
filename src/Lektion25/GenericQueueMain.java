package Lektion25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-04
 * Time: 10:48
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class GenericQueueMain {
    public static void main(String[] args) {

        GenericQueue g = new GenericQueue();

        /*g.put("hej");
        g.put(3);
        g.put(2.45);
        g.put("då");

        g.take(3);
        g.take(2);
        g.printQueue();

        System.out.println("Size: " + g.size());

        System.out.println();

        GenericQueueNumbers gn = new GenericQueueNumbers();
        gn.put(3);
        //gn.put("hej"); - kommer ej fungera iom att klassen är satt till Numbers
        gn.put(5);
        gn.put(2);

        gn.take(2);
        //gn.printQueue();
        //System.out.println();

        System.out.println("Size: " + gn.size());
        System.out.println("Sum: " + gn.summarizeQueue());

         */

        /*List<String> s = new ArrayList<>();
        s.add("hej");
        s.add("på");
        s.add("dig");

        List<Integer> i = new ArrayList<>();
        i.add(2);
        i.add(5);
        i.add(3);
         */

        List<String> s = Arrays.asList("sure", "yea", "ok");
        List<Integer> i = Arrays.asList(5, 7, 3);
        List<Object> o = Arrays.asList("A", "B", "C");


        GenericQueue.printList(s);
        GenericQueue.printList(i);
        GenericQueue.printList(o);

        GenericQueue.printListString(s);
        //GenericQueue.printListString(i); //- kommer ej fungera iom List<? extends String>
        //GenericQueue.printListString(o); //- kommer ej fungera iom List<? extends String>

        // GenericQueue.printList(i);

    }
}
