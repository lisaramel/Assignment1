package Lektion01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       // Lektion01.Viktklass v1 = new Lektion01.Viktklass();
       // Lektion01.Ufc u1 = new Lektion01.Ufc(v1);

        Bil b1 = new Bil("ASD123", "Nissan");
        Bil b2 = new Bil("GHT347", "Volvo");
        Bil b3 = new Bil("DTO005", "Audi");
        Bil b4 = new Bil("HTD702", "BMW");

        Bilägare c1 = new Bilägare("Lisa","Björkhagen", 27);
        Bilägare c2 = new Bilägare("Alice","Solberga", 28);
        Bilägare c3 = new Bilägare("Anton","Uppsala", 25);

        b1.ownedBy(c2);
        b2.ownedBy(c1);
        b3.ownedBy(c3);
        b4.sold();

        BilByte n = new BilByte();
        n.print(b1);
        n.print(b2);
        n.print(b3);
        n.print(b4);

    }
}
