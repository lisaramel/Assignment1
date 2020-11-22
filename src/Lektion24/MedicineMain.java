package Lektion24;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-03
 * Time: 10:26
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class MedicineMain {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan;
        boolean go = true;
        double times = 0;

        while(go) {
            String input = JOptionPane.showInputDialog(null, "Medicintyp: ");
            if (input == null || input.length() == 0) {
                System.exit(0);
            }
        
            String perMinute = JOptionPane.showInputDialog(null, "Doser per minut:");
            if (perMinute == null || perMinute.length() == 0) {
                System.exit(0);
            }

            scan = new Scanner(perMinute);
            if(scan.hasNextDouble()){
              times = scan.nextDouble();
            }
            else{
                break;
            }

            Medicine m = new Medicine(input, times);
            Thread t = new Thread(m);
            t.start();
        }
        System.exit(0);
    }
}
