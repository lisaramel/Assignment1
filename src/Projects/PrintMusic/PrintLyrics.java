package Projects.PrintMusic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-21
 * Time: 15:00
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class PrintLyrics extends JFrame implements ActionListener {

    JButton open = new JButton("Öppna");
    JButton save = new JButton("Spara");
    JButton print = new JButton("Skriv ut");
    JButton quit = new JButton("Avsluta");
    JLabel fileNameLabel = new JLabel("Filnamn: ");
    JPanel panel = new JPanel();
    JTextField textField = new JTextField(10);
    JTextArea textArea = new JTextArea(15, 50);
    JScrollPane scroll = new JScrollPane(textArea,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    protected PrintLyrics(){

        this.add(panel);
        panel.setLayout(new FlowLayout());
        add(panel, BorderLayout.NORTH);
        fileNameLabel.setFont(new Font("Bold", Font.BOLD, 14));
        textArea.setFont(new Font("Bold", Font.BOLD, 12));
        panel.add(fileNameLabel);
        panel.add(textField);
        panel.add(open);
        panel.add(save);
        panel.add(print);
        panel.add(quit);
        add(scroll, BorderLayout.CENTER);

        textField.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        print.addActionListener(this);
        quit.addActionListener(this);

        setSize(628, 330);
        setLocation(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void openFile(String fileName){
        try (FileReader read = new FileReader(fileName)){;
            textArea.read(read, null);
            } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveFile(String fileName){
        try(FileWriter writer = new FileWriter(fileName)){
            textArea.write(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == textField || ae.getSource() == open) {
            openFile(textField.getText());
        } else if (ae.getSource() == save){
            saveFile(textField.getText());
        } else if (ae.getSource() == print){
            try {textArea.print();
            }catch(Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource() == quit){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        PrintLyrics u = new PrintLyrics();

    }
}

