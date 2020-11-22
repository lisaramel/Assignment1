package Lektion02;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-22
 * Time: 09:08
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Main {

    public void printList(List<Fordon> fordon) {
        fordon.forEach(f -> f.printMe());
        }


        Main(){
            Serialization s = new Serialization();

            Fordon f1 = new Bil(70, 1860, 4,3, 4);
            Bil c1 = new Bil(70, 1860, 4,3, 4);
            Tåg t1 = new Tåg(100, 3000, 3);
            Båt b1 = new Båt(60, 1700,  100);

            List<Fordon> fordon = new ArrayList<>();
            fordon.add(f1);
            fordon.add(b1);
            fordon.add(c1);
            fordon.add(t1);

            s.fordonToSerializedList(fordon, "f.ser");

            List<Fordon> f = s.fordonDeSerializedList();
            printList(f);
    }


    public static void main(String[] args) throws Exception{

        Main m = new Main();

        //FORDON LEKT. 2 OCH 3

    /*    Fordon f1 = new Bil(70, 1860, 4,3, 4);
        Bil c1 = new Bil(70, 1860, 4,3, 4);
        Tåg t1 = new Tåg(100, 3000, 3);
        Båt b1 = new Båt(60, 1700,  100);

        c1.printMe();
        t1.printMe();
        b1.printMe();
        f1.printMe();

        b1.printInterface(b1);
        c1.printInterface(c1);
        t1.printInterface(t1);

        c1.getAntalHjul();




        IHjulburen c2 = new Bil(70, 1860, 4,3, 4);
        c1.getHjulInterface(c2);

        // ------------------------------

        /*List<Fordon> fordon = new ArrayList<>();
        //fordon.add(f1);
        fordon.add(b1);
        fordon.add(c1);
        fordon.add(t1);


        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("f.ser"));

        for(Fordon f : fordon){
        out.writeObject(fordon);
        out.flush();
        }

        System.out.println("Success");

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.ser"));
        Fordon f = (Fordon)in.readObject();
        System.out.println("Test");

        in.close()
        ;

         */

    }
}
