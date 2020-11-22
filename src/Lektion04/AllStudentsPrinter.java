package Lektion04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-25
 * Time: 12:10
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class AllStudentsPrinter {

    AllStudentsPrinter(){
        Student Anna = new Student("Anna", "8003021234");
        Student Tolvan = new Student("Tolvan", "1212121212");
        Student Pelle = new Student("Pelle", "8512159876");

        List<Student> allStudents = new ArrayList<>();
        allStudents.add(Tolvan);
        allStudents.add(Anna);
        allStudents.add(Pelle);

        Lärare Sigrun = new Lärare("Sigrun", " ");

        Kurs OOPJava = new Kurs("Objektsorientering och Java");

        OOPJava.läggTillStudenter(Pelle);
        OOPJava.läggTillStudenter(Anna);
        OOPJava.läggTillStudenter(Tolvan);
        OOPJava.läggTillLärare(Sigrun);

        Pelle.läggTillKurs(OOPJava);
        Anna.läggTillKurs(OOPJava);
        Tolvan.läggTillKurs(OOPJava);

        printStudents(allStudents);

    }

    public void printStudents(List<Student> allStudents){
        for(Student s : allStudents){
            System.out.println("Student: " + s.getNamn());
            for(Kurs k : s.getAllaKurser()){
                System.out.println("Kurs: " + k.getKursNamn());
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AllStudentsPrinter sp = new AllStudentsPrinter();



    }
}
