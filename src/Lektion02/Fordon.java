package Lektion02;

import java.io.PrintWriter;
import java.io.Serializable;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-22
 * Time: 10:39
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
abstract class Fordon implements Printable, Serializable {

    public int speed;
    public int weight;
    //abstract void printMe();


    public Fordon(){}

    public Fordon(int speed, int weight){

        this.speed = speed;
        this.weight = weight;

    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public void changeSpeed(int newSpeed){
        speed = newSpeed;
    }


}
