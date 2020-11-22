package Lektion01;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-21
 * Time: 10:06
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Bil {

    private String brand;
    private String license;
    private Bilägare carOwner;

    public Bil(String license, String brand) {

        this.brand = brand;
        this.license = license;

    }

    public void ownedBy(Bilägare newOwner) {
        carOwner = newOwner;
    }

    public void sold() {
        carOwner = null;
    }

    public Bilägare getCarOwner() {
        return carOwner;
    }

    public String getLicense() {
        return license;
    }

    public String getBrand() {
        return brand;
    }


}
