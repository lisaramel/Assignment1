package Lektion11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-12
 * Time: 09:47
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Uppgift9 {

    Path fileWrite = Paths.get("src/Lektion11/tallpeople.txt");
    Path fileRead = Paths.get("src/Lektion11/Personuppgifter.txt");

    public int getLength(String input){
        //vad som skrivs in i input, gås igenom. Därför
        //läses inte första raden in i personuppg.

        String[] array1 = input.split(",");
        //System.out.println(array1[0].toString());
        return Integer.parseInt(array1[2].trim());
    }

    public boolean isTwoMeterOrMore(int length){
        if(length >= 200){
            return true;
        }
        else
            return false;
    }




}
