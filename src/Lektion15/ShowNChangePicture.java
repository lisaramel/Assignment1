package Lektion15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-19
 * Time: 10:32
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class ShowNChangePicture extends JFrame implements ActionListener {

    JPanel panel;
    JPanel northPanel;
    JPanel southPanel;
    final String imagePath = "Familjejävla";
   // final String imagePath2 = "/Users/Lisa/Desktop/Java/Projekt/Familjejävla/Alice.jpg";
    Path imageFolder = Paths.get(imagePath);
    int imageNumber = 1;
    int imageCount = 0;
    JLabel imageViewer;
    JButton button;
    List<String> imageName = new ArrayList<>();

    protected List<String> allImageNames(Path imageLocation){
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(imageLocation)){
            for(Path p : stream){
                imageName.add(p.toString());
                System.out.println(p.getFileName().toString());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return imageName;
    }

    ShowNChangePicture() {

        imageName = allImageNames(imageFolder);
        imageCount = imageName.size();
        imageViewer = new JLabel(new ImageIcon(new ImageIcon(imageName.get(imageNumber)).getImage()
                .getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
        button = new JButton("~ change picture ~");
        panel = new JPanel();
        northPanel = new JPanel();
        southPanel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(button);
        this.add(panel);
        panel.add(southPanel, BorderLayout.SOUTH);
        panel.add(northPanel, BorderLayout.NORTH);
        northPanel.add(imageViewer);
        southPanel.add(button);

        button.addActionListener(this);

        setTitle("* FAMILJEJÄVLA *");
        setSize(480, 470);
        setLocation(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        imageNumber = (imageNumber + 1) % imageCount;
        imageViewer.setIcon(new ImageIcon(new ImageIcon(imageName.get(imageNumber)).getImage()
                .getScaledInstance(400, 400, Image.SCALE_DEFAULT)));

    }

    public static void main(String[] args) {
        ShowNChangePicture u = new ShowNChangePicture();

    }
}
