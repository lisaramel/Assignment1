package Lektion02.HederligeHarrys;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-22
 * Time: 12:08
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class MotorcykelAnnons extends FordonsAnnons implements IPublishable, IRevenuable{

    String färg;
    int motorvolym;
    String drivtyp;
    double harrysRevenue;


    MotorcykelAnnons(String rubrik, int pris, String beskrivning, int årsmodell, int antalMil, boolean begagnad, String färg, int motorvolym, String drivtyp){
        super(rubrik, pris, beskrivning, årsmodell, antalMil, begagnad);
        this.färg = färg;
        this.motorvolym = motorvolym;
        this.drivtyp = drivtyp;
        this.harrysRevenue = harrysRevenue;

    }
 /*   @Override
    public void getAnnonsText() {
        System.out.println(rubrik + "\nPris: " + pris + "\nOm: " + beskrivning + "\nÅrsmodell: " + årsmodell + "\nBegagnad: " + changeBoolean(begagnad) + "\nAntal mil: " + antalMil + "\nFärg: " + färg + "\nMotorvolym: " + motorvolym + "\nDrivtyp: " + drivtyp);
        System.out.println();
    }

  */
    public void printHeader() {
     System.out.println(getRubrik() + " " + getPris() + " kr");
 }

    public void printCompleteAd() {
        System.out.println("--------------");
        System.out.println(getRubrik() + "\nPris: " + getPris() + "\nOm: " + getBeskrivning() + "\nÅrsmodell: "
                + getÅrsmodell() + "\nBegagnad: " + changeBoolean(isBegagnad()) + "\nAntal mil: " + getAntalMil() + "\nFärg: " + färg + "\nMotorvolym: " + motorvolym + "\nDrivtyp: " + drivtyp);
    }
    public void calculateRevenue(){
        harrysRevenue = (pris / 1.25) * 0.9;
        System.out.println("Harry skulla tjäna " + (int) harrysRevenue + " kr på denna annons");
    }
}
