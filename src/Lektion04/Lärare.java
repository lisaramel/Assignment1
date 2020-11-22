package Lektion04;

import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-25
 * Time: 11:49
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Lärare extends Person{

    protected List<Kurs> undervisar;

    public Lärare(String namn, String personnummer){
        super(namn, personnummer);
    }
    public String getNamn(){
        return namn;
    }
    public void läggTillUndervisaKurs(Kurs kurs){
        undervisar.add(kurs);
    }

}
