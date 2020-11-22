package Lektion01;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-21
 * Time: 10:05
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Person {

    private String name;
    private String adress;
    private int age;

    Person(String name, String adress, int age){
        this.name = name;
        this.adress = adress;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

