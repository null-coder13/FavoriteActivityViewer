package GUIControls;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageDisplay extends JLabel {
    private BufferedImage image;

    public ImageDisplay(String imageFilePath) {
        super(new ImageIcon(imageFilePath));
        setImage(imageFilePath);
    }

    public void setSize(int width, int height) {
        super.setSize(width, height);
    }

    public void setImage(String imageFilePath) {
        try {
            image = ImageIO.read(new File(imageFilePath));
        } catch (IOException | NullPointerException e) {}
        this.setIcon(new ImageIcon(imageFilePath));
    }
}
