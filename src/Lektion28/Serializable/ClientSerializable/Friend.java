package Lektion28.Serializable.ClientSerializable;

import java.io.Serializable;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-09
 * Time: 16:06
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Friend implements Serializable {

    private String name;
    private int mobileNr;
    private String birthday;
    private String email;

    public Friend(String name, int mobileNr, String birthday, String email){
        this.name = name;
        this.mobileNr = mobileNr;
        this.birthday = birthday;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getInfo(){
        return "Namn: " + name + " Mobil: " + mobileNr + " Födelsedag: " + birthday + " E-mail: " + email;
    }

    public int getMobileNr() {
        return mobileNr;
    }
}
