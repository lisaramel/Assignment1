package Lektion02.HederligeHarrys;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-24
 * Time: 11:04
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Main {
    public static void main(String[] args) {


        //HEDERLIGE HARRYS BILAR

        BilAnnons b1 = new BilAnnons("Volvo", 190000, "En Volvo i fantastiskt skick med rum för alla i familjen", 2015,
                10000, true, "Svart", false,true);
        MotorcykelAnnons m1 = new MotorcykelAnnons("Suzuki", 40000, "En Suzuki i fint skick", 2005, 30000, true, "Mörkgrön", 800, "Kedja");
        HusvagnsAnnons h1 = new HusvagnsAnnons("Husbil", 150000,"En rymlig husbil för sommarsemestern", 2011, 0,false,true, 3);
        FordonsAnnons f1 = new HusvagnsAnnons("Husbil", 150000,"En rymlig husbil för sommarsemestern", 2011, 0,false,true, 3);

        b1.printHeader();
        b1.printCompleteAd();
        System.out.println();
        b1.calculateRevenue();

        System.out.println();

        h1.printHeader();
        h1.printCompleteAd();
        System.out.println();
        h1.calculateRevenue();

        System.out.println();

        m1.printHeader();
        m1.printCompleteAd();
        System.out.println();
        m1.calculateRevenue();

    }
}
