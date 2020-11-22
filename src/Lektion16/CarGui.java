package Lektion16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-07
 * Time: 08:45
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class CarGui extends JFrame implements ActionListener {

    Scanner scan = new Scanner(System.in);
    JPanel panel = new JPanel();
    JPanel westPanel = new JPanel();
    JPanel eastPanel = new JPanel();
    JPanel southPanel = new JPanel();

    JLabel mätarställningNuLabel = new JLabel("Mätarställning nu: " + "\n");
    JLabel mätarställningDåLabel = new JLabel("Mätarställning då: ");
    JLabel bensinAnvändLabel = new JLabel("Bensin: ");
    JLabel kördaMil = new JLabel(" ");
    JLabel literBensin = new JLabel(" ");
    JLabel förbrukning = new JLabel(" ");

    JTextField mätarställningNuText = new JTextField(30);
    JTextField mätarställningDåText = new JTextField(30);
    JTextField bensinAnvändText = new JTextField(30);


    public CarGui() {

        this.add(panel);
        westPanel.setLayout(new GridLayout(3, 1));
        eastPanel.setLayout(new GridLayout(3, 1));
        southPanel.setLayout(new GridLayout(1, 3));
        panel.add(westPanel, BorderLayout.WEST);
        panel.add(eastPanel, BorderLayout.EAST);
        panel.add(southPanel, BorderLayout.SOUTH);

        westPanel.add(mätarställningNuLabel);
        westPanel.add(mätarställningDåLabel);
        westPanel.add(bensinAnvändLabel);

        eastPanel.add(mätarställningNuText);
        eastPanel.add(mätarställningDåText);
        eastPanel.add(bensinAnvändText);

        southPanel.add(kördaMil);
        southPanel.add(literBensin);
        southPanel.add(förbrukning);

        mätarställningNuText.addActionListener(this);
        mätarställningDåText.addActionListener(this);
        bensinAnvändText.addActionListener(this);

        setSize(600, 150);
        setLocation(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static double mätarDiff(double mätarställningNu, double mätarställningDå) {
        return mätarställningNu - mätarställningDå;
    }

    public static double gasUsagePerMile(double gasUsedLastYear, double distanceDriven) {
        return gasUsedLastYear / distanceDriven;
    }

    public static void main(String[] args) {
        CarGui cg = new CarGui();

    }

    @Override
    public void actionPerformed(ActionEvent actionE) {
        if (actionE.getSource() == mätarställningDåText || actionE.getSource() ==
                mätarställningNuText || actionE.getSource() == bensinAnvändText) {
            Scanner mätarställningNuScan = new Scanner(mätarställningNuText.getText());
            Scanner mätarställningDåScan = new Scanner(mätarställningDåText.getText());
            Scanner bensinAnvändScan = new Scanner(bensinAnvändText.getText());
            if (mätarställningDåScan.hasNextDouble() && mätarställningNuScan.hasNextDouble()
                    && bensinAnvändScan.hasNextDouble()) {
                double inputMätarställningNu = mätarställningNuScan.nextDouble();
                double inputMätarställningDå = mätarställningDåScan.nextDouble();
                double inputBensinAnvänd = bensinAnvändScan.nextDouble();
                kördaMil.setText(String.format("Antal körda mil: %8.0f \n", mätarDiff(inputMätarställningNu, inputMätarställningDå)));
                literBensin.setText(String.format("Antal liter bensin: %8.1f \n", inputBensinAnvänd));
                förbrukning.setText(String.format("Förbrukning per mil: %1.2f \n", gasUsagePerMile(inputMätarställningNu, inputMätarställningDå)));
            }
        }
    }
}

