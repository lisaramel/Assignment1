package Lektion10;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-08
 * Time: 10:20
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Temp {

    public void temp() {

        List<String> tempList = new ArrayList<>();

        String tempLine;
        try {
            BufferedReader buffIn = new BufferedReader(new FileReader("temp.txt"));
            while ((tempLine = buffIn.readLine()) != null) {
                tempList.add(tempLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/*
    public int highestTemp(){


    }

    public int lowestTemp(){

    }

    public int averageTemp(){

    }

 */


}
