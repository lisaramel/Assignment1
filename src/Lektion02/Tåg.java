package Lektion02;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-22
 * Time: 10:43
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Tåg extends Fordon{

    int cartNumber;

    public Tåg(int speed, int weight, int cartNumber){
    super(speed, weight);
    this.cartNumber = cartNumber;

    }
    public void addCart(){

    }

    public void printMe(){
        System.out.println("Speed: " + speed +  " Weight: " + weight + " Number of carts: " + cartNumber);
    }
    public void printInterface(Printable test){
        test.printMe();
    }
}

