package Lektion01;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-21
 * Time: 13:57
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class BilByte {
    public void print(Bil car){
        if (car.getCarOwner() == null){
            System.out.println("Bilen av modellen " + car.getBrand() + " med registreringsnummret " + car.getLicense() + " har ingen ägare.");
        }
        else
            System.out.println("Bilen av modellen " + car.getBrand() + " med registreringsnummret " + car.getLicense() + " tillhör " + car.getCarOwner().getName());
    }
}
