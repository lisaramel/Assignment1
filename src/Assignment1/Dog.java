package Assignment1;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-28
 * Time: 09:32
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Dog extends Animal{

    //inkapsling
    protected FoodType foodType;

    public Dog(String animal, String name, double weight, FoodType foodType){
        super(animal, name, weight);
        this.name = name;
        this.foodType = foodType;
    }

    public double dogPortion(double weight){

        return (weight*100)/100;
    }

    @Override
    public void PrintOut() {
        System.out.print(getName() + " ska få ");
        System.out.format("%,.1f", dogPortion(weight));
        System.out.println(" g " + FoodType.HUNDFODER.getFoodType());
    }

}
