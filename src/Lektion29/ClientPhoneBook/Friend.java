package Lektion29.ClientPhoneBook;

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
    private long mobileNr;
    private String birthday;
    private String email;

    public Friend(String name, long mobileNr, String birthday, String email){
        this.name = name;
        this.mobileNr = mobileNr;
        this.birthday = birthday;
        this.email = email;
    }

    public long getMobileNr() {
        return mobileNr;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Object getInfo(){
        return "Namn: " + getName() + "\nMobil: " + getMobileNr() + "\nFödelsedag: " + getBirthday() + "\nE-mail: " + getEmail();
    }

}
