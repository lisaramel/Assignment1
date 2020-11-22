package Lektion02.HederligeHarrys;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-22
 * Time: 12:01
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class BilAnnons extends FordonsAnnons implements IPublishable, IRevenuable{

    String färg;
    boolean sommardäck;
    boolean vinterdäck;
    double harrysRevenue;

    BilAnnons(String rubrik, int pris, String beskrivning, int årsmodell, int antalMil, boolean begagnad, String färg, boolean sommardäck, boolean vinterdäck) {
        super(rubrik, pris, beskrivning, årsmodell, antalMil, begagnad);
        this.färg = färg;
        this.sommardäck = sommardäck;
        this.vinterdäck = vinterdäck;
        this.harrysRevenue = harrysRevenue;

    }


  /*  @Override
    public void getAnnonsText() {
        System.out.println(rubrik + "\nPris: " + pris + "\nOm: " + beskrivning + "\nÅrsmodell: " + årsmodell + "\nBegagnad: " + changeBoolean(begagnad) + "\nAntal mil: " + antalMil + "\nFärg: " + färg + "\nSommardäck: " + changeBoolean(sommardäck) + "\nVinterdäck: " + changeBoolean(vinterdäck));
        System.out.println();
    }
   */

    public void printHeader() {
        System.out.println(getRubrik() + " " + getPris() + " kr");
    }

    public void printCompleteAd() {
        System.out.println("--------------");
        System.out.println(getRubrik() + "\nPris: " + getPris() + "\nOm: " + getBeskrivning() + "\nÅrsmodell: " + getÅrsmodell() + "\nBegagnad: " + changeBoolean(isBegagnad()) + "\nAntal mil: " + getAntalMil() + "\nFärg: " + färg + "\nSommardäck: " + changeBoolean(sommardäck) + "\nVinterdäck: " + changeBoolean(vinterdäck));
    }
    public void calculateRevenue(){
        harrysRevenue = pris / 1.25;
        System.out.println("Harry skulla tjäna " + (int) harrysRevenue + " kr på denna annons");
    }

}
