package Assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-28
 * Time: 11:51
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class ThisAnimalEats extends Animal {

    protected FoodType foodType;

    public ThisAnimalEats(String animal, String name, double weight, FoodType foodType){
        super(animal, name, weight);
        this.foodType = foodType;
    }

    public double portion(double weight){
        if(getAnimal().equals("orm")){
            return 20;
        }
        else
        return (weight*100)/foodType.getFoodWeight();
    }

    @Override
    public void PrintOut() {
        System.out.print(getName() + " ska få ");
        System.out.format("%,.1f", portion(weight));
        System.out.println(" g " + foodType.getFoodType());
    }

}
