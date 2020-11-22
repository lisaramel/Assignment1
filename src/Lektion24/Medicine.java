package Lektion24;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-03
 * Time: 10:16
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Medicine implements Runnable {

    private String medicine;
    private double perMinute;

    public Medicine(String medicine, double timesPerMinute){
        this.medicine = medicine;
        this.perMinute = (60/timesPerMinute) * 1000;
    }

    @Override
    public void run() {
        while(!Thread.interrupted()){
            try {
                Thread.sleep(Math.round(perMinute));
                System.out.println("Ta en " + medicine);
            }
            catch (InterruptedException e){
                e.printStackTrace();
                break;
            }
        }
    }
}
