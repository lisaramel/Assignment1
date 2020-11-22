package Lektion02.HederligeHarrys;

import java.security.PublicKey;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-22
 * Time: 11:50
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class FordonsAnnons{

    String rubrik;
    int pris;
    String beskrivning;
    int årsmodell;
    int antalMil;
    boolean begagnad;

    public FordonsAnnons() {
    }

    public FordonsAnnons(String rubrik, int pris, String beskrivning, int årsmodell, int antalMil, boolean begagnad) {

        this.rubrik = rubrik;
        this.pris = pris;
        this.beskrivning = beskrivning;
        this.årsmodell = årsmodell;
        this.antalMil = antalMil;
        this.begagnad = begagnad;
    }

    public String changeBoolean(boolean changeAnswer) {
        if (changeAnswer == true)
            return "Ja";
        else
            return "Nej";
    }

 //   public void getAnnonsText(){
  //      System.out.println(rubrik + pris + beskrivning + årsmodell + antalMil + begagnad);
  //  }


    public String getRubrik() { return rubrik; }

    public int getPris() { return pris; }

    public String getBeskrivning() { return beskrivning; }

    public int getÅrsmodell() { return årsmodell; }

    public int getAntalMil() { return antalMil; }

    public boolean isBegagnad() { return begagnad; }
}



