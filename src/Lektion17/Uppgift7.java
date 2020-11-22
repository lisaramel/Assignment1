package Lektion17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-21
 * Time: 09:45
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Uppgift7 extends JFrame {

    JPanel panel = new JPanel();
    JButton button = new JButton("Drag over me!");

    //class MyMouseListener implements MouseListener(){

   // }

    Uppgift7(){
        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.add(panel);
        panel.add(button);
        this.pack();
        setLocation(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button.addMouseListener(myMouseListener);
        button.setOpaque(true);
        //button.setBorderPainted(false);

    }

    MouseAdapter myMouseListener = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            button.setBackground(Color.RED);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            button.setBackground(null);
        }
    };

    public static void main(String[] args) {
        Uppgift7 u = new Uppgift7();
    }
}
