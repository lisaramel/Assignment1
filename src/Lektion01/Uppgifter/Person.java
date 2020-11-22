package Lektion01.Uppgifter;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-21
 * Time: 16:08
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Person {

    private String name;
    private int age;

    public Person(){

    }

    public Person(String name, int age){

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
