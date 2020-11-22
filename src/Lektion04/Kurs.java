package Lektion04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-25
 * Time: 11:46
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Kurs {

    protected String kursNamn;
    protected Lärare lärare;
    protected List<Student> studenter;

    public Kurs(String kursNamn){
        this.kursNamn = kursNamn;
        studenter = new ArrayList<>();
    }

    public String getKursNamn() {
        return kursNamn;
    }

    public Lärare getLärare() {
        return lärare;
    }

    public List<Student> getStudenter() {
        return studenter;
    }

    public void läggTillStudenter(Student student){
        studenter.add(student);
    }

    public void läggTillLärare(Lärare lärare){

    }
}

