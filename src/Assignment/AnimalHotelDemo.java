package Assignment;

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
public class AnimalHotelDemo {

    AnimalHotelDemo() {
        Scanner scan = new Scanner(System.in);

        Animal venus = new ThisAnimalEats("katt", "Venus", 5, FoodType.KATTFODER);
        Animal ove = new ThisAnimalEats("katt", "Ove", 3, FoodType.KATTFODER);
        Animal dogge = new ThisAnimalEats("hund", "Dogge", 10, FoodType.HUNDFODER);
        Animal sixten = new ThisAnimalEats("hund", "Sixten", 5, FoodType.HUNDFODER);
        Animal hypno = new ThisAnimalEats("orm", "Hypno", 1, FoodType.ORMPELLETS);

        List<Animal> animals = new ArrayList<>();

        animals.add(venus);
        animals.add(ove);
        animals.add(dogge);
        animals.add(sixten);
        animals.add(hypno);

        System.out.println("Vilket djur vill du mata?");
        String input = scan.nextLine();

            for (Animal a : animals) {
                if (a.getName().equalsIgnoreCase(input)) {
                    a.PrintOut();
                    break;
                }

            }


    }
        public static void main (String[]args){
        AnimalHotelDemo a1 = new AnimalHotelDemo();

    }

}


