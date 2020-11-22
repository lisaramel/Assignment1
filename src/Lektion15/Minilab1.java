package Lektion15;

import Lektion01.Bil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-19
 * Time: 08:27
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Minilab1 extends JFrame implements ActionListener {
    JPanel panel = new JPanel();

    //JLabel label = new JLabel("Hej");

    JLabel label1 = new JLabel("~ press a button ~");
    JLabel label2 = new JLabel(" ");

    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel centerPanel = new JPanel();
    JPanel eastPanel = new JPanel();

    JButton button1 = new JButton("Press me!");
    JButton button2 = new JButton("Press me!");
    JButton button3 = new JButton("Press me!");
    JButton button4 = new JButton("Press me!");
    JButton button5 = new JButton("Press me!");
    JButton button6 = new JButton("Press me!");

    ButtonGroup bg = new ButtonGroup();

    //JTextField text = new JTextField("start");

    JCheckBox red = new JCheckBox("Red", false);
    JCheckBox blue = new JCheckBox("Blue", false);
    JCheckBox yellow = new JCheckBox("Yellow", false);


    Minilab1(){

        //panel.setLayout(new FlowLayout());
        //panel.setLayout(new GridLayout(2, 4));
        /*

         */

        /*panel.add(northPanel, BorderLayout.NORTH);
        panel.add(southPanel, BorderLayout.SOUTH);
        panel.add(westPanel, BorderLayout.WEST);

        northPanel.add(button1);
        northPanel.add(button2);
        northPanel.add(button3);

        southPanel.add(button4);
        southPanel.add(button5);
        southPanel.add(button6);

        westPanel.add(label1);
        westPanel.add(label2);
         */

        //--------------------------

        panel.setLayout(new BorderLayout());
        northPanel.setLayout(new GridLayout(2,3));
        centerPanel.setLayout(new FlowLayout());
        //southPanel.setLayout(new GridLayout(2, 1));

        panel.add(northPanel, BorderLayout.NORTH);
        panel.add(southPanel, BorderLayout.SOUTH);
        panel.add(centerPanel, BorderLayout.CENTER);
        //panel.add(eastPanel, BorderLayout.EAST);

        northPanel.add(button1);
        northPanel.add(button2);
        northPanel.add(button3);
        northPanel.add(button4);
        northPanel.add(button5);
        northPanel.add(button6);

        southPanel.add(label1);
        //southPanel.add(text);

        centerPanel.add(red);
        centerPanel.add(blue);
        centerPanel.add(yellow);
        southPanel.add(label2);

        /*purple.add(red);
        purple.add(blue);
        green.add(blue);
        green.add(yellow);
        orange.add(red);
        orange.add(yellow);
        brown.add(red);
        brown.add(yellow);
        brown.add(blue);

         */

        //panel.add(label1);
        //panel.add(label2);
        add(panel);


        red.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);


        button1.addActionListener(this); //kopplar ihop knappen till actionPerformed
        button2.addActionListener(this); //this syftar på att actionPerformed ligger i samma klass, annars anges klassnamet den ligger i ist
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);

        //setSize(300, 300); //sätter storleken på fönster i pixlar
        //setLocation(500, 250); //sätter positionen på skärmen i pixlar
        setTitle("Press-Me Program");
        setLocationRelativeTo(null);
        setVisible(true); //gör så att fönstret faktiskt visas
        pack(); //skriver ut minsta möjlia size av fönster
        setDefaultCloseOperation(EXIT_ON_CLOSE); //stänger ner fönstret/programmet när x trycks ni


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            label1.setText("You pressed button 1!");
        } else if (e.getSource() == button2) {
            label1.setText("You pressed button 2!");
        } else if (e.getSource() == button3) {
            label1.setText("You pressed button 3!");
        } else if (e.getSource() == button4) {
            label1.setText("You pressed button 4!");
        } else if (e.getSource() == button5) {
            label1.setText("You pressed button 5!");
        } else if (e.getSource() == button6) {
            label1.setText("You pressed button 6!");
        }
        if (e.getSource() == red) {
            centerPanel.setBackground(Color.red);
            label2.setText("You choosed red");
        } else if (e.getSource() == blue) {
            centerPanel.setBackground(Color.blue);
            label2.setText("You choosed blue");
        } else if (e.getSource() == yellow) {
            centerPanel.setBackground(Color.yellow);
            label2.setText("You choosed yellow");
        }
    }

    public static void main(String[] args) {
        Minilab1 m = new Minilab1();
    }
}
