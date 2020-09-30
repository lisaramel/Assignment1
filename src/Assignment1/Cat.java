package Assignment1;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-28
 * Time: 09:33
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Cat extends Animal{

    //inkapsling
    protected FoodType foodType;

     public Cat(String animal, String name, double weight, FoodType foodType){
        super(animal, name, weight);
        this.foodType = foodType;
    }

    public double catPortion(double weight){
        return (weight*100)/150;
    }

    @Override
    public void PrintOut() {
            System.out.print(getName() + " ska få ");
            System.out.format("%,.1f", catPortion(weight));
            System.out.println(" g " + FoodType.KATTFODER.getFoodType());
    }


}
