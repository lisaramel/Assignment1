package Lektion29.Chatt.Client;

import java.io.BufferedReader;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-11
 * Time: 11:23
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Reciever extends Thread {

    BufferedReader in;
    String prompt;

    public Reciever(){

    }

    public Reciever(BufferedReader inputReader, String prompt ){
        this.in = inputReader;
        this.prompt = prompt;
    }

    @Override
    public void run() {
        try{
            String input;
            while ((input = in.readLine()) != null) {
                System.out.println(prompt + ": " + input);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}