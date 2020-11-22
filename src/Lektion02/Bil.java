package Lektion02;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-22
 * Time: 10:40
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Bil extends Fordon implements IHjulburen{

    public int gearNumber;
    public int gearNow;
    public int wheels;

    public Bil(int speed, int weight, int gearNow, int gearNumber, int wheels){

        super(speed, weight);
        this.gearNumber = gearNumber;
        this.gearNow = gearNow;
        this.wheels = wheels;
    }

    public void changeGear(){
        }

    public void printMe(){
        System.out.println("Speed: " + getSpeed() +  " Weight: " + getWeight() + " Current gear: " + gearNow + " New gear: " + gearNumber);
    }

  //  public void printFordon(Fordon fordon){
    //    fordon.printMe();
    //}
        public void printInterface(Printable test){
            test.printMe();
        }

        public int getAntalHjul(){
          return wheels;
        }

        public void getHjulInterface(IHjulburen hjulburen){
            System.out.println("Bilen har " + wheels + " däck.");
        }

    }