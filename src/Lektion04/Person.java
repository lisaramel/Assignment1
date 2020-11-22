package Lektion04;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-25
 * Time: 11:53
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Person {

    protected String namn;
    protected String personnummer;

    public Person(String namn, String personnummer){
        this.namn = namn;
        this.personnummer = personnummer;
    }
    public Person(){

    }

    public String getNamn() {
        return namn;
    }
}
