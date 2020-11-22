package Lektion04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-25
 * Time: 11:26
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Övning3 {

    Övning3() {
        Student Anna = new Student("Anna", "8003021234");
        Student Tolvan = new Student("Tolvan", "1212121212");
        Student Pelle = new Student("Pelle", "8512159876");

        Kurs OOPJava = new Kurs("Objektsorientering och Java");

        Deltagare d1 = new Deltagare(Anna, OOPJava);
        Deltagare d2 = new Deltagare(Tolvan, OOPJava);
        Deltagare d3 = new Deltagare(Pelle, OOPJava);


        List<Deltagare> deltagare = new ArrayList<>();
        deltagare.add(d1);
        deltagare.add(d2);
        deltagare.add(d3);

        for (Deltagare d : deltagare) {
            System.out.println(d.student);
            System.out.println(d.kurs);
        }
    }

        public static void main (String[]args){
        Övning3 nr3 = new Övning3();

    }
}