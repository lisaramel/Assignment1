package Lektion26;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-06
 * Time: 15:08
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class ClassChatEntry extends JFrame implements ActionListener {

    private String name;
    private JPanel panel = new JPanel();
    private JLabel labelTitle = new JLabel("K L A S S  C H A T T E N");
    private JLabel labelName = new JLabel("Vad vill du bli kallad?");
    private JTextField textField = new JTextField(10);
    private JButton button = new JButton("LOGGA IN");


    ClassChatEntry(){

        add(panel);

        panel.add(labelTitle, BorderLayout.NORTH);
        panel.add(labelName, BorderLayout.NORTH);
        panel.add(textField, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
        setVisible(true);
        setSize(200, 160);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ClassChatEntry ce = new ClassChatEntry();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            try {
                ClassChatSender cs = new ClassChatSender("235.235.235.237", 33333);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
           // System.exit(0);
        }
    }
}
