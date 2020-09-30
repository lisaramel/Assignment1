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
public class AnimalHotelDemo {

    AnimalHotelDemo() {

        Scanner scan = new Scanner(System.in);

        //polymorphism
        Cat venus = new Cat("katt", "Venus", 5, FoodType.KATTFODER);
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


        System.out.println("Vilket djur vill du mata?");
        String input = scan.nextLine();

      for (Animal a : animals) {

              if (a.getName().equalsIgnoreCase(input))
                  a.PrintOut();
        }

    }




    public static void main(String[] args) {
        AnimalHotelDemo a1 = new AnimalHotelDemo();


    }

}
