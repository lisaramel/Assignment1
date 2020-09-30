package Assignment1;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-28
 * Time: 09:33
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Snake extends Animal{


    protected FoodType foodType;

    public Snake(String animal, String name, int weight, FoodType foodType){
        super(animal, name, weight);
        this.weight = weight;
        this.name = name;
        this.foodType = foodType;

    }
    public double snakePortion(){
        return 20;
    }

    @Override
    public void PrintOut() {
        System.out.print(getName() + " ska få ");
        System.out.format("%,.1f", snakePortion());
        System.out.println(" g " + FoodType.ORMPELLETS.getFoodType());
    }
}
