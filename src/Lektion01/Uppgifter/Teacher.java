package Lektion01.Uppgifter;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-21
 * Time: 16:10
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Teacher extends Person {

    private Course teachesIn;

    public Teacher(String name, int age, Course teachesIn){

        this.teachesIn = teachesIn;
        //     System.out.println(new Person().getName() + " undervisar i " + teachesIn.getCourseName());
    }
}
