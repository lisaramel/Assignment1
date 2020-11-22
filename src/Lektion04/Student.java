package Lektion04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-25
 * Time: 11:49
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Student extends Person{

    protected List<Kurs> deltarI;

    public Student(String namn, String personnummer){
        super(namn, personnummer);
        deltarI = new ArrayList<>();
    }

    public void läggTillKurs(Kurs kurs){
        deltarI.add(kurs);
    }
    public List<Kurs> getAllaKurser(){
        return deltarI;
    }
}
