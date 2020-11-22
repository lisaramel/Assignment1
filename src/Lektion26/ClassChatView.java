package Lektion26;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-05
 * Time: 11:22
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class ClassChatView extends JFrame{

    JPanel panel = new JPanel();
    JButton button = new JButton("Koppla ner");
    JTextArea chatTextArea = new JTextArea(10, 30);
    JTextField chatTextField = new JTextField(30);

    public ClassChatView() {

        add(panel);
        panel.add(button, BorderLayout.NORTH);
        panel.add(chatTextArea, BorderLayout.CENTER);
        panel.add(chatTextField, BorderLayout.SOUTH);
        chatTextField.setText("Skriv här ... ");
        chatTextField.setForeground(Color.GRAY);
        setSize(400, 280);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

/*        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button){

                System.exit(0);
            }

            if(e.getSource() == chatTextField){
                String chatInput = chatTextField.getText();
                chatTextArea.setText(chatInput);
            }
        }*/
    }


