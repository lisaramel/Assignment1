package Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-28
 * Time: 10:09
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class HealthyPetsDemo {
    public static void main(String[] args) {


        //polymorphism
        Animal venus = new Cat("katt", "Venus", 5, FoodType.KATTFODER);
        Animal ove = new Cat("katt", "Ove", 3, FoodType.KATTFODER);
        Animal dogge = new Dog("hund", "Dogge", 10, FoodType.HUNDFODER);
        Animal sixten = new Dog("hund", "Sixten", 5, FoodType.HUNDFODER);
        Animal hypno = new Snake("orm", "Hypno", 1, FoodType.ORMPELLETS);

        List<Animal> animals = new ArrayList<>();

        animals.add(venus);
        animals.add(ove);
        animals.add(dogge);
        animals.add(sixten);
        animals.add(hypno);


        while(true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Vilket djur vill du mata?");
            String input = scan.nextLine();

            boolean animalFound = false;
            for (Animal a : animals) {
                if (a.getName().equalsIgnoreCase(input)) {
                    a.PrintOut();
                    animalFound = true;
                }
            }
            if (!animalFound) {
                System.out.print("Det här djuret finns inte incheckat på HealtyPets för tillfället.");
                System.out.println();
            }
            System.out.println();

            if(input == null)
                break;
        }
    }
}
