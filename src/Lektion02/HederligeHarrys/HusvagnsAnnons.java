package Lektion02.HederligeHarrys;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-22
 * Time: 12:03
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class HusvagnsAnnons extends FordonsAnnons implements IPublishable, IRevenuable{

    boolean dusch;
    int antalBäddar;
    double harrysRevenue;


    HusvagnsAnnons(String rubrik, int pris, String beskrivning, int årsmodell, int antalMil, boolean begagnad, boolean dusch, int antalBäddar){
        super(rubrik, pris, beskrivning, årsmodell, antalMil, begagnad);
        this.dusch = dusch;
        this.antalBäddar = antalBäddar;
        this.harrysRevenue = harrysRevenue;

    }
/*
    @Override
    public void getAnnonsText() {
        System.out.println(rubrik + "\nPris: " + pris + "\nOm: " + beskrivning + "\nÅrsmodell: " + årsmodell + "\nAntal mil: "
        + antalMil + "\nBegagnad: " + changeBoolean(begagnad) + "\nDusch: " + changeBoolean(dusch) + "\nAntal bäddar: " + antalBäddar);
        System.out.println();
    }

 */
    public void printHeader() {
    System.out.println(getRubrik() + " " + getPris() + " kr");
}

    public void printCompleteAd() {
        System.out.println("--------------");
        System.out.println(getRubrik() + "\nPris: " + getPris() + "\nOm: " + getBeskrivning() + "\nÅrsmodell: " + getÅrsmodell()
                + "\nAntal mil: " + getAntalMil() + "\nBegagnad: " + changeBoolean(isBegagnad()) + "\nDusch: " + changeBoolean(dusch) + "\nAntal bäddar: " + antalBäddar);
    }
    public void calculateRevenue(){
        harrysRevenue = pris / 1.25;
        System.out.println("Harry skulla tjäna " + (int) harrysRevenue + " kr på denna annons");
    }
}
