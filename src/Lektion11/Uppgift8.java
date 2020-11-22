package Lektion11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-12
 * Time: 08:12
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Uppgift8 {

    String path = "src/Lektion10/temp.txt";

    public double getMaxVal(List<Double> vals) {

        double max = -Double.MAX_VALUE;

        for (Double d : vals) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public double getMinVal(List<Double> vals) {

        double min = Double.MAX_VALUE;

        for (Double d : vals) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public double getAvgVal(List<Double> vals) {
        double sum = 0;
        for (Double d : vals) {
            sum += d;
        }
        return sum / vals.size();
    }


    public double parseDouble(String val) {
        String modified = val.replace(',', '.');

        return Double.parseDouble(modified);
    }

    public List<Double> getList(String path) {
        String temp;
        List<Double> list = new ArrayList<>();

        try {
            BufferedReader buf = new BufferedReader(new FileReader(path));
            while ((temp = buf.readLine()) != null) {
                list.add(parseDouble(temp));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen kunde inte hittas.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Filen kunde inte läsas.");
            e.printStackTrace();
        }
        return list;
    }
    public void mainProgram(){
        List<Double> vals = getList(path);
        System.out.println("Max: " + getMaxVal(vals));
        System.out.println("Min: " + getMinVal(vals));
        System.out.println("Genomsnitt: " + getAvgVal(vals));

    }

    public static void main(String[] args) {
        Uppgift8 u8 = new Uppgift8();
        u8.mainProgram();
    }


}
