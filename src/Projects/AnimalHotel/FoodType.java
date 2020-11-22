package Projects.AnimalHotel;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-29
 * Time: 14:42
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */

//enum
public enum FoodType{

    HUNDFODER("hundfoder"), KATTFODER("kattfoder"), ORMPELLETS("ormpellets");

    protected String foodType;

    FoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }
}
