package Lektion09;

import static javax.swing.JOptionPane.*;

import java.util.*;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-07
 * Time: 11:04
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class BilHyra2 {
    public static void main(String[] arg) {


        String indata = showInputDialog
                ("Ange antal dagar, pris per dag samt bilmodell");

        try {
            Scanner sc = new Scanner(indata);

            int antalDagar = sc.nextInt();
            double dagsPris = sc.nextDouble();
            String bil = sc.next();
            double totPris = dagsPris * antalDagar;

            String s = String.format("Totalt pris för %s: %.2f", bil, totPris);
            showMessageDialog(null, s);


        }catch(InputMismatchException e){
            e.printStackTrace();
            System.out.println("Endast siffror är godkända värden.");
        }
        catch(NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Ogiltig inmatning");
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Ett fel uppstod");
        }

    }
}
