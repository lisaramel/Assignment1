package Lektion09;

import javax.swing.*;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-07
 * Time: 08:45
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Car2 {

    public Car2(){
    }

    public double mätarDiff(double mätarställningNu, double mätarställningDå){
        return mätarställningNu - mätarställningDå;
    }

    public double gasUsagePerMile(double gasUsedLastYear, double distanceDriven){
        return gasUsedLastYear/distanceDriven;
    }

    public String getMilePrintOut(double mileDiff) {
        return "Antal körda mil: " + mileDiff;
    }
    public String gasUsedPrintOut(double gasUsed){
        return "Antal liter bensin: " + gasUsed;
    }
    public String getGasPerMile(double gasPerMile){
        return "Förbrukning per mil: " + gasPerMile;
    }

    public void mainProgram(){
        double mätarställningNu = Double.parseDouble(JOptionPane.showInputDialog("Mätarställning nu: ").trim());
        double mätarställningDå = Double.parseDouble(JOptionPane.showInputDialog("Mätarställning då: ").trim());
        double förbrukadBensin = Double.parseDouble(JOptionPane.showInputDialog("Bensin: ").trim());

        double mätardiff = mätarDiff(mätarställningNu, mätarställningDå);
        double bensinförbrukningPerMil = gasUsagePerMile(förbrukadBensin, mätardiff);

        System.out.println(getMilePrintOut(mätardiff));
        System.out.println(gasUsedPrintOut(förbrukadBensin));
        System.out.println(getGasPerMile(bensinförbrukningPerMil));

    }

    public static void main(String[] args) {
        Car2 cc = new Car2();
        cc.mainProgram();
    }
}

