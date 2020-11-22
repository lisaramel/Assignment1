package Lektion02;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-22
 * Time: 10:43
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Båt extends Fordon{

    public int deadweight;

    public Båt(int speed, int weight, int deadweight){
    super(speed, weight);
    this.deadweight = deadweight;

    }
    public void turn(){
    }

    public void printMe(){
        System.out.println("Speed: " + getSpeed() +  " Weight: " + getWeight() + " Deadweight: " + deadweight);
    }
   // public void printFordon(Fordon fordon){
     //   fordon.printMe();
    //}
    public void printInterface(Printable test){
        test.printMe();
    }



}
