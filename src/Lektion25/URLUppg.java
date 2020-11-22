package Lektion25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-04
 * Time: 14:40
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class URLUppg {

    public static void main(String[] args) throws MalformedURLException {

        URL gitAdress = new URL("https://github.com/dwyl/english-words/blob/master/words.txt?raw=true");

        try(BufferedReader in = new BufferedReader(new InputStreamReader(gitAdress.openStream()));) {

            int[] counter = new int[100];
            int totalWordCount = 0;

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                int size = inputLine.length();
                counter[size]++;
                totalWordCount++;
                // System.out.println(inputLine);
            }
            for (int i = 0; i < counter.length; i++) {
                if (counter[i] != 0) {
                    System.out.println("Antal ord med " + i + " tecken: \t" + counter[i]);
                }
            }
            System.out.println("Totalt antal ord: " + totalWordCount);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
