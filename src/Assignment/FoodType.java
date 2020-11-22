package Assignment;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-29
 * Time: 14:42
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
enum FoodType {

    HUNDFODER("hundfoder", 100), KATTFODER("kattfoder", 150), ORMPELLETS("ormpellets",20);

    protected Integer foodWeight;
    protected String foodType;

    FoodType(String foodType, int foodWeight) {
        this.foodType = foodType;
        this.foodWeight = foodWeight;
    }

    public Integer getFoodWeight() {
        return foodWeight;
    }

    public String getFoodType() {
        return foodType;
    }


}
