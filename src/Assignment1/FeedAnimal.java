package Assignment1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-30
 * Time: 18:03
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class FeedAnimal extends Animal {

    protected Animal animal;

    FeedAnimal(Animal animal) {
    }

    public void feed(String input) {
        if (getName().equalsIgnoreCase(input)) {
                    PrintOut();
            }
        else
            throw new IllegalArgumentException("Det här djuret finns inte incheckat på HealtyPets för tillfället.");


    }
}

