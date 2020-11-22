package Lektion16;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-20
 * Time: 11:33
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Colours extends JFrame {

    JPanel panel = new JPanel();
    JCheckBox red = new JCheckBox("Red");
    JCheckBox blue = new JCheckBox("Blue");
    JCheckBox yellow = new JCheckBox("Yellow");

    public Colours() {

        panel.setLayout(new FlowLayout());
        this.add(panel);
        panel.add(red);
        panel.add(blue);
        panel.add(yellow);
        this.pack();
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        red.addActionListener(ae -> {
            if (red.isSelected() && yellow.isSelected() && blue.isSelected())
                panel.setBackground(Color.BLACK);
            else if (red.isSelected() && yellow.isSelected())
                panel.setBackground(Color.ORANGE);
            else if (red.isSelected() && blue.isSelected())
                panel.setBackground(Color.magenta);
            else if (blue.isSelected() && yellow.isSelected())
                panel.setBackground(Color.GREEN);
            else if (yellow.isSelected())
                panel.setBackground(Color.yellow);
            else if (blue.isSelected())
                panel.setBackground(Color.blue);
            else if (red.isSelected())
                panel.setBackground(Color.red);
        });


        //yellow.addActionListener(ae -> panel.setBackground(Color.yellow));
        // blue.addActionListener(ae -> panel.setBackground(Color.blue));
    }

    public static void main(String[] args) {
        Colours c = new Colours();
    }

}
