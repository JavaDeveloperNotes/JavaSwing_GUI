package my.zhamri.image;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageExample2 {

    private JFrame j;
    private BufferedImage carImage;
    private JLabel myLable;

    public ImageExample2() throws IOException {

        carImage = ImageIO.read(new File("/Volumes/Data/JavaDeveloperNotes/JavaSwing_GUI/src/main/resources/car.jpg"));
        myLable = new JLabel(new ImageIcon(carImage));
        myLable.setSize(600, 400);

        j = new JFrame("Hello World");
        j.add(myLable);
        j.setSize(600, 400);
        j.setLayout(null);
        j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
        j.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new ImageExample2();
    }
}

