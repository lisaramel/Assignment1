package Lektion04;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-25
 * Time: 14:05
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Deltagare{

 protected Student student;
 protected Kurs kurs;

Deltagare (Student student, Kurs kurs){
    this.kurs = kurs;
    this.student = student;

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student s) {
        this.student = student;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs k) {
        this.kurs = kurs;
    }
}
