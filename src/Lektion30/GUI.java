package Lektion30;

import Lektion29.Chatt.Client.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-11
 * Time: 15:15
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class GUI extends JFrame {

    JPanel panel = new JPanel();

    public GUI() {

        Properties p = new Properties();

        try {
            p.load(new FileInputStream("src/test.properties"));
        } catch (Exception e) {
            System.out.println("Filen kunde inte hittas");
            e.printStackTrace();
        }

        add(panel);

        String mess = p.getProperty("message", "Hello");
        JLabel l = new JLabel(mess, JLabel.CENTER);
        panel.add(l);

        String fontName = p.getProperty("fontName", "BOLD");
        String fontStyle = p.getProperty("fontStyle", "Serif");
        /*
        int ifStyle;
        if(fontStyle.equals("BOLD")){
            ifStyle = Font.BOLD;
        }
        else if(fontStyle.equals("BOLD")) {
            ifStyle = Font.ITALIC;
        }
        else
            ifStyle = Font.PLAIN;

        int fontSize = Integer.parseInt(p.getProperty("fontSize", "25"));

        l.setFont(new Font(fontName, fontStyle, fontSize));
        setSize(400, 280);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

 */
    }

        public static void main (String[]args){
            GUI g = new GUI();
        }
    }

