package Lektion16;

import java.util.Scanner;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-07
 * Time: 08:45
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class CarGuiScanner {
    Scanner sc = new Scanner(System.in);


    public CarGuiScanner(){
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

    protected double getInParam(String promptMessage){
        while(true){
            System.out.println(promptMessage);
            if(sc.hasNextDouble()) {
                return sc.nextDouble();
            }else{
                sc.next();
            }
        }
    }

    public void mainProgram(){

        double mätarställningNu = getInParam("Mätarställning nu: ".trim());
        double mätarställningDå = getInParam("Mätarställning då: ".trim());
        double förbrukadBensin = getInParam("Bensin: ".trim());

        double mätardiff = mätarDiff(mätarställningNu, mätarställningDå);
        double bensinförbrukningPerMil = gasUsagePerMile(förbrukadBensin, mätardiff);

        System.out.println(getMilePrintOut(mätardiff));
        System.out.println(gasUsedPrintOut(förbrukadBensin));
        System.out.println(getGasPerMile(bensinförbrukningPerMil));

    }

    public static void main(String[] args) {
        CarGuiScanner cc = new CarGuiScanner();
        cc.mainProgram();
    }
}

