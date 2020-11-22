package Projects.AnimalHotel;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-28
 * Time: 09:32
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Animal implements IPrintOut {

    //inkapsling
    protected String name;
    protected String animal;
    protected double weight;

    public Animal(){}

    public Animal(String animal, String name, double weight){

        this.animal = animal;
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void PrintOut(){
    }
}
