package Assignment;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-28
 * Time: 09:32
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Animal implements IPrintOut {

    protected String animal;
    protected String name;
    protected double weight;

    public Animal(){}

    public Animal(String animal, String name, double weight){

        this.animal = animal;
        this.name = name;
        this.weight = weight;
    }

    public String getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void PrintOut(){
    }
}
