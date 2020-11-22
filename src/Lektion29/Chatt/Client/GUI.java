package Lektion29.Chatt.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-11
 * Time: 15:15
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class GUI extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JButton button = new JButton("Logga ut");
    JTextArea chatTextArea = new JTextArea(10, 30);
    JTextField chatTextField = new JTextField(30);

    User u = new User();

    public GUI(){

        add(panel);
        panel.add(button, BorderLayout.NORTH);
        panel.add(chatTextArea, BorderLayout.CENTER);
        panel.add(chatTextField, BorderLayout.SOUTH);
        chatTextField.setText("Skriv här ... ");
        chatTextField.setForeground(Color.GRAY);
        setSize(400, 280);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button.addActionListener(this);
        chatTextField.addActionListener(this);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            chatTextArea.setText(u.getName() + "LOGGADE UT");
            System.exit(0);
        }
    }

   //   public static void main(String[] args) {
   //     GUI g = new GUI();
   // }

}
